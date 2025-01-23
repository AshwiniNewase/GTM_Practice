package testNG_Pract2_January;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListener_Logic.class)
public class Listener_TestCase1 extends ITestListener_Logic
{
	
	@Test
	public void test1() throws InterruptedException
	{

		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.navigate().refresh();
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Textbox.sendKeys("mobile");
		search_Textbox.sendKeys(Keys.ENTER);
		//wait.until(ExpectedConditions.elementToBeSelected(search_Textbox));
		String title=driver.getTitle();
		Assert.assertEquals(title.contains("mobilejssh"), true);
		
		driver.quit();
	}
}
