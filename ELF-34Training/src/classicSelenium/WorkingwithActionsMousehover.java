package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithActionsMousehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/"); 
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).build().perform();
		// act.moveToElement(driver.findElement(By.xpath("//a[@data-group='women']"))).build().perform();
		Thread.sleep(3000);
		// act.click(driver.findElement(By.xpath("(//a[text()='T-Shirts'])[1]"))).build().perform();
		//Thread.sleep(3000);
		act.click(driver.findElement(By.xpath("//a[text()='Casual Shirts']"))).build().perform();

	}




}


