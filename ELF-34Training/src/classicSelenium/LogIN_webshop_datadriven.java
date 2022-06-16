package classicSelenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogIN_webshop_datadriven {
	@Test(dataProvider="TestData")
	public void TestCase(String Email,String password) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()){
			System.out.println("Pass:user is logged successful");
		}
		else{
			System.out.println("Fail:user is not logged");
		}
		driver.close();
	}
	@DataProvider(name="TestData",parallel=true)
	public Object[][] datap()throws EncryptedDocumentException, IOException{
		return WorkingMultireadDatadriven.data1("Sheet3");
	}
}
