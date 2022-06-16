package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithDemowebshop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		List<WebElement> ab=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<ab.size();i++)
		{
			ab.get(i).click();
		}
		driver.close();
	}
  
}     
 
