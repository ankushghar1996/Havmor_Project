package Com_Utility_Havmor;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportGenrator_Havmor {

	
	public static ExtentReports extent;
	public static ExtentReports extentreport() {
		
		String reportpath=System.getProperty("user.dir")+"\\Reports\\Index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter (reportpath);
		reporter.config().setDocumentTitle("Test Execution Report");
		reporter.config().setReportName("Automation Test Report For Online DMS");
		reporter.config().setTheme(Theme.DARK);
				
		 extent=new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Browser Name", "Chrome");
		 extent.setSystemInfo("QA Name", "Ankush Gharsele");
		 extent.setSystemInfo("Environment", "QA Environment");
		 
		 
		 return extent;
	}
	
	
}
