package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.BaseClass;

public class CheckOutPage {
	public CheckOutPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }
	
	@FindBy(id="checkout") WebElement checkoutbtn;
	@FindBy(id="first-name") WebElement firstNameInfo;
	@FindBy(id="last-name") WebElement lastNameInfo;
	@FindBy(id="postal-code") WebElement postalCodeInfo;
	@FindBy(id="continue") WebElement continueInfo;
	@FindBy(id="finish") WebElement finishInfo;
	@FindBy(xpath="//h2[text()='Thank you for your order!']") WebElement thanksMsg;
	
	
	public void checkoutmtd() {
	    new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10))
	        .until(ExpectedConditions.elementToBeClickable(checkoutbtn));
	    checkoutbtn.click();
	}

	
	public void checkoutINfo(String FirstName,String LastName,String ZipCode) {
		firstNameInfo.sendKeys(FirstName);
		lastNameInfo.sendKeys(LastName);
		postalCodeInfo.sendKeys(ZipCode);
		
	}
	public void continueInfomtd() {
		continueInfo.click();
	}
	public void finishmtd() {
		finishInfo.click();
	}
	public Boolean thanksmsgPage() {
		return thanksMsg.isDisplayed();
	}
	
}
