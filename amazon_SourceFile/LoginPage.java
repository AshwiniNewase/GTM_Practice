package amazon_SourceFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
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
		wait.until(ExpectedConditions.elementToBeClickable(password_Inputtextfield));
		password_Inputtextfield.sendKeys("swamisamartH!2");
	}
	public void signin_loginpage()
	{
		signIn_Button.click();
	}
	public void testcaseassertion(WebDriver driver)
	{
		Assert.assertEquals(username_InputTextfield.isDisplayed(), true);
	}
	
	//Step3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
