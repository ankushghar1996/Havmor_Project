
package Com_Utility_Havmor;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
 
import Com_LoginPage_POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BaseClass_ZSM {
 
    public static WebDriver driver;
    public static Excel_Data_Provider_Havmor excel;
    public WebDriverWait wait;
 
    // OTP polling defaults (adjust if required)
    private static final int OTP_TIMEOUT_SECONDS = 30;
    private static final int OTP_POLL_INTERVAL_SECONDS = 3;
 
    // ---------- HAVMOR_UAT DB connection (updated) ----------
    private static final String DB_URL = "jdbc:sqlserver://10.60.139.9:1433;databaseName=HaveMore_UAT;encrypt=true;trustServerCertificate=true";
    private static final String DB_USER = "10420SQL";
    private static final String DB_PASS = "Password@#$2025";
 
    // Query specifics — using exact query you requested
    private static final String EXACT_QUERY = "Select * from UsersMaster where UserId='HeeraParivarAdmin'";
 
    @BeforeSuite
    public void beforeSuite() throws Exception {
        // initialize excel provider if you use it for username/password
        excel = new Excel_Data_Provider_Havmor();
        // initialize report if you have ObjectRepo_Havmor
        try {
            ObjectRepo_Havmor.initializeReport();
        } catch (Exception e) {
            // ignore if not present
        }
    }
 
    @BeforeMethod
    public void openbrowser() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://havmoruat.hspldms.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ObjectRepo_Havmor.driver = driver;
 
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
 
        // Initialize login page elements (assumes you have LoginPage POM)
        LoginPage loginelements = PageFactory.initElements(driver, LoginPage.class);
 
        // Enter username & password using excel (adjust indexes if needed)
        Liabrary_Havmor.custom_Sendkeys(loginelements.getUsername(), excel.getStringdata2("Sheet1", 3, 0), "UserName Field");
        Thread.sleep(800);
        Liabrary_Havmor.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata2("Sheet1", 3, 1), "Password Field");
        Thread.sleep(1500);
 
        // Click Continue to trigger OTP generation
        wait.until(ExpectedConditions.elementToBeClickable(loginelements.getContinue()));
        Liabrary_Havmor.custom_click(loginelements.getContinue(), "Continue Btn");
 
        // small wait for backend to create token
        Thread.sleep(1000);
 
        // Fetch token from DB (polling) using exact query you provided
        String otp = fetchTokenFromDBWithPolling(OTP_TIMEOUT_SECONDS, OTP_POLL_INTERVAL_SECONDS);
 
        if (otp == null) {
            throw new RuntimeException("OTP (Token) not found in DB for UserId='HeeraParivarAdmin' using exact query on Havmor_UAT.");
        }
 
        // Enter OTP and click LOGIN (assumes POM element names)
        Liabrary_Havmor.custom_Sendkeys(loginelements.getTxtOTP(), otp, "OTP Field");
        Thread.sleep(600);
        wait.until(ExpectedConditions.elementToBeClickable(loginelements.getVerify_OTP()));
        Liabrary_Havmor.custom_click(loginelements.getVerify_OTP(), "Verify OTP Btn");
 
        // wait for homepage load (adjust locator/wait as per your app)
        Thread.sleep(2000);
    }
 
    // Poll the DB until token found or timeout
    private String fetchTokenFromDBWithPolling(int timeoutSeconds, int pollIntervalSeconds) {
        long endTime = System.currentTimeMillis() + timeoutSeconds * 1000L;
        while (System.currentTimeMillis() < endTime) {
            String token = fetchTokenFromDB();
            if (token != null && !token.isEmpty()) {
                return token;
            }
            try {
                Thread.sleep(pollIntervalSeconds * 1000L);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        return null;
    }
 
    // Fetch token using your exact query "Select * from UsersMaster where UserId='HeeraParivarAdmin'"
    private String fetchTokenFromDB() {
        String token = null;
 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException cnfe) {
            System.err.println("JDBC driver not found.");
            cnfe.printStackTrace();
            return null;
        }
 
        // Set login timeout so connection doesn't hang forever
        java.sql.DriverManager.setLoginTimeout(10); // seconds
 
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(EXACT_QUERY)) {
 
            if (rs.next()) {
                // read Token column
                String raw = null;
                try {
                    raw = rs.getString("Token");
                } catch (Exception e) {
                    // if column name differs, try first column
                    raw = rs.getString(1);
                }
 
                if (raw != null) {
                    raw = raw.trim();
                    // Extract digits only (accept 4-8 digits). If OTP always 6 digits, change regex to "\\d{6}"
                    String digits = raw.replaceAll("\\D+", "");
                    if (digits.matches("\\d{4,8}")) {
                        token = digits;
                    } else if (raw.matches("\\d{4,8}")) {
                        token = raw;
                    } else {
                        token = null; // not a valid OTP-like value
                    }
                }
            }
 
        } catch (java.sql.SQLTimeoutException toe) {
            System.err.println("DB connection timed out: " + toe.getMessage());
            toe.printStackTrace();
        } catch (java.sql.SQLException se) {
            System.err.println("SQLException while fetching token: " + se.getMessage());
            se.printStackTrace();
        } catch (Exception ex) {
            System.err.println("Unexpected error while fetching token: " + ex.getMessage());
            ex.printStackTrace();
        }
 
        return token;
    }
 
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        try {
            if (driver != null) driver.quit();
        } catch (Exception e) {
            // ignore
        }
    }
 
    @AfterSuite
    public void afterSuite() {
        try {
            ObjectRepo_Havmor.finalizeReport();
        } catch (Exception e) {
            // ignore if not present
        }
    }
}
 
