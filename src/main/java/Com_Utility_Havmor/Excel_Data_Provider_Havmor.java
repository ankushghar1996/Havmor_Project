package Com_Utility_Havmor;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;





public class Excel_Data_Provider_Havmor {

	
private XSSFWorkbook wb;
	
	public  Excel_Data_Provider_Havmor() throws Exception {
		String Excel_path=System.getProperty("user.dir")+"\\Excel_TestData\\Excel_Havmor.xlsx";
		
		File f=new File(Excel_path);
		FileInputStream file=new FileInputStream(f);
		wb=new XSSFWorkbook(file);
	}
	
/*
	 public ExcelDataProvider() throws IOException {
	        
	        String excelPath = System.getProperty("user.dir") + File.separator + "Excel_TestData" + File.separator + "login_credential.xlsx";
	        
	        File file = new File(excelPath);

	       
	        try (FileInputStream fis = new FileInputStream(file)) {
	            wb = new XSSFWorkbook(fis);  
	        } catch (IOException e) {
	           
	            e.printStackTrace();
	            throw e;  
	        }
	    }
	*/
	
	public  String getStringdata(String sheetname,int rownum,int cellnum) {
		return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
}
	
	
	public String getStringdata2(String sheetname, int rownum, int cellnum) {
	    XSSFSheet sheet = wb.getSheet(sheetname);
	    if (sheet == null) {
	        throw new RuntimeException("❌ Sheet not found: " + sheetname);
	    }

	    Row row = sheet.getRow(rownum);
	    if (row == null) {
	        throw new RuntimeException("❌ Row " + rownum + " not found in sheet: " + sheetname);
	    }

	    Cell cell = row.getCell(cellnum);
	    if (cell == null) {
	        return "";  // Empty cell
	    }

	    switch (cell.getCellType()) {
	        case STRING:
	            return cell.getStringCellValue();

	        case NUMERIC:
	            if (DateUtil.isCellDateFormatted(cell)) {
	                return cell.getDateCellValue().toString();
	            } else {
	                double numericValue = cell.getNumericCellValue();
	                if (numericValue == (long) numericValue) {
	                    return String.valueOf((long) numericValue); // integer
	                } else {
	                    return String.valueOf(numericValue); // decimal
	                }
	            }

	        case BOOLEAN:
	            return String.valueOf(cell.getBooleanCellValue());

	        case FORMULA:
	            return cell.getCellFormula();

	        default:
	            return "";
	    }
	}


	
	
	
	
	/*
	
	public String getStringdata2(String sheetname, int rownum, int cellnum) {

	    Cell cell = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);

	    if (cell == null) {

	        return "";  // Return empty if cell is null

	    }

	    switch (cell.getCellType()) {

	        case STRING:

	            return cell.getStringCellValue();

	        case NUMERIC:

	            return String.valueOf((int) cell.getNumericCellValue());

	        default:

	            return "";

	    }

	}
 
	*/
	
	
	public  String get_Date(String sheetname,int rownum,int cellnum) {
		Date date= wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getDateCellValue();
		DateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
		return simple.format(date);
	}

	public String getNumericdata(String sheetname,int rownum,int cellnum) {
		 Double d=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
return String.format("%.0f", d);

	}
	
	
	
	public Object[][] getAllData(String sheetName) {
	    int rowCount = wb.getSheet(sheetName).getPhysicalNumberOfRows();
	    int colCount = wb.getSheet(sheetName).getRow(0).getLastCellNum();

	    Object[][] data = new Object[rowCount - 1][colCount];

	    for (int i = 1; i < rowCount; i++) {
	        for (int j = 0; j < colCount; j++) {
	            Cell cell = wb.getSheet(sheetName).getRow(i).getCell(j);
	            data[i - 1][j] = (cell != null) ? cell.toString() : "";
	        }
	    }
	    return data;
	}

	
	
	
	
	
	
	

	
}
