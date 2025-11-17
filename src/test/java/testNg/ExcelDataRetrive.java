package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataRetrive {
	@Test (dataProvider = "Retriver")
	public void login(String Uname,String Pass) {
		System.out.println("UserName : "+Uname+" Password : "+Pass);
	}
	@DataProvider(name = "Retriver")
	public Object[][] ExcelData() throws IOException{
		FileInputStream fileInput = new FileInputStream(new File("./src/test/resources/TESTDATA2.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("DATA");
		int rows = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		Object[][] obj = new Object[rows][col];
		for(int i=1;i<=rows;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<col;j++) {
				obj[i-1][j] = row.getCell(j).toString();
			}
		}
		workbook.close();
		return obj;
	}
}
