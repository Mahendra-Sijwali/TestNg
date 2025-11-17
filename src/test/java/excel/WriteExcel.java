package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fileInput = new FileInputStream(new File("./src/test/resources/TESTDATA.xlsx"));
		Workbook workbook = null;
		workbook = WorkbookFactory.create(fileInput);
		Sheet sheet = workbook.getSheet("DATA");
		int totalRows = sheet.getLastRowNum();
		for(int i=1;i<=totalRows;i++) {
			sheet.getRow(i).createCell(2,CellType.STRING).setCellValue("Passed");
		}
		FileOutputStream fileOutput = new FileOutputStream(new File("./src/test/resources/TESTDATA.xlsx"));
		workbook.write(fileOutput);
		workbook.close();
	}
}
