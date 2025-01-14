package testNG_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/* Assignment 182
launch amaozn->search a aproduct->assert and verify if test case is pass                        
"List<Webelement> l=driver.fes(by.xpath(""""));
Assert.assertequals(l.size()>20,true);"*/
public class Assignment182 
{
	@Test
	public void search_product()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Textbox.sendKeys("shoes"+Keys.ENTER);
		
		List<WebElement> shoe_list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		System.out.println(shoe_list.size());
		
		Assert.assertEquals(shoe_list.size()>50, true);
		
		driver.quit();
		
	}
}
