package amazon_SourceFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage 
{
	WebDriver driver;
//Step1
	@FindBy(xpath="(//input[@name='submit.deleteItem'])[1]")
	WebElement deleteitem_icon;
	
	//Step2
	public void deleteitemfromwishlist()
	{
		deleteitem_icon.click();
	}
	
	//Step3
	public WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
