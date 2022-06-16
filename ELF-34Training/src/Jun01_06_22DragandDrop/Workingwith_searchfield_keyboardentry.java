package Jun01_06_22DragandDrop;

//without using keyboard,and mouse click,only using entry keys perform actions....
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwith_searchfield_keyboardentry {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		
		Actions act=new Actions(driver);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	    search.sendKeys("books");
	    
	    act.sendKeys(search, Keys.ENTER).perform(); 
	    
	    
	}

}
