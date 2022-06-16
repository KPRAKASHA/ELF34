package classicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingwithIDlocator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.contains("Demo")){
			System.out.println("Demo web shop is open");
		}
		driver.findElement(By.className("ico-register")).click();
		String title1=driver.getTitle();
		if(title1.contains("Register")){
			System.out.println("Page is displayed");  
		}
		driver.findElement(By.id("gender-male")).click();
		String Firstname="raj";
		String Lastname="kumar";
		String mail="raaj@gmail.com";
		String password="raj123";
		driver.findElement(By.id("FirstName")).sendKeys(Firstname);
		driver.findElement(By.id("LastName")).sendKeys(Lastname);
		driver.findElement(By.id("Email")).sendKeys(mail);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
		driver.findElement(By.id("register-button")).click();
		if(driver.findElement(By.className("ico-logout")).isDisplayed()){
			System.out.println("user is registerd successful ");
		}


	}

}
