package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Amazon_SearchProduct_9Jan extends Amazon_LaunchQuit_9Jan
{
	@Test
	public void searchproduct() throws InterruptedException
	{
		/*WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();*/
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Textbox.sendKeys("mobile");
		search_Textbox.click();
		/*Thread.sleep(3000);
		driver.quit();*/
	}
}
