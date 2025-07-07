package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class AddtoCartPage {
	public AddtoCartPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement addTocart;
	@FindBy(xpath = "//div[contains(text(),'Sauce Labs Onesie')]")
    WebElement addTocartItemPresentOrNot;
	
	
	public void addTocartt() {
		addTocart.click();
	}
	
	public boolean addTocartItemPresentOrNotMethod() {
		return addTocartItemPresentOrNot.isDisplayed();
	}
}
