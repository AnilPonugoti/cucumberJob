package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageFactory.CheckOutPage;
import utility.TextContextSetUp;

public class CheckOutPageStepDefination {
	
	CheckOutPage cop;
	
	TextContextSetUp textContextsetUp;
	public CheckOutPageStepDefination(TextContextSetUp textContextsetUp) {
		this.textContextsetUp=textContextsetUp;
		this.cop=textContextsetUp.pageObjectManag.getCheckOutPage();
	}
	
	
	
	@Then("Validate the product in checkoutPage is expected")
	public void validate_the_product_in_checkout_page_is_expected() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    String copProductName=cop.getCheckOutProductName();
	    Assert.assertEquals(textContextsetUp.actualProdName, copProductName);
	    
	    System.out.println(textContextsetUp.actualProdName + " is same as the check Out productName " + copProductName);
	}
	
	@Then("Verify that user has ability to enter the promocode and place the order")
	public void verify_User_has_ability_to_enter_promocode() {
		Assert.assertTrue(cop.displayPromoCOde());
		Assert.assertTrue(cop.displayplaceOrder());
		System.out.println(cop.displayPromoCOde() + " " + cop.displayplaceOrder());
		
	}

}
