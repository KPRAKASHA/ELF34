package classicSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingMultireadDatadriven {

	public static Object[][] data1(String Sheet)throws EncryptedDocumentException, IOException {

		File file=new File("./testdata/Testdata.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet1=wb.getSheet(Sheet);

		int RowCount=sheet1.getPhysicalNumberOfRows();
		int ColCount=sheet1.getRow(1).getPhysicalNumberOfCells();

		Object[][] data=new Object[RowCount-1][ColCount];
		for (int i = 1; i <RowCount ; i++) {
			for (int j = 0; j < ColCount; j++) {
				data[i-1][j]=sheet1.getRow(i).getCell(j).toString();	
			}

		}
		
		
		/*for (int i = 0; i <RowCount-1 ; i++) {
			for (int j = 0; j < ColCount; j++) {
				System.out.println(data[i][j]);
			}
		}*/
		return data;
	}
}
