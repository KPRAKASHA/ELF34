package Jun01_06_22DragandDrop;
// To perform drogandDrop actions 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithDragandDroptopics {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(2000);
        Actions act=new Actions(driver);
        
        WebElement source1=driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement target1=driver.findElement(By.xpath("//div[@id='box103']"));
        act.dragAndDrop(source1, target1).perform();
        Thread.sleep(1000);
        
        WebElement source2=driver.findElement(By.xpath("//div[@id='box6']"));
        WebElement target2=driver.findElement(By.xpath("//div[@id='box106']"));
        act.dragAndDrop(source2, target2).perform();
        Thread.sleep(1000);
        
        WebElement source3=driver.findElement(By.xpath("//div[@id='box2']"));
        WebElement target3=driver.findElement(By.xpath("//div[@id='box102']"));
        act.dragAndDrop(source3, target3).perform();
        Thread.sleep(1000);
        
        WebElement source4=driver.findElement(By.xpath("//div[@id='box4']"));
        WebElement target4=driver.findElement(By.xpath("//div[@id='box104']"));
        act.dragAndDrop(source4, target4).perform();
        Thread.sleep(1000);
        
        WebElement source5=driver.findElement(By.xpath("//div[@id='box5']"));
        WebElement target5=driver.findElement(By.xpath("//div[@id='box105']"));
        act.dragAndDrop(source5, target5).perform();
        Thread.sleep(1000);
        
        WebElement source6=driver.findElement(By.xpath("//div[@id='box1']"));
        WebElement target6=driver.findElement(By.xpath("//div[@id='box101']"));
        act.dragAndDrop(source6, target6).perform();
        Thread.sleep(1000);
        
        WebElement source7=driver.findElement(By.xpath("//div[@id='box7']"));
        WebElement target7=driver.findElement(By.xpath("//div[@id='box107']"));
        act.dragAndDrop(source7, target7).perform();
        

}
}
