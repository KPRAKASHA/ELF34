package Jun_01_06_22HandlingMultpliWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingwithWindowHandleassigment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String PW=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();

		Set<String> CW=driver.getWindowHandles();	

		for(String a:CW){

			if(!(a.equals(PW))){           //--------->Close Only Child window

				driver.switchTo().window(a);
				Thread.sleep(1000);
				driver.close();
			}
		}
	}
}





   ////if(a.equals(PW)){

	///driver.switchTo().window(a);
	///Thread.sleep(1000);
	//driver.close();
      // }---------------> its close parent window.