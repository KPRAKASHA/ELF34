package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithCSSlocators {

	public static void main(String[] args)  {

		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://file///C:/Users/Prakash/Downloads/LocatorsPractice.html");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[class='username']")).sendKeys("prakash");
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("prakash@17");
		driver.findElement(By.cssSelector("input[class='checkbox']")).click();
		driver.findElement(By.cssSelector("input[name='a']")).click();
		driver.findElement(By.cssSelector("input[value='cancel']")).click();
		driver.close();
	}
}
