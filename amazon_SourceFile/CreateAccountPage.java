package amazon_SourceFile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage 
{
	//Step1
	@FindBy(id="ap_customer_name")
	WebElement yourname_inputfield;
	
	@FindBy(xpath="//span[@class='a-button-text a-declarative']")
	WebElement mobilnumbercountrycode_dropdown;
	
	@FindBy(id="ap_phone_number")
	WebElement mobilenumber_inputfield;
	
	@FindBy(id="ap_password")
	WebElement password_inputfield;
	
	@FindBy(id="continue")
	WebElement verifymobilenumber_button;
	
	

}
