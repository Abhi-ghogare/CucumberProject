package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MenuThreePage;

public class MenuThreeSteps {
	MenuThreePage menuThreePage=new MenuThreePage();
	 @And("User clicks on the Menubar Icon")
	    public void user_clicks_on_menubar_icon() {
		 menuThreePage.checkThreeLinesPresent();
	    }

	    @Then("User should see the Logout option")
	    public void user_should_see_logout_option() {
	    	menuThreePage.logoutIsDisplay();
	    }
}
