package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream(new File("./src/test/resources/TESTDATA.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("DATA");
		int rows = sheet.getLastRowNum();
		System.out.println("Total rows : "+sheet.getLastRowNum());
		for(int i = 0; i<=rows;i++) {
			int last = sheet.getRow(i).getLastCellNum();
			int first = sheet.getRow(i).getFirstCellNum();
			for(int j=first;j<=last-1;j++) {
				try{
					if(sheet.getRow(i).getCell(j).getCellType()==CellType.STRING) {
						System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
					}
					else if(sheet.getRow(i).getCell(j).getCellType()==CellType.NUMERIC) {
						System.out.print(sheet.getRow(i).getCell(j).getNumericCellValue()+" ");
					}
				}
				catch(NullPointerException e) {
					System.out.print("NuLL ");
				}
				
//				System.out.print(sheet.getRow(i).getCell(j).toString()+" ");
			}
			System.out.println();
			
		}
		workbook.close();
	}
}
