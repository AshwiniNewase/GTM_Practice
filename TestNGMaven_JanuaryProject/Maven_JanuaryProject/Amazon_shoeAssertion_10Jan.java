package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_shoeAssertion_10Jan 
{

	
	@Test
	public void shoe_search()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement search_Inputbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Inputbox.sendKeys("shoes");
		search_Inputbox.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.titleContains("shoes"));
		/*String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title.contains("shoes"), true);*/
		
		List<WebElement> no_shoes=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		System.out.println(no_shoes.size());
		AssertJUnit.assertEquals(no_shoes.size()>50, true);
		driver.quit();
	}
}
