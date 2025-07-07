@TC2 @Smoke
Feature: Add to Cart Functionality

  Scenario: User should be able to add an item to the cart
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the Add to cart button
    And User clicks on the cart icon
    Then User should see the added product on cart page
