package AmazonProject_SourceFile;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EditProfilePage 
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	//Step1
	@FindBy(id="editProfileNameInputId")
	WebElement manageprofileeditprofilename_Inputtextfield;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[3]")
	WebElement manageprofileeditprofilename_continuebutton;
	
	//Step2
	public void editprofile_name()
	{
		wait.until(ExpectedConditions.visibilityOf(manageprofileeditprofilename_Inputtextfield));
		manageprofileeditprofilename_Inputtextfield.clear();
		manageprofileeditprofilename_Inputtextfield.sendKeys("Ashwini S Newase");
		manageprofileeditprofilename_continuebutton.click();
	}
	
	public void assertiontestscenario4(WebDriver driver)
	{
		Assert.assertEquals(driver.getTitle(), "Profile Hub");
	}
	
	//Step3
	public EditProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
