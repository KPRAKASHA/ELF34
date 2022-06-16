package classicSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class working_with_chromeoptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("--disable-notifications");
	//	option.addArguments("--headless");
		
	    WebDriver driver=new ChromeDriver(option);
	    driver.get("https://www.easemytrip.com/");
      //  System.out.println("broswer is open");
	}

}



























 //Chrome options are used to maximized the browser and to disable the notification before perform any action in browser.