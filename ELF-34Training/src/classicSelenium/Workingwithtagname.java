package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithtagname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prakash/Downloads/LocatorsPractice.html");
		WebElement UN=driver.findElement(By.tagName("input"));
		UN.sendKeys("Prakash");
		
		WebElement Link=driver.findElement(By.tagName("a"));
		Link.click();
		driver.close();

	}

}
