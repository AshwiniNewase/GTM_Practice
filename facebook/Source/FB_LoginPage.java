package facebook.Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_LoginPage 
{
	WebDriver driver;
	//Step1
	@FindBy(id="email")
	WebElement username;
	@FindBy(name="pass")
	WebElement password;
	@FindBy(xpath="//button[@name='login']")
	WebElement login_button;
	
	//Step2
	public void username()
	{
		username.sendKeys("ankjack@gmail.com");
	}
	public void password()
	{
		password.sendKeys("gaajK");
	}
	public void login_button()
	{
		login_button.click();;
	}
	
	//Step3
	public FB_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
