package Com_Utility_Havmor;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

import java.io.*;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo_Mail_Havmor {

    public static void main(String[] args) {
        String reportPath = (args != null && args.length > 0) ? args[0] : null;
        sendReportEmail(reportPath);
    }

    public static void sendReportEmail(String reportFilePath) {
        System.out.println("=== Preparing to send Jenkins Email with Zipped Extent Report ===");

        // Resolve path of main report file
        Path reportPath;
        if (reportFilePath != null && !reportFilePath.trim().isEmpty()) {
            reportPath = Paths.get(reportFilePath);
        } else {
            String workspace = System.getenv("WORKSPACE");
            if (workspace == null || workspace.trim().isEmpty()) {
                workspace = System.getProperty("user.dir");
            }
            reportPath = Paths.get(workspace, "test-output", "Extent_Reports");
        }

        if (!Files.exists(reportPath)) {
            System.err.println("❌ Report not found at: " + reportPath.toAbsolutePath());
            return;
        }

        // === Zip the entire Extent_Reports folder ===
        String zipPath;
        try {
            zipPath = zipReport(reportPath.toAbsolutePath().toString());
        } catch (IOException e) {
            System.err.println("⚠ Failed to zip report: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Jenkins credentials (should be set in environment)
        String smtpUser = System.getenv("SMTP_USER");
        String smtpPass = System.getenv("SMTP_PASS");

        if (smtpUser == null || smtpPass == null) {
            System.err.println("⚠ ERROR: SMTP_USER or SMTP_PASS not set in Jenkins environment.");
            return;
        }

        try {
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator(smtpUser, smtpPass));
            email.setStartTLSEnabled(true);
            email.setStartTLSRequired(true);
            email.setSSLOnConnect(false);
            email.setFrom(smtpUser);

            // Subject & body
            email.setSubject("Automation Test Execution Report - Jenkins Build");

            String msg = "Hi Team,\n\n"
                    + "The latest Automation Test Report (Zipped) has been attached with this email.\n"
                    + "Please extract and open 'TestReport.html' in a browser to view the detailed clickable report.\n\n"
                    + "📋 Report Summary:\n"
                    + "• Environment: QA\n"
                    + "• Execution Type: Smoke Suite\n"
                    + "• Triggered From: Jenkins\n\n"
                    + "Regards,\nAutomation QA Team";

            email.setMsg(msg);

            // Recipients
            email.addTo("ankush.gharsele@heerasoftware.com");
            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("roopali.kulkarni@heerasoftware.com");

            // Attach zipped report
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(zipPath);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setDescription("Extent Automation Report (Zipped)");
            attachment.setName("Extent_Reports.zip");
            email.attach(attachment);

            System.out.println("📨 Sending email via smtp.office365.com ...");
            email.send();

            System.out.println("✅ Email sent successfully (ZIP attached): " + zipPath);

            
        } catch (Exception e) {
            System.err.println("❌ Email sending failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // === Zips the entire Extent_Reports folder ===
    public static String zipReport(String reportFilePath) throws IOException {
        File reportFile = new File(reportFilePath);
        File reportFolder = reportFile.getParentFile();  // e.g. Extent_Reports folder
        String zipFilePath = reportFolder.getParent() + File.separator + "Extent_Reports.zip";

        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zos = new ZipOutputStream(fos)) {
            zipDirectory(reportFolder, reportFolder.getName(), zos);
        }

        System.out.println("✅ Folder zipped successfully: " + zipFilePath);
        return zipFilePath;
    }

    // Recursive helper for zipping folder contents
    private static void zipDirectory(File folderToZip, String basePath, ZipOutputStream zos) throws IOException {
        File[] files = folderToZip.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                zipDirectory(file, basePath + "/" + file.getName(), zos);
                continue;
            }

            try (FileInputStream fis = new FileInputStream(file)) {
                ZipEntry zipEntry = new ZipEntry(basePath + "/" + file.getName());
                zos.putNextEntry(zipEntry);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = fis.read(bytes)) >= 0) {
                    zos.write(bytes, 0, length);
                }
            }
        }
    }
}
