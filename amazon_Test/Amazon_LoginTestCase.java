package amazon_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazon_Source.Amazon_LoginPage;

public class Amazon_LoginTestCase 
{
	WebDriver driver;
	@BeforeMethod
	public void launchamazon()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	@Test
	public void amazonlogintestcase()
	{
		Amazon_LoginPage loginpage=new Amazon_LoginPage(driver);
		loginpage.username();
		loginpage.continuebutton();
		loginpage.password();
		loginpage.signin();
	}
	@AfterMethod
	public void quitamazon()
	{
		driver.quit();
	}
}
