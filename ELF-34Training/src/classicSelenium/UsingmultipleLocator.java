package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingmultipleLocator {
   public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Prakash/Downloads/LocatorsPractice.html");
	WebElement UN=driver.findElement(By.className("username"));
	UN.sendKeys("Prakash");
	WebElement PWD=driver.findElement(By.className("password"));
	PWD.sendKeys("prakasha@17");
	WebElement checkbox=driver.findElement(By.className("checkbox"));
	checkbox.click();
	WebElement radio=driver.findElement(By.name("a"));
	radio.click();
	WebElement radio1=driver.findElement(By.name("b"));
	radio1.click();
	Thread.sleep(2000);
	WebElement btn=driver.findElement(By.className("button"));
	btn.click();
	Thread.sleep(2000);
	driver.findElement(By.tagName("a")).click();
	driver.close();
     }
   
 }
