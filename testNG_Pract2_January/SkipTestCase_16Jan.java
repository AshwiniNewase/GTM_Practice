package testNG_Pract2_January;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SkipTestCase_16Jan 
{
	WebDriver driver;
	
	@Test(priority=1)
	public void login()
	{
		driver=new ChromeDriver();
		 driver.get("https://ww.amazon.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@Test(priority=2)
	public void search_product()
	{
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		 search_Textbox.sendKeys("kites"+Keys.ENTER);
	}
	@Test(priority=3,dependsOnMethods="login")
	public void logout()
	{
		driver.quit();
	}
	
}
