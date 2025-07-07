@Regression @TC11
Feature: Checkout functionality
	Scenario: User should able to checkeout and make payment by all processing
		Given User is on SauceDemo login page
    	When User enters username "standard_user" and password "secret_sauce"
    	And User clicks on the cart icon
    	And User clicks on checkoutButton
    	And User enter FirstName "Ahbi" and LastName "dj" and ZipCode "323232"
    	And User clicks on continue button 
    	And User click on finish button
    	Then Thanks msg appear on screen