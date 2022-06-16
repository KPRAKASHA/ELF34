package FileuploadTopics_02_jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snowcitypage11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("fhttps://snowcityblr.com/contact-us/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='icon navigate-icon']")).click();
	}

}
