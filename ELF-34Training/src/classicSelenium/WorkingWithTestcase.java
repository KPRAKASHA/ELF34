package classicSelenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithTestcase {
 @Test(dataProvider="TestData")
   public void LoginTestcase(String MoviesName,String ReleaseYear){
	 System.out.println(MoviesName);
	 System.out.println(ReleaseYear);
 }
  @DataProvider(name="TestData")
  public Object test() throws EncryptedDocumentException, IOException{
	return WorkingMultireadDatadriven.data1("Sheet2");
  }
 
}
