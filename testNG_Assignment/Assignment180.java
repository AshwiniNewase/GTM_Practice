package testNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*Assignment 180
Login to amazon with right credenetails .
"by usisng the presence of the component
e1.isdiaplyed
Assert.assertEquals(e1.isdplayed , true);  */
public class Assignment180 
{
	@Test
	public void login_success()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.co.uk/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement mobileNumber_textbox=driver.findElement(By.id("ap_email"));
		mobileNumber_textbox.sendKeys("newase777@gmail.com");
		WebElement continue_button=driver.findElement(By.id("continue"));
		continue_button.click();
		
		WebElement password_Textbox=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password_Textbox.sendKeys("swamisamartH!2");
		WebElement signIn_Button=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signIn_Button.click();
		WebElement delivertoyourname_link=driver.findElement(By.id("glow-ingress-line2"));
		Assert.assertEquals(delivertoyourname_link.isDisplayed(), true);
		
		driver.quit();
	}
}
