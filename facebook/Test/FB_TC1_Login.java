package facebook.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import facebook.Source.FB_LoginPage;

public class FB_TC1_Login 
{
	@Test
	public void login_facebook()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		FB_LoginPage login=new FB_LoginPage(driver);
		login.username();
		login.password();
		login.login_button();
	}
	
	
}
