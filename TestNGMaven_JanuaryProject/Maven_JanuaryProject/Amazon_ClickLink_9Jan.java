package TestNGMaven_JanuaryProject.Maven_JanuaryProject;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Amazon_ClickLink_9Jan extends Amazon_LaunchQuit_9Jan
{
	@Test
		public void clicklink()
	{
		WebElement sell_Link=driver.findElement(By.linkText("Sell"));
		sell_Link.click();
	}

}
