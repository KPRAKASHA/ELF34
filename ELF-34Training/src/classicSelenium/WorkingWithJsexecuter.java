package classicSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithJsexecuter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript("window.scrollBy(999,823);");
		Thread.sleep(2000);
		exe.executeScript("window.scrollBy(0,-1000);");
		Thread.sleep(2000);
		exe.executeScript("window.scrollTo(600,1001);");
	}
}
