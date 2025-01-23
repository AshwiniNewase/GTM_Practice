package amazon_SourceFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//Step1
	@FindBy(xpath="(//span[@class='a-icon a-icon-small-add'])[1]")
	WebElement productincrementcount_icon;
	
	@FindBy(xpath="(//input[contains(@name,'submit.delete')])[1]")
	WebElement deleteproduct_link;
	//Step2
	public void productincrementcount() throws InterruptedException
	{
		int count=1;
		while(count<=3)
		{
			productincrementcount_icon.click();
			count++;
			Thread.sleep(2000);
		}
		
		//productincrementcount_icon.click();
	}
	public void deleteproduct() throws InterruptedException
	{
		Thread.sleep(3000);
		deleteproduct_link.click();
	}
	
	//step3
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
