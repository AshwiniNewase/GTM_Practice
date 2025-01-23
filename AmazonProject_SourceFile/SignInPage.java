package AmazonProject_SourceFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignInPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//Step1
	@FindBy(name="email")
	WebElement username_Inputtextfield;
	
	@FindBy(id="continue")
	WebElement continue_Button;
	
	@FindBy(name="password")
	WebElement password_Inputtextfield;
	
	@FindBy(id="signInSubmit")
	WebElement signIn_Button;
	
	//Step2
	public void signinamazon()
	{
		wait.until(ExpectedConditions.elementToBeClickable(username_Inputtextfield));
		username_Inputtextfield.sendKeys("newase777@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(continue_Button));
		continue_Button.click();
		wait.until(ExpectedConditions.elementToBeClickable(password_Inputtextfield));
		password_Inputtextfield.sendKeys("swamisamartH!2");
		wait.until(ExpectedConditions.elementToBeClickable(signIn_Button));
		signIn_Button.click();
	}
	
	
	//Step3
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
