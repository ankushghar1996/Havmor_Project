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
        System.out.println("=== Preparing to send Jenkins Email with Zipped Report ===");

        // Resolve report path
        Path reportPath;
        if (reportFilePath != null && !reportFilePath.trim().isEmpty()) {
            reportPath = Paths.get(reportFilePath);
        } else {
            String workspace = System.getenv("WORKSPACE");
            if (workspace == null || workspace.trim().isEmpty()) workspace = System.getProperty("user.dir");
            reportPath = Paths.get(workspace, "test-output", "Extent_Reports", "TestReport.html");
        }

        if (!Files.exists(reportPath)) {
            System.err.println("❌ Report not found at: " + reportPath.toAbsolutePath());
            return;
        }

        // Create ZIP
        String zipPath;
        try {
            zipPath = zipReport(reportPath.toAbsolutePath().toString());
        } catch (IOException e) {
            System.err.println("❌ Failed to zip report: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Jenkins Credentials
        String smtpUser = System.getenv("SMTP_USER");
        String smtpPass = System.getenv("SMTP_PASS");

        if (smtpUser == null || smtpPass == null) {
            System.err.println("ERROR: SMTP_USER or SMTP_PASS not set in Jenkins environment.");
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

            // Email Subject and Body
            email.setSubject("Automation Test Execution Report - Jenkins Build");
            String msg = """
                    Hi Team,

                    The latest Automation Test Report (zipped) has been attached with this email.
                    Please extract and open 'TestReport.html' in a browser to view the detailed colorful report.

                    ✅ Report Summary:
                    • Environment: QA
                    • Execution Type: Smoke Suite
                    • Triggered From: Jenkins

                    Regards,
                    Automation QA Team
                    """;
            email.setMsg(msg);

            // Recipients
            email.addTo("ankush.gharsele@heerasoftware.com");
            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("roopali.kulkarni@heerasoftware.com");

            // Attach only ZIP
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(zipPath);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setDescription("Automation Test Report (Zipped)");
            attachment.setName("TestReport.zip");
            email.attach(attachment);

            System.out.println("📤 Sending mail via smtp.office365.com ...");
            email.send();

            System.out.println("✅ Email sent successfully (ZIP only): " + zipPath);

        } catch (Exception e) {
            System.err.println("❌ Email sending failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // === Zips the HTML report into .zip ===
    public static String zipReport(String filePath) throws IOException {
        File inFile = new File(filePath);
        if (!inFile.exists()) throw new FileNotFoundException("Report not found: " + filePath);

        String zipFilePath = filePath.replaceAll("\\.html?$", ".zip");
        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zipOut = new ZipOutputStream(fos);
             FileInputStream fis = new FileInputStream(inFile)) {

            ZipEntry zipEntry = new ZipEntry(inFile.getName());
            zipOut.putNextEntry(zipEntry);

            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            zipOut.closeEntry();
        }

        System.out.println("📦 Report zipped successfully: " + zipFilePath);
        return zipFilePath;
    }
}
