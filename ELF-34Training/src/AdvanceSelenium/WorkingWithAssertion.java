package AdvanceSelenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WorkingWithAssertion extends BaseTest {
	@Test
	public void Tc(){
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement Register_link=driver.findElement(By.className("ico-register"));
		SoftAssert ast=new SoftAssert();
		ast.assertEquals(Register_link.getText(), "Login", "pass");	
		Register_link.click();
		ast.assertAll();
 } 

}




















