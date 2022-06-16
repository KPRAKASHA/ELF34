package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithCSSlocatorsFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[rel='async']")).click();
		Thread.sleep(2000);
		String FN="prakash";
		driver.findElement(By.cssSelector("input[placeholder='First name']")).sendKeys(FN);
		String LN="kurub";
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(LN);
		String mob="7411188996";
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys(mob);
		String pwd="prakasha";
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys(pwd);
		driver.close();
	}

}
