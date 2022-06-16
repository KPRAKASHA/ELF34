package Jun01_06_22DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithCopyandPaste {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement EmailID=driver.findElement(By.xpath("//input[@name='email']"));
		EmailID.sendKeys("Prakash");
		Thread.sleep(1000);
		EmailID.sendKeys(Keys.CONTROL+"a");
		EmailID.sendKeys(Keys.CONTROL+"x");
		WebElement PWD=driver.findElement
				(By.xpath("/input[@id='pass']"));
		Thread.sleep(1000);
		PWD.sendKeys(Keys.CONTROL+"v");

	}
}
 