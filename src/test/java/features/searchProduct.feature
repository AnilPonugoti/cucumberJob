Feature: Search and place the order for products
@ValidateTopDeals
Scenario Outline: Validating the search in product page and Offers page 

Given User is in greenCart landing page 
When User searched with shortname <name> and extracted the actual name of the product
Then User searched the same shortname <name> in offers page and check if the product is exist
And Validate if both are matching or not

Examples:
|name|
|tom|
|beet|

