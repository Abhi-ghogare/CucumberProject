package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class RemoveFromCaerPage {

	 public RemoveFromCaerPage() {
	        PageFactory.initElements(BaseClass.driver, this);
	    }
	 
	 @FindBy(id = "remove-sauce-labs-fleece-jacket")
	    WebElement removeC;
	
	 public void rem() {
		 removeC.click(); 
	 }
	 
}
