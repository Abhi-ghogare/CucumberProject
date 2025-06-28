package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CartPage;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @When("User clicks on the cart icon")
    public void user_clicks_on_cart_icon() {
        cartPage.clickCart();
    }

    @Then("User should see the cart page")
    public void user_should_see_the_cart_page() {
        Assert.assertTrue(cartPage.checkCartPageDisplay());
    }
}
