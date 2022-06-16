package Jun_01_06_22HandlingMultpliWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithOpenClosewindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		String PW=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> CW=driver.getWindowHandles();
		for(String a:CW){
			if(!(a.equals(PW))){
				driver.switchTo().window(a);				
				driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
			}

		}
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("prakashaaa");
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("prakashaaasit17@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Prakash#@117");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().window(PW);
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		driver.quit();



	}

}
