package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.RemoveFromCaerPage;

public class RemoveFromCartSteps {
	RemoveFromCaerPage removeFromCaerPage=new RemoveFromCaerPage();
	@Then ("User clicks on remove button")
	public void then_User_clicks_on_remove_button() {
		removeFromCaerPage.rem();
	}
}
