package pageFactory;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public OffersPage offersPage;
	public ProdcutPage productPage;
	public CheckOutPage checkOutPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public ProdcutPage getProductPage() {
		productPage=new ProdcutPage(driver);
		return productPage;
	}
	
	public OffersPage getOffersPage() {
		offersPage=new OffersPage(driver);
		return offersPage;
	}
	
	public CheckOutPage getCheckOutPage() {
		checkOutPage=new CheckOutPage(driver);
		return checkOutPage;
	}

}
