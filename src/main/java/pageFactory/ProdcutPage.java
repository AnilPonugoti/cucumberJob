package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdcutPage {
	
	public WebDriver driver;
	
	public ProdcutPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (css = "input[type='search']")
	private WebElement prodSearch;
	
	@FindBy (css=".product-name:nth-child(2)")
	private WebElement productName;
	
	@FindBy (linkText = "Top Deals")
	private WebElement topDeals;
	
	@FindBy (className = "increment")
	private WebElement plusIcon;
	
	@FindBy (xpath = "//button[text()='ADD TO CART']")
	private WebElement AddTOCart;
	
	@FindBy (xpath = "//img[contains(@src,'bag')]")
	private WebElement checkOutBag;
	
	@FindBy (xpath = "//button[text()='PROCEED TO CHECKOUT']")
	private WebElement proceedToCheckOut;
	
	
	public void setSearch(String text) {
		prodSearch.sendKeys(text);
	}
	
	public String getProdName() {
		return productName.getText().split("-")[0].trim();
	}
	
	public void clickOnTopDeals() {
		topDeals.click();
	}
	
	public void clickOnIncrement(int num) {
		int i=1;
		while(i<=num-1) {
			plusIcon.click();
			i++;
		}
	}
	public void clickOnAddtoCart() {
		AddTOCart.click();
	}
	
	public void clickOnCheckOutBag() {
		checkOutBag.click();
	}
	public void clickOnProceedToCheckOut() {
		proceedToCheckOut.click();
	}
}
