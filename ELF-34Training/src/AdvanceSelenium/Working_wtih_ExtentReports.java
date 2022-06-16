package AdvanceSelenium;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Working_wtih_ExtentReports {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		LocalDateTime systemdate=LocalDateTime.now();
		String reportname=systemdate.toString().replace(":","-");
		ExtentReports report=new ExtentReports("./ExtentReports/"+reportname+"Reports.html",true);
		ExtentTest test=report.startTest("ExtentDemo");

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		test.log(LogStatus.INFO,"Browser opened");
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		test.log(LogStatus.INFO,"Website opened");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("products-orderby"));
		Select sortdropdown=new Select(dropdown);
		sortdropdown.selectByVisibleText("Name: A to Z");
		//	    sortdropdown.selectByVisibleText("Name:Z to A");
		//	    sortdropdown.selectByVisibleText("Price:Low to High");
		//	    sortdropdown.selectByVisibleText("Price:High to Low");
		//	    sortdropdown.selectByVisibleText("Created on");
		//	    sortdropdown.selectByVisibleText("Position");

		test.log(LogStatus.PASS,"Page is Selected by dropdown");
		test.log(LogStatus.INFO,test.addScreenCapture(screenCapture()));
		report.endTest(test);
		report.flush();
	}
	public static String screenCapture(){
		LocalDateTime sysdate=LocalDateTime.now();
		String screenshotname=sysdate.toString().replaceAll(":","-");
		String impath="./Screenshots/"+screenshotname+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(impath);
		try {
			FileHandler.copy(temp,des);
		} catch (IOException e) {

			System.out.println("exception handled");

		}
		return "."+impath; 
	}		

}


