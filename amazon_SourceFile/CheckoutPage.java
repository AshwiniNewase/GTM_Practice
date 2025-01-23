package amazon_SourceFile;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//Step1
	@FindBy(xpath="//a[@class='a-link-normal expand-panel-button celwidget']")
	WebElement changeaddress_link;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement usethisaddress_button;
	
	@FindBy(xpath="(//div[@class='a-fixed-left-grid-inner'])[2]")
	WebElement netbanking_radiobutton;
	
	@FindBy(xpath="(//span[.='Choose an Option'])[1]")
	WebElement netbanking_dropdown;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[4]")
	WebElement usethispaymentmethod_button;
	
	@FindBy(xpath="//a[@id='prime-interstitial-nothanks-button']")
	WebElement nothanks_button;
	//step2
	
	public void changeaddress() throws InterruptedException
	{
		changeaddress_link.click();
		Thread.sleep(300000);
		//wait.until(ExpectedConditions.elementToBeClickable(usethisaddress_button));
		usethisaddress_button.click();
	}
	public void selectpaymentmethod(WebDriver driver) throws InterruptedException
	{
		netbanking_radiobutton.click();
		//wait.until(ExpectedConditions.elementToBeClickable(netbanking_dropdown));
		netbanking_dropdown.click();
		//wait.until(ExpectedConditions.visibilityOfAllElements(netbanking_dropdown));
		Actions actions = new Actions(driver); 
		actions.sendKeys(Keys.ARROW_DOWN).perform(); // Navigate down the dropdown options actions.sendKeys(Keys.ARROW_DOWN).perform()
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
		//wait.until(ExpectedConditions.elementToBeClickable(usethispaymentmethod_button));
		usethispaymentmethod_button.click();
		Thread.sleep(3000);
		nothanks_button.click();
		Thread.sleep(3000);
	}
	//Step3
	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
