package POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	WebElement emailTextField;

	public void Entermail(String email)
	{
		emailTextField.sendKeys(email);
	}

	@FindBy(id="Password")
	WebElement passwordTextfield;

	public void enterpwd(String pwd)
	{
		passwordTextfield.sendKeys(pwd);
	}

	@FindBy(id="//input[@name='RememberMe'][1]")
	WebElement Checkbox;

	@FindBy(xpath="//a[text()='Forgot password?']")
	WebElement forgetpassword;	

	@FindBy(xpath="//input[@value='Log in']")
	WebElement Login_button;

	public void clicklogin(){
		Login_button.click();

	}
	@FindBy(xpath = "//input[@id='small-searchterms']")
	WebElement searchTextField;
	public void search(String value) {
		searchTextField.sendKeys(value);
	}
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchButton;
	public void searchButtonClick() {
		searchButton.click();
	}
	public void searchAndClick(String value) {
		searchTextField.sendKeys(value);
		searchButton.click();
	}

}


