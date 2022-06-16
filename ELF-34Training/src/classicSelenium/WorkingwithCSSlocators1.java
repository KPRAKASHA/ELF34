package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithCSSlocators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.contains("Demo")){
			System.out.println("Demoweb shop open");
		}
		driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Books");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		try{
			if(driver.findElement(By.cssSelector("input[value='computer']")).isDisplayed()){
				System.out.println("Pass:search page is successful");

			}
		}
		catch(NoSuchElementException e){
			System.out.println("Fail: search page is unsuccessful ");
		}
	}

}
