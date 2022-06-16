package FileuploadTopics_02_jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwith_ParentToswitch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prakash/Downloads/iframe.html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//a[text()='INDIA']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.quit();
	}
}

//https://snowcityblr.com/contact-us/