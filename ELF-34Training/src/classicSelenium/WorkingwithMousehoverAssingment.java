package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithMousehoverAssingment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Computer')])[1]"))).build().perform();
		Thread.sleep(1000);
		//act.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).click().build().perform();
		act.click(driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"))).build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.xpath("//a[text()='Build your own cheap computer']"))).build().perform();
		Thread.sleep(2000);
		act.click(driver.findElement(By.xpath("(//input[@type='button'])[2]"))).build().perform();
		Thread.sleep(5000);
		act.click(driver.findElement(By.xpath("//span[text()='Shopping cart']"))).build().perform();
        WebElement product = driver.findElement(By.xpath("(//a[text()='Build your own cheap computer'])[2]"));
        if(product.isDisplayed()){
        	System.out.println("Successfully product is add to cart");
        }
        else
        {
        	System.out.println("Unsuccessfully product is add to cart");
        }
	}

}
