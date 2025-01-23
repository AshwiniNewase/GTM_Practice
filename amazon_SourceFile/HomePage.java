package amazon_SourceFile;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	//Step1
	@FindBy(id="nav-link-accountList")
	WebElement accountlist_hoverover;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signin_headerbutton;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout_button;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_inputfield;
	
	@FindBy(xpath="(//a[.='Start here.'])[1]")
	WebElement starthere_link;
	
	
	//Step2
	public void accountlist(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.moveToElement(accountlist_hoverover).perform();
	}
	public void signin()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin_headerbutton));
		signin_headerbutton.click();
		//signin_headerbutton.sendKeys(Keys.ENTER);;

	}
	
	public void searchproduct()
	{
		search_inputfield.sendKeys("mobile");
		search_inputfield.sendKeys(Keys.ENTER);
	}
	public void signout() throws InterruptedException
	{
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(signout_button));
		signout_button.click();
		Thread.sleep(5000);
	}
	
	public void starthere()
	{
		starthere_link.click();
	}
	
	//Step3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
