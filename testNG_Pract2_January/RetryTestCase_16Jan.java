package testNG_Pract2_January;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryTestCase_16Jan 
{	WebDriver driver;
	 @Test(retryAnalyzer=testNG_Pract2_January.RetryTestCaseLogic_16Jan.class)
	 public void amazon_search()
	 {
		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 WebElement search_Textbox=driver.findElement(By.id("threetabsearchtextbox"));
		 search_Textbox.sendKeys("kites"+Keys.ENTER);
		 driver.quit();
	 }
}
