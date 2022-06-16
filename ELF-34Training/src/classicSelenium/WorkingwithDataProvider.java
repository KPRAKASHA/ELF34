package classicSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingwithDataProvider {
@Test(dataProvider="TestData")
public void login(String fn, String ln, String sur){
	System.out.println(fn);
	System.out.println(ln);
	System.out.println(sur);
		
}
@DataProvider(name="TestData")
	public  Object[][] datap() {
	
		Object[][] data=new Object[3][3];
		data[0][0]="Ram";
		data[0][1]="shiva";
		data[0][2]="Ramu";
		data[1][0]="shivaa";
		data[1][1]="Ramuu";
		data[1][2]="shivaa";
		data[2][0]="Ramaa";
		data[2][1]="shivaa";
		data[2][2]="Ramuu";
		return data;
	}
}

