package Com_Utility_Havmor;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo_Mail_Havmor {

    public static void main(String[] args) {
        // Example main for local run - will try to find report in current workspace
        String defaultReport = System.getProperty("user.dir") + File.separator
                + "test-output" + File.separator + "Extent_Reports" + File.separator + "TestReport.html";
        sendReportEmail(defaultReport);
    }

    /**
     * Sends the report email. Accepts the exact path to the HTML report (ensures it was flushed).
     */
    public static void sendReportEmail(String reportHtmlPath) {
        System.out.println("======= Sending Email with Latest Extent Report and OneDrive Link =======");

        // 1) Workspace fallback
        String workspace = System.getenv("WORKSPACE");
        if (workspace == null || workspace.trim().isEmpty()) {
            workspace = System.getProperty("user.dir");
        }

        File reportFile = new File(reportHtmlPath);
        if (!reportFile.exists()) {
            // Try default workspace path
            reportFile = new File(workspace + File.separator + "test-output" + File.separator + "Extent_Reports" + File.separator + "TestReport.html");
        }

        if (!reportFile.exists()) {
            System.err.println("❌ Report HTML not found. Tried path(s): ");
            System.err.println(" - provided: " + reportHtmlPath);
            System.err.println(" - workspace default: " + workspace + File.separator + "test-output" + File.separator + "Extent_Reports" + File.separator + "TestReport.html");
            return;
        }

        // Quick sanity: ensure file has some content
        if (reportFile.length() < 1024) {
            System.err.println("❌ Report HTML seems too small/empty: " + reportFile.getAbsolutePath() + " (size=" + reportFile.length() + ")");
            return;
        }

        // 2) Zip the HTML file (backup)
        String zipPath = null;
        try {
            zipPath = zipReportSingleFile(reportFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("❌ Failed to zip report: " + e.getMessage());
            zipPath = null;
        }

        // 3) Optional: Copy ZIP to shared OneDrive folder (local OneDrive sync)
        String oneDriveLink = "https://heerasoftware0.sharepoint.com/..."; // keep your actual link
        String sharedDrivePath = "C:\\Users\\10277\\OneDrive - Heera Software Private Limited (HSPL)\\Automation_Report";
        String copiedPath = "Not copied";
        if (zipPath != null) {
            try {
                copiedPath = copyToSharedFolder(zipPath, sharedDrivePath);
            } catch (IOException e) {
                System.err.println("❌ Failed to copy ZIP to shared folder: " + e.getMessage());
                copiedPath = "Copy failed. Check logs.";
            }
        } else {
            copiedPath = "ZIP creation failed";
        }

        // 4) Prepare and send email
        try {
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);

            // IMPORTANT: don't hardcode credentials in production. Use Jenkins credential store / vault.
            String smtpUser = "qaautomation@heerasoftware.com";
            String smtpPass = "F.922060763339uy"; // <<< replace with secure retrieval method

            email.setAuthenticator(new DefaultAuthenticator(smtpUser, smtpPass));
            email.setStartTLSEnabled(true);
            email.setStartTLSRequired(true);
            email.setSSLOnConnect(false);
            email.setFrom(smtpUser);
            email.setSubject("Automation Test Execution Report - Latest OneDrive Link + Backup Attachment");

            StringBuilder body = new StringBuilder();
            body.append("Hi Team,\n\n");
            body.append("The latest Automation Test Report is attached for quick viewing (HTML). If your mail client blocks HTML attachments, please extract the attached ZIP (backup).\n\n");
            body.append("🔗 OneDrive Link: ").append(oneDriveLink).append("\n");
            body.append("📂 Copied To: ").append(copiedPath).append("\n\n");
            body.append("Regards,\nAutomation Team");

            email.setMsg(body.toString());

            // Add recipients - keep as your list
            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("ankush.gharsele@heerasoftware.com");
            email.addTo("roopali.kulkarni@heerasoftware.com");

            // Attach the HTML (preferred for quick view)
            EmailAttachment htmlAttach = new EmailAttachment();
            htmlAttach.setPath(reportFile.getAbsolutePath());
            htmlAttach.setDisposition(EmailAttachment.ATTACHMENT);
            htmlAttach.setName(reportFile.getName());
            email.attach(htmlAttach);

            // Attach ZIP backup if available
            if (zipPath != null) {
                EmailAttachment zipAttach = new EmailAttachment();
                zipAttach.setPath(zipPath);
                zipAttach.setDisposition(EmailAttachment.ATTACHMENT);
                zipAttach.setName(new File(zipPath).getName());
                email.attach(zipAttach);
            }

            email.send();
            System.out.println("✅ Email sent successfully with HTML and ZIP backup!");
        } catch (Exception e) {
            System.err.println("❌ Failed to send email: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Zip a single file (HTML) to a sibling .zip file and return path to zip.
     */
    public static String zipReportSingleFile(String filePath) throws IOException {
        String zipFilePath = filePath.replaceAll("\\.html?$", ".zip");
        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zipOut = new ZipOutputStream(fos);
             FileInputStream fis = new FileInputStream(new File(filePath))) {
            ZipEntry zipEntry = new ZipEntry(new File(filePath).getName());
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
        }
        System.out.println("✅ Report zipped: " + zipFilePath);
        return zipFilePath;
    }

    /**
     * Copy ZIP file to a local OneDrive-synced folder (for cloud upload).
     */
    public static String copyToSharedFolder(String sourcePath, String sharedDrivePath) throws IOException {
        File sourceFile = new File(sourcePath);
        Path targetDir = Paths.get(sharedDrivePath);
        Path targetPath = targetDir.resolve(sourceFile.getName());

        Files.createDirectories(targetDir); // Ensure folder exists
        Files.copy(sourceFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("✅ Report copied to shared folder: " + targetPath);
        return targetPath.toString();
    }
}
