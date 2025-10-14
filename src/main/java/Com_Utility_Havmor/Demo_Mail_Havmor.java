package Com_Utility_Havmor;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FileUtils;

public class Demo_Mail_Havmor {

    public static void main(String[] args) {
        String reportPath = (args != null && args.length > 0) ? args[0] : null;
        sendReportEmail(reportPath);
    }

    public static void sendReportEmail(String reportFilePath) {
        System.out.println("=== Preparing to send Email with Extent report ===");

        // Resolve report file path
        Path reportPath;
        if (reportFilePath != null && !reportFilePath.trim().isEmpty()) {
            reportPath = Paths.get(reportFilePath);
        } else {
            String workspace = System.getenv("WORKSPACE");
            if (workspace == null || workspace.trim().isEmpty()) workspace = System.getProperty("user.dir");
            reportPath = Paths.get(workspace, "test-output", "Extent_Reports", "TestReport.html");
        }

        if (!Files.exists(reportPath)) {
            System.err.println("❌ Report not found: " + reportPath.toAbsolutePath());
            return;
        }

        // Zip report for backup
        String zipPath;
        try {
            zipPath = zipReport(reportPath.toAbsolutePath().toString());
        } catch (IOException e) {
            System.err.println("❌ Failed to zip report: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Read HTML content to embed in email body
        String htmlContent;
        try {
            htmlContent = FileUtils.readFileToString(reportPath.toFile(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("❌ Failed to read HTML report content: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Fetch SMTP credentials (from Jenkins)
        String smtpUser = System.getenv("SMTP_USER");
        String smtpPass = System.getenv("SMTP_PASS");

        if (smtpUser == null || smtpPass == null) {
            System.err.println("ERROR: SMTP_USER or SMTP_PASS not set in Jenkins environment.");
            System.err.println("→ Go to Jenkins Job → Configure → Build Environment → Bind credentials as:");
            System.err.println("   Username Variable: SMTP_USER");
            System.err.println("   Password Variable: SMTP_PASS");
            return;
        }

        try {
            System.out.println("Using SMTP user: " + smtpUser);

            HtmlEmail email = new HtmlEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator(smtpUser, smtpPass));
            email.setStartTLSEnabled(true);
            email.setStartTLSRequired(true);
            email.setSSLOnConnect(false);
            email.setFrom(smtpUser);

            email.setSubject("Automation Test Execution Report - Jenkins Build");

            // Set the HTML report as the message body (colorful if client allows)
            email.setHtmlMsg(htmlContent);

            // Fallback plain text message
            email.setTextMsg("Hi Team,\n\nThe latest automation report is attached.\nPlease open 'TestReport.html' in your browser to view full details.\n\nRegards,\nAutomation Jenkins Job");

            // Add recipients
            email.addTo("ankush.gharsele@heerasoftware.com");
            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("roopali.kulkarni@heerasoftware.com");

            // Attach the full HTML report file
            EmailAttachment htmlAttachment = new EmailAttachment();
            htmlAttachment.setPath(reportPath.toAbsolutePath().toString());
            htmlAttachment.setDisposition(EmailAttachment.ATTACHMENT);
            htmlAttachment.setName("TestReport.html");
            email.attach(htmlAttachment);

            // Also attach zipped report
            EmailAttachment zipAttachment = new EmailAttachment();
            zipAttachment.setPath(zipPath);
            zipAttachment.setDisposition(EmailAttachment.ATTACHMENT);
            zipAttachment.setName(Paths.get(zipPath).getFileName().toString());
            email.attach(zipAttachment);

            System.out.println("Connecting to smtp.office365.com ...");
            email.send();

            System.out.println("✅ Email sent successfully with HTML body + attachments: " + zipPath);

        } catch (Exception e) {
            System.err.println("❌ Email sending failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

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

        System.out.println("✅ Report zipped successfully: " + zipFilePath);
        return zipFilePath;
    }
}
