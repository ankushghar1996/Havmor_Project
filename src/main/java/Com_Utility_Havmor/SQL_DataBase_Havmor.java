package Com_Utility_Havmor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class SQL_DataBase_Havmor {
 
	
    public static Connection getConnection() throws Exception {
        // Database credentials
        //Write Query For jdbc Sql
        String url = "";// jdbc:mysql://localhost:3306/your_database
        String username = "Rohit";//your_username
        String password = "Fosroc@5";//your_password
        
        
        // Connect to the database
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }
    
 
    public static String getDataFromDatabase(String query) throws Exception {
 
        // Create a connection
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        // Execute the query
        ResultSet resultSet = statement.executeQuery(query);
        String result = "";
        // Extract data from result set
        if (resultSet.next()) {
            result = resultSet.getString(1); // Assuming you want the first column
        }
 
        // Close connection
        connection.close();
        return result;
 
    }
}
 
/*
 
//show 1 to 10 of 30 (1909 Pages)
 
	String text =	driver.findElement(By.xpath("//div[Contains(text(),'Pages')]")).getText();
	//  Integer.parseInt() ---- convert string into the Integer
		int Total_Pages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		//	5
		// repeating pages
					//		5
		for(int p = 1; p<= Total_Pages; p++ )
		{
			if(p>1)
			{
			WebElement	active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
			active_page.click();
			}
			// reading data
		int noOfRows = driver.findElements(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr")).size();
			for(int r=1; r< noOfRows; r++)
			{
			//	driver.findElement(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr[1]/td[2]")).getText();
				String custmor_name =driver.findElement(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr["+r+"]/td[2]")).getText();
				String email =driver.findElement(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr["+r+"]/td[3]")).getText();
				String status =driver.findElement(By.xpath("//table[@class='table table-borded table-hover']//tbody//tr["+r+"]/td[5]")).getText();

				System.out.println(custmor_name+"\t"+email+"\t"+status);
			}
		}

	}*/	