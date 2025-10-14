package Com_Utility_Havmor;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;

import java.io.*;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo_Mail_Havmor {

    // backward-compatible main if needed locally
    public static void main(String[] args) {
        String argPath = (args != null && args.length > 0) ? args[0] : null;
        sendReportEmail(argPath);
    }

    /**
     * Sends email with zipped HTML report.
     * If reportFilePath is null, fallback to WORKSPACE or user.dir.
     */
    public static void sendReportEmail(String reportFilePath) {
        System.out.println("======= Preparing to send Email with Extent report =======");

        // Determine report path robustly
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
            try {
                Path dir = reportPath.getParent();
                if (dir != null && Files.exists(dir)) {
                    System.out.println("Listing " + dir + ":");
                    Files.list(dir).forEach(p -> System.out.println(" - " + p.getFileName()));
                }
            } catch (Exception ignored) {}
            return;
        }

        // Zip the report
        String zipPath;
        try {
            zipPath = zipReport(reportPath.toAbsolutePath().toString());
        } catch (IOException e) {
            System.err.println("❌ Failed to zip report: " + e.getMessage());
            e.printStackTrace();
            return;
        }

        // Get SMTP creds from env (set in Jenkins credentials, don't hardcode)
        String smtpUser = System.getenv("SMTP_USER");
        String smtpPass = System.getenv("SMTP_PASS");
        if (smtpUser == null || smtpPass == null) {
            System.err.println("❌ SMTP_USER or SMTP_PASS not found in environment. Configure credential binding in Jenkins and use variable names SMTP_USER & SMTP_PASS.");
            return;
        }

        try {
            System.out.println("SMTP user present: " + smtpUser);
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator(smtpUser, smtpPass));
            email.setStartTLSEnabled(true);
            email.setStartTLSRequired(true);
            email.setSSLOnConnect(false);
            email.setFrom(smtpUser);

            email.setSubject("Automation Test Execution Report - Latest");
            String body = "Hi Team,\n\nThe latest Automation Test Report is attached (zipped).\n\nFile: " +
                    Paths.get(zipPath).getFileName().toString() + "\n\nRegards,\nAutomation Team";
            email.setMsg(body);

            // Add recipients - update if needed
            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("ankush.gharsele@heerasoftware.com");
            email.addTo("roopali.kulkarni@heerasoftware.com");

            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(zipPath);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setName(Paths.get(zipPath).getFileName().toString());
            email.attach(attachment);

            System.out.println("Attempting to send email via smtp.office365.com with user: " + smtpUser);
            email.send();
            System.out.println("✅ Email sent successfully with attachment: " + zipPath);
        } catch (Exception e) {
            System.err.println("❌ Failed to send email: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static String zipReport(String filePath) throws IOException {
        File inFile = new File(filePath);
        if (!inFile.exists()) throw new FileNotFoundException("Report file not found: " + filePath);

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
        System.out.println("✅ Report zipped: " + zipFilePath);
        return zipFilePath;
    }
}
