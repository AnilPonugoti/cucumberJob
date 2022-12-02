package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageFactory.OffersPage;
import pageFactory.ProdcutPage;
import utility.TextContextSetUp;

public class OffersPageStepDefination {
	public WebDriver driver;
	public String actualProdName;
    public String offerProdName;
    TextContextSetUp textContextsetUp;
    ProdcutPage pp;
    OffersPage op;
    
    public OffersPageStepDefination(TextContextSetUp textContextsetUp)
    {
    	this.textContextsetUp=textContextsetUp;
    	this.pp=textContextsetUp.pageObjectManag.getProductPage();
    	this.op= textContextsetUp.pageObjectManag.getOffersPage();
    }
	
@Then("^User searched the same shortname (.+) in offers page and check if the product is exist$")
public void user_searched_the_same_shortname_in_offers_page_and_check_if_the_product_is_exist(String shortName) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	pp.clickOnTopDeals();
	textContextsetUp.gt.switchToOffersPage();
	//textContextsetUp.driver.findElement(By.cssSelector("input[type='search']")).sendKeys(shortName);
	
	op.setOfferSearch(shortName);
	Thread.sleep(2000);
	//offerProdName=textContextsetUp.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	offerProdName=op.getOfferProdName();
	//System.out.println(offerProdName);
	}



@Then("Validate if both are matching or not")
public void validate_if_products_are_matching() {
	Assert.assertEquals( textContextsetUp.actualProdName, offerProdName);
	
	System.out.println( textContextsetUp.actualProdName+ " is same as the offersPageProduct " +offerProdName);
}
}
