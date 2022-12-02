package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (css = "tr td:nth-child(2) p")
	private WebElement CheckOutProductName;
	
	@FindBy (css = ".promoCode")
	private WebElement enterPromoCode;
	
	
	@FindBy (xpath = "//button[contains(text(),'Place Order')]")
	private WebElement placeOrder;
	
	
	
	public String getCheckOutProductName() {
		return CheckOutProductName.getText().split("-")[0].trim();
	}
	
	public boolean displayPromoCOde() {
		return enterPromoCode.isDisplayed();
	}
	

	public boolean displayplaceOrder() {
		return placeOrder.isDisplayed();
	}
	
	

}
