package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GMT_BrokenLinks_15Jan
{
	WebDriver driver;
	@BeforeMethod
	public void launch_url()
	{
		driver=new FirefoxDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Test 
	public void findbrokenlinks() throws IOException
	{
		List<WebElement> no_alllinks=driver.findElements(By.tagName("a"));
		System.out.println(no_alllinks.size());
		//String url;
		
		for(int i=0;i<no_alllinks.size();i++)
		{
			WebElement link=no_alllinks.get(i);
			String url=link.getAttribute("href");
			String urltext=link.getText();
			verifylink(url);
		}
		 
	}
	public void verifylink(String url) throws IOException
	{
		try
		{
		URL url1=new URL(url);
		HttpURLConnection http_connect=(HttpURLConnection) url1.openConnection();
		if(http_connect.getResponseCode()==200 || http_connect.getResponseCode()==201)
		{
			System.out.println("Valid link");
			System.out.println(http_connect.getResponseCode());
			System.out.println(http_connect.getResponseMessage());
			System.out.println();
		}
		else
		{
			System.out.println("Invalid link");
			System.out.println(http_connect.getResponseCode());
			System.out.println(http_connect.getResponseMessage());
			System.out.println();
		}	
		}
		catch(MalformedURLException m1)
		{
			System.out.println("Handled MalformedURLException");
			System.out.println();
		}
		catch(ClassCastException c1)
		{
			System.out.println("Handled ClassCastException");
			System.out.println();
		}
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
}
