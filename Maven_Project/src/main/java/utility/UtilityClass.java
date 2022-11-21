package utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook.*;



import base.BaseClass;

public class UtilityClass extends BaseClass{

	
	public static String getDatafromPropertyFile(String key) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream myfile= new
		FileInputStream("C:\\Users\\Cresen\\eclipse-workspace\\Maven_Project\\config.Property");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
		
	}
	
	
	public static String TestData_Sheet_path="C:\\Users\\Cresen\\Desktop\\EngagemateExcel.xlsx";
	 

		static Workbook book;
		static Sheet sheet;
		public static Object[][] getTestData(String sheetname)
		{
			FileInputStream file =null;
		
			try {
				file = new FileInputStream(TestData_Sheet_path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				book =WorkbookFactory.create(file);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			sheet = book.getSheet(sheetname);
			
			Object[][]data= new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			
			for (int i = 0; i < sheet.getLastRowNum(); i++) {
				
				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
					
					data[i][k] = sheet.getRow(i +1).getCell(k).toString();
				}
			}
		
		return data;
	}
	
	
	
	/*
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
	File myfile= new File("C:\\Users\\Cresen\\Desktop\\EngagemateExcel.xlsx");
	Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	String value = mySheet.getRow(row).getCell(cell).getStringCellValue();
	return value;
	
	}*/
	
	
//	public static void captureScreenshot()
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest= new File("C:\\Users\\Cresen\\Pictures\\Screenshots\\EngagaemateScreenshots.png");
//		FileHandler.copy(src, dest);
//		
//		
//	}

	/*
	public static void getDatafromExcel() throws IOException 
	{
		String ExcelPath="C:\\Users\\Cresen\\Downloads\\EngagemateExcel.xlsx";
		FileInputStream inputStream = new FileInputStream(ExcelPath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		//using for loop
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		for (int i=0;i<=rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell = row.getCell(j);
				switch(cell.getCellType())
				{
				case STRING:System.out.println(cell.getStringCellValue());break;
				case NUMERIC:System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.println(cell.getBooleanCellValue());break;
				}
				
			}
			System.out.println();
		}
		
	
	
	
	}*/	
}
