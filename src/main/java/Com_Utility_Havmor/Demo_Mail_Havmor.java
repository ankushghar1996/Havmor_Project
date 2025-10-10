package Com_Utility_Havmor;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.time.Instant;
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
     * Sends the report email. This version attaches ONLY the ZIP (no HTML).
     * It creates a lock file after successful send to avoid duplicate emails.
     */
    public static void sendReportEmail(String reportHtmlPath) {
        System.out.println("======= Sending Email (ZIP only) with OneDrive Link =======");

        // Workspace fallback
        String workspace = System.getenv("WORKSPACE");
        if (workspace == null || workspace.trim().isEmpty()) {
            workspace = System.getProperty("user.dir");
        }

        // Lock file to avoid duplicate sends across processes
        Path lockFile = Paths.get(workspace, "test-output", "report_sent.lock");
        try {
            if (Files.exists(lockFile)) {
                System.out.println("Report already sent (lock found at " + lockFile + "). Skipping email.");
                return;
            }
        } catch (Exception e) {
            System.err.println("Warning: could not check lock file: " + e.getMessage());
        }

        // Resolve HTML report file
        File reportFile = new File(reportHtmlPath);
        if (!reportFile.exists()) {
            reportFile = new File(workspace + File.separator + "test-output" + File.separator + "Extent_Reports" + File.separator + "TestReport.html");
        }

        if (!reportFile.exists()) {
            System.err.println("❌ Report HTML not found. Aborting email. Tried: " + reportHtmlPath);
            return;
        }

        if (reportFile.length() < 1024) {
            System.err.println("❌ Report HTML seems too small/empty: " + reportFile.getAbsolutePath() + " (size=" + reportFile.length() + ")");
            return;
        }

        // Zip the HTML file (we will attach only the ZIP)
        String zipPath;
        try {
            zipPath = zipReportSingleFile(reportFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("❌ Failed to zip report. Aborting email: " + e.getMessage());
            e.printStackTrace(System.err);
            return;
        }

        // Copy ZIP to shared OneDrive folder (optional)
        String oneDriveLink = "https://heerasoftware0.sharepoint.com/..."; // your real link
        String sharedDrivePath = "C:\\Users\\10277\\OneDrive - Heera Software Private Limited (HSPL)\\Automation_Report";
        String copiedPath = "Not copied";
        try {
            copiedPath = copyToSharedFolder(zipPath, sharedDrivePath);
        } catch (IOException e) {
            System.err.println("❌ Failed to copy ZIP to shared folder (continuing to email): " + e.getMessage());
            copiedPath = "Copy failed. Check logs.";
        }

        // Prepare and send email (attach only ZIP)
        try {
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);

            // IMPORTANT: use secure credential retrieval in production
            String smtpUser = "qaautomation@heerasoftware.com";
            String smtpPass = "REPLACE_WITH_SECURE_PASS"; // retrieve from Jenkins / vault

            email.setAuthenticator(new DefaultAuthenticator(smtpUser, smtpPass));
            email.setStartTLSEnabled(true);
            email.setStartTLSRequired(true);
            email.setSSLOnConnect(false);

            email.setFrom(smtpUser);
            email.setSubject("Automation Test Execution Report - ZIP Backup");

            StringBuilder body = new StringBuilder();
            body.append("Hi Team,\n\n");
            body.append("The latest Automation Test Report is attached as a ZIP file. Please download and extract before opening the TestReport.html.\n\n");
            body.append("🔗 OneDrive Link (backup): ").append(oneDriveLink).append("\n");
            body.append("📂 Copied To (if copy succeeded): ").append(copiedPath).append("\n\n");
            body.append("Regards,\nAutomation Team");

            email.setMsg(body.toString());

            // Add recipients
            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("ankush.gharsele@heerasoftware.com");
            email.addTo("roopali.kulkarni@heerasoftware.com");

            // Attach only the ZIP (preferred for corporate clients)
            EmailAttachment zipAttach = new EmailAttachment();
            zipAttach.setPath(zipPath);
            zipAttach.setDisposition(EmailAttachment.ATTACHMENT);
            zipAttach.setName(new File(zipPath).getName());
            email.attach(zipAttach);

            System.out.println("📨 Attempting to send email with ZIP only...");
            email.send();
            System.out.println("✅ Email sent successfully (ZIP only).");

            // Create lock file to prevent duplicates (contains timestamp)
            try {
                Files.createDirectories(lockFile.getParent());
                String content = "sent at " + Instant.now().toString();
                Files.write(lockFile, content.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
                System.out.println("✅ Created lock file: " + lockFile.toString());
            } catch (Exception ex) {
                System.err.println("⚠️ Could not create lock file: " + ex.getMessage());
            }

        } catch (Exception e) {
            System.err.println("❌ Failed to send email: " + e.getClass().getName() + " - " + e.getMessage());
            e.printStackTrace(System.err);
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
