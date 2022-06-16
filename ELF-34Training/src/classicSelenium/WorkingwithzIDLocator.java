package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithzIDLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("prakash");
		driver.findElement(By.id("LastName")).sendKeys("kurubh");
		driver.findElement(By.id("Email")).sendKeys("prakashasit17@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("prakash@17");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("prakash@17");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
