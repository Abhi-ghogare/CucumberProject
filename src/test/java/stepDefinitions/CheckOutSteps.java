package stepDefinitions;

import io.cucumber.java.en.*;
import pages.CheckOutPage;
import static org.junit.Assert.assertTrue; // Add this import
public class CheckOutSteps {
	CheckOutPage checkoutPage=new CheckOutPage();
	@And("User clicks on checkoutButton")
    public void user_clicks_on_checkout_button() {
		checkoutPage.checkoutmtd();
    }

	@And("User enter FirstName {string} and LastName {string} and ZipCode {string}")
    public void user_enters_user_details(String firstName, String lastName, String zip) {
    	checkoutPage.checkoutINfo(firstName, lastName, zip);
    }

    @And("User clicks on continue button")
    public void user_clicks_on_continue_button() {
    	checkoutPage.continueInfomtd();
    }

    @And("User click on finish button")
    public void user_clicks_on_finish_button() {
    	checkoutPage.finishmtd();
    }

    @Then("Thanks msg appear on screen")
    public void thanks_msg_appear_on_screen() {
    	  assertTrue("Thank you message is not displayed!", checkoutPage.thanksmsgPage());
    }
}
