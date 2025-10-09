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
        sendReportEmail();
    }
    
    public static void sendReportEmail() {
        System.out.println("======= Sending Email with Latest Extent Report and OneDrive Link =======");
        // Step 1: Path to the HTML report (updated path from Jenkins workspace)
        String workspace = System.getenv("WORKSPACE"); // Jenkins auto-sets this
        String reportPath = workspace + "\\test-output\\Extent_Reports\\TestReport.html";
        // Step 2: Zip the report file
        String zipPath;
        try {
            zipPath = zipReport(reportPath);
        } catch (IOException e) {
            System.err.println("❌ Failed to zip report: " + e.getMessage());
            return;
        }

        // OneDrive shared folder URL (update as per your OneDrive)
        String oneDriveLink = "https://heerasoftware0.sharepoint.com/sites/QATeam/Shared%20Documents/Forms/AllItems.aspx?id=%2Fsites%2FQATeam%2FShared%20Documents%2FQA%20Shared%20Folder&viewid=efe5bcf8%2De44d%2D4de2%2Db0cd%2D8ac68543bb53&p=true&ga=1";
        // Local OneDrive folder path where ZIP will be copied
        String sharedDrivePath = "C:\\Users\\10277\\OneDrive - Heera Software Private Limited (HSPL)\\Automation_Report";
        String copiedPath;
        // Step 3: Copy ZIP to OneDrive folder (for backup & easy access)
        try {
            copiedPath = copyToSharedFolder(zipPath, sharedDrivePath);
        } catch (IOException e) {
            System.err.println("❌ Failed to copy ZIP to shared folder: " + e.getMessage());
            System.out.println("📌 Please manually check OneDrive link: " + oneDriveLink);
            copiedPath = "❌ Copy failed. Refer logs.";
        }
 
        // Step 4: Prepare and send email with attachment and OneDrive link
        try {
            MultiPartEmail email = new MultiPartEmail();
            email.setHostName("smtp.office365.com");
            email.setSmtpPort(587);
            email.setAuthenticator(new DefaultAuthenticator("qaautomation@heerasoftware.com", "F.922060763339uy"));  // <-- Replace password here
            email.setStartTLSEnabled(true);
            email.setStartTLSRequired(true);
            email.setSSLOnConnect(false);
            email.setFrom("qaautomation@heerasoftware.com");
            email.setSubject("Automation Test Execution Report - Latest OneDrive Link + Backup Attachment");
            // Email body with dynamic details
            email.setMsg("Hi Team,\n\n"
                    + "The latest Automation Test Report has been uploaded to OneDrive.\n\n"
                    + "🔗 OneDrive Link: " + oneDriveLink + "\n\n"
                    + "📄 File Name: " + new File(zipPath).getName() + "\n"
                    + "📂 Copied To: " + copiedPath + "\n\n"
                    + "Also attached as a backup.\n\n"
                    + "Regards,\nAutomation Team");
 
            // Add recipients
            email.addTo("aniket.jadhav@heerasoftware.com");
            email.addTo("ankush.gharsele@heerasoftware.com");
            email.addTo("roopali.kulkarni@heerasoftware.com");
//         			email.addTo("mahesh.kulkarni@heerasoftware.com");
//         			email.addTo("santosh.dhoot@heerasoftware.com");
//         			email.addTo("snehalata.patil@heerasoftware.com");
//	           email.addTo("jidnyesh.borse@heerasoftware.com");
////            // email.addTo("rohit.deshpande@heerasoftware.com");

 
            // Attach the ZIP report
            EmailAttachment attachment = new EmailAttachment();
            attachment.setPath(zipPath);
            attachment.setDisposition(EmailAttachment.ATTACHMENT);
            attachment.setName(new File(zipPath).getName());
            email.attach(attachment);
 
            // Send the email
            email.send();
            System.out.println("✅ Email sent successfully with OneDrive link and attachment!");
        } catch (Exception e) {
            System.err.println("❌ Failed to send email: " + e.getMessage());
        }
    }
 
    // Zip the HTML report file
    public static String zipReport(String filePath) throws IOException {
        String zipFilePath = filePath.replace(".html", ".zip");
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
 
    // Copy ZIP file to OneDrive folder (local folder synced with cloud)
    public static String copyToSharedFolder(String sourcePath, String sharedDrivePath) throws IOException {
        File sourceFile = new File(sourcePath);
        Path targetDir = Paths.get(sharedDrivePath);
        Path targetPath = targetDir.resolve(sourceFile.getName());
 
        Files.createDirectories(targetDir); // Make sure folder exists
        Files.copy(sourceFile.toPath(), targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("✅ Report copied to shared folder: " + targetPath);
        return targetPath.toString();
    }
}
