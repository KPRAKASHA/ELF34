package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithJsexeScroolintoview {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'jdk-8u333-linux-x64.tar.gz')]"));
		exe.executeScript("arguments[0].scrollIntoView(true);",link);
		
		//exe.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Download jdk-8u333-linux-x64.tar.gz']"));
		exe.executeScript("arguments[0].click();", ele);

	}
}

