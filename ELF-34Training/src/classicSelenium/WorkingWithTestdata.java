package classicSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithTestdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File file=new File("./testdata/Testdata.xlsx");
		FileInputStream files=new FileInputStream(file);
		Workbook workbook =WorkbookFactory.create(files);
		Sheet sheet=workbook.getSheet("Sheet1");
		System.out.println(sheet.getRow(2).getCell(0).getNumericCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(4).getBooleanCellValue());
		System.out.println(sheet.getRow(2).getCell(3).getStringCellValue());
		//System.out.println(sheet.getRow(2).getCell(4).toString());
		
	
	}
}
