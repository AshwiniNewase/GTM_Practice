package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Flipkart_SearchProduct_9Jan extends Flipkart_LaunchQuit_9Jan
{

	@Test
	public void searchproduct()
	{
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("mobiles");
		searchbox.click();
	}
}
