@TC1 @Smoke
Feature: Menubar Functionality

  Scenario: User should be able to navigate to Menubar page
    Given User is on SauceDemo login page
    When User enters username "standard_user" and password "secret_sauce"
    And User clicks on the Menubar Icon
    Then User should see the Logout option
