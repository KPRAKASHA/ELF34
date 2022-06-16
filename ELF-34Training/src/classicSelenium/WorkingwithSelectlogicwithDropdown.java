package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingwithSelectlogicwithDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		Thread.sleep(2000);
		//WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select sb=new Select(driver.findElement(By.id("products-orderby")));
		List<WebElement> options=sb.getOptions();
		for (int i = 0; i < options.size(); i++) {
			Select p=new Select(driver.findElement(By.id("products-orderby")));
			p.selectByIndex(i);
		}


	}

}
