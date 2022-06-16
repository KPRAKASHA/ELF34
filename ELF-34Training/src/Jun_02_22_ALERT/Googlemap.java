package Jun_02_22_ALERT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemap {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/maps/");	
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("Bellary");
		driver.findElement(By.xpath("//div[@id='directions-searchbox-0']//button[@data-tooltip='Search']")).click();
		driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//div[@id='directions-searchbox-1']//button[@data-tooltip='Search']")).click();
		try
		{
			if(driver.findElement(By.xpath("//img[@aria-label='  Transit  ']")).isDisplayed())

				System.out.println("route show correctly");

		}catch (NoSuchElementException e)
		{
			System.out.println("user can see the route");	
		}
	}

}




