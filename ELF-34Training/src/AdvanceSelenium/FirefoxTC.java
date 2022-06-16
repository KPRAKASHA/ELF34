package AdvanceSelenium;

import org.testng.annotations.Test;

public class FirefoxTC extends BaseTest{
	@Test
	public void Testcase(){
		driver.manage().window().maximize();
		driver.get("demowebshop.tricentis.com/");

	}
}
