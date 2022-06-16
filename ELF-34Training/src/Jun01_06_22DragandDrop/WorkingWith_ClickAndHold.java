package Jun01_06_22DragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWith_ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(2000);
        
        Actions act=new Actions(driver);
        		
         WebElement source1=driver.findElement(By.xpath("//div[@id='box1']"));
         WebElement target1=driver.findElement(By.xpath("//div[@id='box101']"));
         act.clickAndHold(source1).perform();
         act.release(target1).perform();
         
         WebElement source2=driver.findElement(By.xpath("//div[@id='box2']"));
         WebElement target2=driver.findElement(By.xpath("//div[@id='box102']"));
         act.clickAndHold(source2).perform();
         act.release(target2).perform();
         
         WebElement source3=driver.findElement(By.xpath("//div[@id='box3']"));
         WebElement target3=driver.findElement(By.xpath("//div[@id='box103']"));
         act.clickAndHold(source3).perform();
         act.release(target3).perform();
         
         WebElement source4=driver.findElement(By.xpath("//div[@id='box4']"));
         WebElement target4=driver.findElement(By.xpath("//div[@id='box104']"));
         act.clickAndHold(source4).perform();
         act.release(target4).perform();
         
         WebElement source5=driver.findElement(By.xpath("//div[@id='box5']"));
         WebElement target5=driver.findElement(By.xpath("//div[@id='box105']"));
         act.clickAndHold(source5).perform();
         act.release(target5).perform();
         
         WebElement source6=driver.findElement(By.xpath("//div[@id='box6']"));
         WebElement target6=driver.findElement(By.xpath("//div[@id='box106']"));
         act.clickAndHold(source6).perform();
         act.release(target6).perform();
         
         WebElement source7=driver.findElement(By.xpath("//div[@id='box7']"));
         WebElement target7=driver.findElement(By.xpath("//div[@id='box107']"));
         act.clickAndHold(source7).perform();
         act.release(target7).perform();
         Thread.sleep(3000);
         driver.quit();
	}

}
