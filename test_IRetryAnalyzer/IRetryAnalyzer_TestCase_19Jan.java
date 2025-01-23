package test_IRetryAnalyzer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IRetryAnalyzer_TestCase_19Jan
{
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
	@Test(retryAnalyzer=IRetryAnalyzer_Logic_19Jan.class)
	public void gotoamazonsigninpage()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement accountListLink=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(accountListLink).perform();
		//wait.until(ExpectedConditions.visibilityOf(accountListLink));
		WebElement signInButton=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		wait.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
		driver.quit();
	}
}
