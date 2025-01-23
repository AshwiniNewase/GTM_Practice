package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Assertion_10Jan 
{
	@Test
	public void login()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.co.uk/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		WebElement mobileNumber_textbox=driver.findElement(By.id("ap_email"));
		mobileNumber_textbox.sendKeys("newase777@gmail.com");
		WebElement continue_button=driver.findElement(By.id("continue"));
		continue_button.click();
		
		WebElement password_Textbox=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password_Textbox.sendKeys("ashwinI!2");
		WebElement signIn_Button=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signIn_Button.click();
		WebElement address=driver.findElement(By.id("glow-ingress-line1"));
		AssertJUnit.assertEquals(address.isDisplayed(), true);
		//System.out.println("Pass");
		driver.quit();
	}
}
