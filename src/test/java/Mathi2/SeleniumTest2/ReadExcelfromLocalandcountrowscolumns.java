package Mathi2.SeleniumTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelfromLocalandcountrowscolumns {
	@Test
	
	public void ReadWriteExcelTest() throws IOException
	{
		
		/*FileInputStream excel=new FileInputStream("C:/Users/IBM_ADMIN/Documents/Selenium/SeleniumTest.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(excel);
		XSSFSheet Sheet=wb.getSheet("Credentials");
		XSSFRow row= Sheet.getRow(0);
		
		int ColNum=row.getLastCellNum();
		System.out.println("Total Number of Columns in excel:"+ColNum);
		int cell=Sheet.getLastRowNum()+1;
		System.out.println("Total Number of rows in excel:"+cell);*/
		FileInputStream excel=new FileInputStream("C:/Users/IBM_ADMIN/Documents/Selenium/SeleniumTest.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(excel);
		XSSFSheet sheet = wb.getSheet("Credentials");
		XSSFRow row=sheet.getRow(0);
		int column = row.getLastCellNum();
		int rows=sheet.getLastRowNum()+1;
		System.out.println("No.of. Columns:" + column);
		System.out.println("No.of. Rows:"+rows);
			
		
	}

}
