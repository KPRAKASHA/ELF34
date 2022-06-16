package classicSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithLinkList {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> Ab=driver.findElements(By.tagName("a"));
		//for(WebElement WB:Ab)
		//{
			//System.out.println(WB.getText());
		//}
		for(int i=0;i<Ab.size();i++)
		{
			System.out.println(Ab.get(i).getText());
		}

	}

}
