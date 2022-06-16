package FileuploadTopics_02_jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithHandlingwithLinkIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prakash/Downloads/iframe.html");
		driver.switchTo().frame("frame1");                                                   //.frame(name/id)
		//driver.switchTo().frame(0);                                                        //.frame(index/0 1 )
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));      //.frame(webelement/adress)

		driver.findElement(By.xpath("//a[text()='MOVIES']")).click();
	}

}
 