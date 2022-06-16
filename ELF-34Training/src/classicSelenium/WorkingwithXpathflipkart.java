package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithXpathflipkart {
  public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	String email="prakashasit17@gmail.com";
	String pwd="Prakash@17";
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(email);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}
