package AdvanceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FirefoxfoxTest {
	WebDriver driver;
	@BeforeClass
	public void openFirefox(){
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver=new FirefoxDriver();		
	}
	
	@AfterClass
	public void closeFirefox(){
		driver.close();
	}
 
}
