package testNG_Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/*Assignment 183
Logout from aamzon assert and verify if test case is pass                        
Here we can check if the username text field is displaying if yes it is pass */
public class Assignment183 
{
@Test
public void login_logout()
{
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.amazon.co.uk/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	//driver.navigate().refresh();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement mobileNumber_textbox=driver.findElement(By.xpath("//input[contains(@id,'ap_email')]"));
	mobileNumber_textbox.sendKeys("newase777@gmail.com");
	WebElement continue_button=driver.findElement(By.id("continue"));
	continue_button.click();
	
	WebElement password_Textbox=driver.findElement(By.xpath("//input[@id='ap_password']"));
	password_Textbox.sendKeys("swamisamartH!2");
	WebElement signIn_Button=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	signIn_Button.click();
	
	
	WebElement account_list_dropdown=driver.findElement(By.id("nav-link-accountList"));
	Actions action=new Actions(driver);
	action.moveToElement(account_list_dropdown).perform();
	WebElement signout_link=driver.findElement(By.xpath("//span[.='Sign Out']"));
	wait.until(ExpectedConditions.elementToBeClickable(signout_link));
	signout_link.click();
	
	WebElement username_Textbox=driver.findElement(By.xpath("//input[contains(@id,'ap_email')]"));
	Assert.assertEquals(username_Textbox.isDisplayed(), true);
	
	driver.quit();
}
}
