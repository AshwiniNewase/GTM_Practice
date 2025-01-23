package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Amazon_LaunchQuit_Parallel_12Jan 
{
	WebDriver driver;
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(25));	
	@Parameters("browser")
	@BeforeMethod
	public void launchurl(String browsername)
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
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod()
	public void quit() throws IOException
	{
		Date d1=new Date();
		String date1=d1.toString();
		String date=date1.substring(8,10)+date1.substring(4, 7)+date1.substring(24)+date1.substring(11,16);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source_loc=ts.getScreenshotAs(OutputType.FILE);
		File dest_loc=new File("/Users/kiranshinde/eclipse-workspace/Maven_JanuaryProject/ScreenShots_January"+date+".png");
		FileHandler.copy(source_loc, dest_loc);
		driver.quit();
	}
	
	
	
}
