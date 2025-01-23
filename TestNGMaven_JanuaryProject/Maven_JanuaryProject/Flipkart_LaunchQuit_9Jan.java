package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Flipkart_LaunchQuit_9Jan 
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void launchurlflip(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	@AfterMethod
	public void quiturlflip() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
