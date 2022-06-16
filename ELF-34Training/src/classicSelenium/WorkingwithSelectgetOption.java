package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithSelectgetOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		Thread.sleep(3000);
		WebElement dropdown=driver.findElement(By.id("products-viewmode"));
		Select sortdropdown=new Select(dropdown);
		List<WebElement> options=sortdropdown.getOptions();
		for(WebElement ab:options)
			System.out.println(ab.getText());
	}

}
