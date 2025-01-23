package amazon_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LoginPage 
{
	WebDriver driver;
	//Step1
	@FindBy(name="email")
	WebElement username_InputTextfield;
	
	@FindBy(id="continue")
	WebElement continue_Button;
	
	@FindBy(name="password")
	WebElement password_Inputtextfield;
	
	@FindBy(id="signInSubmit")
	WebElement signIn_Button;
	
	//Step2
	public void username()
	{
		username_InputTextfield.sendKeys("newase777@gmail.com");
	}
	public void continuebutton()
	{
		continue_Button.click();
	}
	public void password()
	{
		password_Inputtextfield.sendKeys("swamisamartH!2");
	}
	public void signin()
	{
		signIn_Button.click();
	}
	
	//Step3
	public Amazon_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
