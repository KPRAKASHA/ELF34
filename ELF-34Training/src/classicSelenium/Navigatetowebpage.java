package classicSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatetowebpage {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("http://demowebshop.tricentis.com/");
        driver.navigate().to("http://demowebshop.tricentis.com/");
        Thread.sleep(4000);
        driver.navigate().forward();
        driver.navigate().refresh();
	}

}
