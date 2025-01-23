package AmazonProject_SourceFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//Step1
	@FindBy(xpath="(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]") 
	WebElement accountandlistsbeforesignin_hoverover;
	
	@FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']")
	WebElement accountandlistsaftersignin_hoverover;
	
	@FindBy(xpath="(//span[@class='nav-action-inner'])[1]")
	WebElement signin_headerbutton;
	
	@FindBy(xpath="(//span[@class='nav-line-1 nav-progressive-content'])[1]")
	WebElement delivertoashwini_text;
	
	@FindBy(xpath="//button[.='Manage Profiles']")
	WebElement manageprofiles_link;
	
	@FindBy(xpath="//a[@class='sc-iGgWBj sc-fHjqPf fErbOa bdPZUm']")   
	WebElement manageprofileview_link;

	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement manageprofileedit_icon;
	
	
	//Step2
	public void accountandlists(WebDriver driver) throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(accountandlistsbeforesignin_hoverover).perform();
		wait.until(ExpectedConditions.visibilityOf(accountandlistsbeforesignin_hoverover));
	}
	public void signin()
	{
		wait.until(ExpectedConditions.visibilityOf(accountandlistsbeforesignin_hoverover));
		signin_headerbutton.click();
	}
	public void manageprofile(WebDriver driver) throws InterruptedException
	{
		Actions action=new Actions(driver);
		action.moveToElement(accountandlistsaftersignin_hoverover).perform();
		//wait.until(ExpectedConditions.visibilityOf(accountandlists_hoverover));

		wait.until(ExpectedConditions.elementToBeClickable(manageprofiles_link));
		manageprofiles_link.click();
		
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(manageprofileview_link));
		manageprofileview_link.click();
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(manageprofileedit_icon));
		manageprofileedit_icon.click();
		
	}
	public void testscenario1assertion(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(delivertoashwini_text));
		Assert.assertEquals(delivertoashwini_text.isDisplayed(), true);
	}
	public void testscenario2assertion(WebDriver driver)
	{
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl.contains("home&signIn"), false);	
	}
	//Step3
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
