package Com_Utility_Havmor;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Confiq_Data_Provider_Havmor {

	
	private Properties pro;
	public  Confiq_Data_Provider_Havmor() throws Exception {
		String confiqpath=System.getProperty("user.dir")+"\\Confiq_TestData\\Confiq.properties";
		File f =new File(confiqpath);
		FileInputStream file=new FileInputStream(f);
		pro=new Properties();
		pro.load(file);
	}
	
	
	public String get_BaseURL() { 
		return pro.getProperty("Testing_URL");
	}
//	public String get_CPA_username() { 
//		return pro.getProperty("CPA_Username");
//	}
//	public String get_cpa_password() { 
//		return pro.getProperty("CPA_pass");
//	}
//	public String get_Browser_name() { 
//		return pro.getProperty("Browser");
//	}
	
	
}
	
	
	

	
	
	
	
	
	
	
	
	
	
	

