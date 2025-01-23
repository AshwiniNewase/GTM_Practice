package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearch extends LaunchQuit_12Jan
{
	@Test
	public void search()
	{
		WebElement search_Textbox=driver.findElement(By.id("APjFqb"));
		search_Textbox.sendKeys("India");
		search_Textbox.click();
	}
}
