package Jun_01_06_22HandlingMultpliWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithMultiplewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		//System.out.println(driver.getWindowHandle());
		
		String windowhandle=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set<String> windowhandles=driver.getWindowHandles();
		
		for(String a:windowhandles){
			
			if(a.equals(windowhandle)){  //---------------->only close parent window
					
				driver.switchTo().window(a);
				driver.close();
			}
		}	
	}
}
 