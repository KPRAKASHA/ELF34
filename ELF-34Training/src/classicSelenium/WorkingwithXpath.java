package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		String mail="prakashasit17@gmail.com";
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(mail);
		String pwd="Prakash@17";		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		if(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed()){
			System.out.println("Login is successful");
		}
		driver.close();
	}

}
