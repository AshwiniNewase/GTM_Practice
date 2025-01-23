package testng_DataProvider_Excelsheet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Pract_19Jan 
{
	@DataProvider(name="data")
	public Object[][] productsearch()
	{
		Object[][] product= {{"book"},{"toy train"},{"mobile"}};
		return product;
	}
	
	
	@Test(dataProvider="data")
	public void amazonproductsearch(String productname)
	{
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Textbox.sendKeys(productname+Keys.ENTER);
		driver.quit();
	}
	
}
