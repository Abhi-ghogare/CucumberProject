package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(id = "shopping_cart_container")
    WebElement cartIcon;

    @FindBy(xpath = "//span[text()='Your Cart']")
    WebElement cartPageDisplay;

    public void clickCart() {
        cartIcon.click();
    }

    public boolean checkCartPageDisplay() {
        return cartPageDisplay.isDisplayed();
    }
}
