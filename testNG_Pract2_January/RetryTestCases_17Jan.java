package testNG_Pract2_January;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RetryTestCases_17Jan 
{
	WebDriver driver;
	@Test(retryAnalyzer=RetryFailedTC_Logic.class)
	public void searchproduct()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement search_Textbox=driver.findElement(By.id("threetabsearchtextbox"));
		search_Textbox.sendKeys("books"+Keys.ENTER);
		driver.quit();
	}
	
}
