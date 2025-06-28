package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class MenuThreePage {
	public MenuThreePage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
	@FindBy(id = "react-burger-menu-btn")
    WebElement menuThreeLine;
	
	@FindBy(id = "logout_sidebar_link")
    WebElement logoutP;
	
	public void checkThreeLinesPresent() {
		menuThreeLine.click();
	}
	public boolean logoutIsDisplay() {
		return menuThreeLine.isDisplayed();
	}
	
	
	
}
