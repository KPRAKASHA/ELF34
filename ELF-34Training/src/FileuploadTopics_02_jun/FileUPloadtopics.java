package FileuploadTopics_02_jun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUPloadtopics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Users/Prakash/Desktop/Java .pdf");
		driver.quit();
	}

}









//  C:/Users/Prakash/Desktop/Java .pdf