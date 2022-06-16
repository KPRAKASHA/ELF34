package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithSelectmethods {
 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select sortdropdown=new Select(dropdown);
		sortdropdown.selectByVisibleText("Name: A to Z");
	    sortdropdown.selectByVisibleText("Name:Z to A");
	    sortdropdown.selectByVisibleText("Price:Low to High");
	    sortdropdown.selectByVisibleText("Price:High to Low");
	    sortdropdown.selectByVisibleText("Created on");
	    sortdropdown.selectByVisibleText("Position");
	}
}
