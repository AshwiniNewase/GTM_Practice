package testng_IListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(IListenerLogic_19Jan.class)
public class ITestListnerTestCase_19Jan extends IListenerLogic_19Jan
{
	@Test
	public void launch_amazon() throws InterruptedException
	{
		driver=new FirefoxDriver();
		
		driver.get("https://wwwww.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		//driver.quit();
	}
	
}
