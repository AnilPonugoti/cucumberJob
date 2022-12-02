Feature: Validate the product name in checkout page
@PlaceOrder
Scenario Outline: Validate the products in CheckOutPage

Given User is in greenCart landing page 
When User searched with shortname <name> and extracted the actual name of the product 
And Add the product to checkOut Page
Then Product should be added to checkOutPage
And Verify that user has ability to enter the promocode and place the order
And Validate the product in checkoutPage is expected 

Examples:
|name|
|tom|