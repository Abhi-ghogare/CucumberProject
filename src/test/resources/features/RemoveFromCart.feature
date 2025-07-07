@TC3 @Smoke
Feature: Remove item from cart

  Scenario: User should remove items from cart
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the Add to cart button
    And User clicks on the cart icon
    Then User clicks on remove button
