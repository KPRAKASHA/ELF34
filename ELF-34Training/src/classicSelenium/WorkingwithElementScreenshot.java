package classicSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WorkingwithElementScreenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		WebElement popup = driver.findElement(By.xpath("//div[@class='eb_widget_welcome_text']"));
		if(popup.isDisplayed()){

			
			
			File temp=popup.getScreenshotAs(OutputType.FILE);
			File Dest=new File("./Screenshots/temp.png");
			try {
				FileHandler.copy(temp,Dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
