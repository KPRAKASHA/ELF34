package POM_project;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.ReporterConfig;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import AdvanceSelenium.BaseTest;
import AdvanceSelenium.Working_with_propertyfile;
import classicSelenium.WorkingMultireadDatadriven;

public class LoginTC extends BaseTest {
	@Test(dataProvider="testData")
	public void  TC_01(String email,String pwd) throws IOException{
		driver.get("http://demowebshop.tricentis.com/");
		WelCome welcome=new WelCome(driver);
		welcome.clickLogin();
		LoginPage login=new LoginPage(driver);
		login.Entermail(email);
		login.enterpwd(pwd);
		login.clicklogin();
		Homepage home=new Homepage(driver);
		if(home.getLogout_Link().isEnabled()){
		  Reporter.log("Pass:user is logged in",true);
		  home.LogoutClick();
			  
		  }
		}
	
	
	@DataProvider(name="testData")
	public Object[][] data() throws EncryptedDocumentException, IOException {
	 return WorkingMultireadDatadriven.data1("login");
	 
	}
}
