package AdvanceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTestCase_multiple_browerwithTestcase {
	@Test(threadPoolSize=2, invocationCount=4)
	public void LoginTestCase(){
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zomato.com/");
		driver.close();
		
	}
	@Test
	public void demo(){
		System.out.println("demo");
	}
}

