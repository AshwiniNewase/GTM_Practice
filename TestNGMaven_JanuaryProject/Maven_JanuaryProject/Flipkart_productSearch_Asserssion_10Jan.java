package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flipkart_productSearch_Asserssion_10Jan 
{
	@Test
	public void productsearch()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement search_Inputbox=driver.findElement(By.name("q"));
		search_Inputbox.sendKeys("pens"+Keys.ENTER);
		
		List<WebElement> pens=driver.findElements(By.xpath("//div[@class='_4WELSP']"));
		System.out.println(pens.size());
		driver.quit();
	}
}
