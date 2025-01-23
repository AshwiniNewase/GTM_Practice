package amazon_SourceFile;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//Step1
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[4]")
	WebElement mobile;
	
	@FindBy(id="wishListMainButton")
	WebElement addtowishlist_button;
	
	@FindBy(xpath="//a[.='View Your List']") 
	WebElement viewyourlist_button;
	
	@FindBy(id="continue-shopping")
	WebElement continueshopping_button;
	
	@FindBy(xpath="(//input[@name='submit.add-to-cart'])[2]")
	WebElement addtocart_button;
	
	@FindBy(xpath="//span[@class='a-button a-button-base attach-button-large attach-cart-button']")
	WebElement cart_button;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceedtobuy_button;
	//Step2
	public void clickonproduct(WebDriver driver) throws InterruptedException
	{
		mobile.click();
		Set<String> allbrowserid=driver.getWindowHandles();
		Iterator<String> browserid_itr=allbrowserid.iterator();
		String parent_id=browserid_itr.next();
		String child_id=browserid_itr.next();
		driver.switchTo().window(child_id);
		Thread.sleep(5000);
	}
	public void wishlistbutton() throws InterruptedException
	{
		addtowishlist_button.click();
		Thread.sleep(5000);
		
	}
	public void continueshopping() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(continueshopping_button));
		//js.executeScript("argument[0].click()", viewyourlist_button);
		continueshopping_button.click();
		Thread.sleep(3000);
	}
	
	public void viewwishlist()
	{
		viewyourlist_button.click();
	}
	public void addtocart() throws InterruptedException
	{
		addtocart_button.click();
		Thread.sleep(5000);
	}
	public void gotocart()
	{
		cart_button.click();
	}
	public void proceedtobuy()
	{
		proceedtobuy_button.click();
	}
	public void movecontroltomainwindow(WebDriver driver) throws InterruptedException
	{
		Set<String> allbrowserid=driver.getWindowHandles();
		Iterator<String> browserid_itr=allbrowserid.iterator();
		String parent_id=browserid_itr.next();
		String child_id=browserid_itr.next();
		driver.switchTo().window(parent_id);
		Thread.sleep(10000);
		//wait.until(ExpectedConditions.titleContains("Online Shopping site in India"));
	}
	
	//Step3
	public SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
