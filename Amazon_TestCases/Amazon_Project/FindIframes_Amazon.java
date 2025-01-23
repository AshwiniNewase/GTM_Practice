package Amazon_TestCases.Amazon_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindIframes_Amazon 
{

	@Test 
	public void findframes()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		List<WebElement> iframes = driver.findElements(By.tagName("iframe")); 
		for (WebElement iframe : iframes) 
		{ 
			System.out.println("Found an iframe: " + iframe.getAttribute("id"));
		}
		
	}
}
