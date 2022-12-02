package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ProdcutPage;
import utility.TextContextSetUp;

public class productPageStepDefination {

	public WebDriver driver;
	public String actualProdName;
    public String offerProdName;
    ProdcutPage pp;
    
    TextContextSetUp textContextsetUp;
    
    public productPageStepDefination(TextContextSetUp textContextsetUp)
    {
    	this.textContextsetUp=textContextsetUp;
    	this.pp=textContextsetUp.pageObjectManag.getProductPage();
    }
	

@Given("User is in greenCart landing page")
public void user_is_in_green_cart_landing_page() {
    // Write code here that turns the phrase above into concrete actions
   
	System.out.println(textContextsetUp.tb.WebDriverManager().getCurrentUrl());
    
}
@When("^User searched with shortname (.+) and extracted the actual name of the product$")
public void user_searched_with_shortname_and_extracted_the_actual_name_of_the_product(String shortName) throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 //textContextsetUp.driver.findElement(By.cssSelector("input[type='search']")).sendKeys(shortName);
	
	//System.out.println(shortName);
	pp.setSearch(shortName);
   Thread.sleep(2000);
   //textContextsetUp.actualProdName= textContextsetUp.driver.findElement(By.cssSelector(".product-name:nth-child(2)")).getText().split("-")[0].trim();
   textContextsetUp.actualProdName=pp.getProdName();
   //System.out.println( textContextsetUp.actualProdName);
}

@When("Add the product to checkOut Page")
public void add_the_product_to_check_out_page() {
    // Write code here that turns the phrase above into concrete actions
	
    pp.clickOnIncrement(4);
    pp.clickOnAddtoCart();
    
}

@Then("Product should be added to checkOutPage")
public void product_should_be_added_to_check_out_page() {
    // Write code here that turns the phrase above into concrete actions
	
	pp.clickOnCheckOutBag();
	pp.clickOnProceedToCheckOut();
   
}


}
