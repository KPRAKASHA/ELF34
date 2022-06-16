package Jun01_06_22DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Workingwith_Select_deleteAction_inthe_Emailfield {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		
		WebElement Emailfield = driver.findElement(By.xpath("//input[@id='email']"));
		Emailfield.sendKeys("prakash");
		Thread.sleep(1000);
		Emailfield.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		Emailfield.sendKeys(Keys.BACK_SPACE); ////here don't use perform action
		                                          // copy ,paste
	 
		

	}

}
