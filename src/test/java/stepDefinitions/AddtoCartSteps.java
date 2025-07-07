package stepDefinitions;

import io.cucumber.java.en.*;
import pages.AddtoCartPage;

public class AddtoCartSteps {
	AddtoCartPage addtoCartPage=new AddtoCartPage();
	
	@When("User clicks on the Add to cart button")
	public void user_clicks_on_the_add_to_cart_button() {
		addtoCartPage.addTocartt();
	}
	@Then("User should see the added product on cart page")
	public void user_should_see_the_added_product_on_cart_page() {
		addtoCartPage.addTocartItemPresentOrNotMethod();
	}

	
}
