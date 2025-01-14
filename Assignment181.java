package testNG_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/*Assignment 181
Launch Google->Search Something
"Assert.assertnotequals(driver.cureentURL(),""https://www.google.com"");
Assert.assertnotequals(driver.gettitle(),""Google"");"   */
public class Assignment181 
{
	@Test
	public void google_search()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search_Textbox=driver.findElement(By.id("APjFqb"));
		search_Textbox.sendKeys("India"+Keys.ENTER);
		
		String page_title=driver.getTitle();
		
		Assert.assertEquals(page_title.contains("India"), true);
		
		driver.quit();	
	}
}
