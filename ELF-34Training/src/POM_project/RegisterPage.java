package POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement FirstnameTextfield;

	public void FNTextfield(String FN){
		FirstnameTextfield.sendKeys(FN);
	}
	@FindBy(xpath="//input[@name='LastName']")
	WebElement LastnameTextfield;

	public void LNTextfield(String LN){
		LastnameTextfield.sendKeys(LN);
	}
	@FindBy(xpath="//input[@name='Email']")
	WebElement EmailTextfield;

	public void EmailTextfield(String Email){
		EmailTextfield.sendKeys(Email);
	}
	@FindBy(xpath="//input[@name='Password']")
	WebElement passwordTextfield;

	public void pwdTextfield(String pwd){
		passwordTextfield.sendKeys(pwd);
	}
	@FindBy(xpath="//input[@name='ConfirmPassword']")
	WebElement ConfirmpwdTextfield;

	public void confirmpwdTextfield(String conpwd){
		ConfirmpwdTextfield.sendKeys(conpwd);

	}
	@FindBy(xpath="//input[@id='register-button']")
	WebElement register_button;

	public void register_click(){
		register_button.click();

	}

}
