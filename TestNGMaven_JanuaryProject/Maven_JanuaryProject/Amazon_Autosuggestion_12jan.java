package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Amazon_Autosuggestion_12jan extends Amazon_LaunchQuit_Parallel_12Jan
{
	@Test
	public void autosuggestion_shoelist()
	{
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Textbox.sendKeys("shoes");
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		wait.until(ExpectedConditions.visibilityOfAllElements(autosuggestion));
		System.out.println(autosuggestion.size());
		autosuggestion.get(2).click();
	}

}
