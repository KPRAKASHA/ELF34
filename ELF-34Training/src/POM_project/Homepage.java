package POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	private static final WebElement logout_Linkg = null;
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Books')]")
	WebElement booksLink;
	public void booksClick() {
		booksLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Computers')]")
	WebElement computersLink;
	public void computersClick() {
		computersLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Electronics')]")
	WebElement electronicsLink;
	public void electronicsClick() {
		electronicsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Apparel')]")
	WebElement apparalsLink;
	public void apparalsClick() {
		apparalsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Digital downloads')]")
    WebElement digitalDownloadsLink;
	public void digitalDownloadsClick() {
		digitalDownloadsLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Jewelry')]")
    WebElement jewelryLink;
	public void jewelryClick() {
		jewelryLink.click();
	}
	@FindBy(xpath = "//div[@class='header-menu']//a[contains(text(),'Gift Cards')]")
    WebElement giftCardsLink;
	public void giftCardsClick() {
		giftCardsLink.click();
	}
	@FindBy(className="ico-logout")
	private WebElement logout_Link;
	
	public void LogoutClick(){
		logout_Link.click();
	}

	public WebElement getLogout_Link() {
		return logout_Link;
	}

	public void setLogout_Link(WebElement logout_Link) {
		this.logout_Link = logout_Link;
	}

	
	}





