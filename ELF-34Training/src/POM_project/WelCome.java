package POM_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelCome {

	public WelCome(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(className ="ico-register")
	private WebElement register_Link;
	
	@FindBy(className ="ico-login")
	private WebElement login_Link;
	
	@FindBy(xpath ="//span[text()='Shopping cart']")
	private WebElement shopcart_link;
	
	@FindBy(xpath ="//span[text()='Wishlist']")
	private WebElement wishlist_link;
	
	public void clickLogin(){
		login_Link.click();
	}
	 public void clickreg(){
		 register_Link.click();
		 
	 }
	 @FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	 private WebElement booksTab;
	 
	 public void booksTabClick(){
		 booksTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	 private WebElement computerTab;
	 
	 public void computerTabClick(){
		 computerTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
	 private WebElement electronicsTab;
	 
	 public void electroTabClick(){
		 electronicsTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
	 private WebElement apparelshoesTab;
	 
	 public void apparelshoesTabClick(){
		 apparelshoesTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	 private WebElement digidownTab;
	 
	 public void digidownTabClick(){
		 digidownTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
	 private WebElement jewelryTab;
	 
	 public void jewelryTabClick(){
		 jewelryTab.click();
	 }
	 
	 @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	 private WebElement giftcardsTab;
	 
	 public void giftcardsTabClick(){
		 giftcardsTab.click();
	 }
	public WebElement getRegister_Link() {
		return register_Link;
	}
	public WebElement getLogin_Link() {
		return login_Link;
	}
	public WebElement getShopcart_link() {
		return shopcart_link;
	}
	public WebElement getWishlist_link() {
		return wishlist_link;
	}
	public WebElement getBooksTab() {
		return booksTab;
	}
	public WebElement getComputerTab() {
		return computerTab;
	}
	public WebElement getElectronicsTab() {
		return electronicsTab;
	}
	public WebElement getApparelshoesTab() {
		return apparelshoesTab;
	}
	public WebElement getDigidownTab() {
		return digidownTab;
	}
	public WebElement getJewelryTab() {
		return jewelryTab;
	}
	public WebElement getGiftcardsTab() {
		return giftcardsTab;
	}
	public void setRegister_Link(WebElement register_Link) {
		this.register_Link = register_Link;
	}
	public void setLogin_Link(WebElement login_Link) {
		this.login_Link = login_Link;
	}
	public void setShopcart_link(WebElement shopcart_link) {
		this.shopcart_link = shopcart_link;
	}
	public void setWishlist_link(WebElement wishlist_link) {
		this.wishlist_link = wishlist_link;
	}
	public void setBooksTab(WebElement booksTab) {
		this.booksTab = booksTab;
	}
	public void setComputerTab(WebElement computerTab) {
		this.computerTab = computerTab;
	}
	public void setElectronicsTab(WebElement electronicsTab) {
		this.electronicsTab = electronicsTab;
	}
	public void setApparelshoesTab(WebElement apparelshoesTab) {
		this.apparelshoesTab = apparelshoesTab;
	}
	public void setDigidownTab(WebElement digidownTab) {
		this.digidownTab = digidownTab;
	}
	public void setJewelryTab(WebElement jewelryTab) {
		this.jewelryTab = jewelryTab;
	}
	public void setGiftcardsTab(WebElement giftcardsTab) {
		this.giftcardsTab = giftcardsTab;
	}
	
}
