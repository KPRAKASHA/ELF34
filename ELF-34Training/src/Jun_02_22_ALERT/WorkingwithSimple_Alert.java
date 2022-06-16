package Jun_02_22_ALERT;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithSimple_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		Thread.sleep(2000);
		//driver.close();                             //org.openqa.selenium.UnhandledAlertException:
		                                               //so that using 
		
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.close();
		
		
		
			}
	

}
