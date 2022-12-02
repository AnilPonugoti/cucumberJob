package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OffersPage {
public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy (css = "input[type='search']")
	private WebElement offerSearch;
	
	@FindBy (css="tr td:nth-child(1)")
	private WebElement offersProdName;
	
	
	public void setOfferSearch(String text) {
		offerSearch.sendKeys(text);
	}
	
	public String getOfferProdName() {
		return offersProdName.getText();
	}
}
