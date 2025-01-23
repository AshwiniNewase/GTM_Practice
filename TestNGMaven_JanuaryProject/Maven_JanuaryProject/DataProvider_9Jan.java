package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_9Jan 
{
	@DataProvider(name="product")
	public Object[][] varoius_product_testing()
	{
		Object[][] prod_name=new Object[3][1];
		prod_name[0][0]="mobile";
		prod_name[1][0]="cycle";
		prod_name[2][0]="wallpaper";
		return prod_name;	
	}
	@Test(dataProvider="product")
	public void search_product(String prod_name) throws InterruptedException
	{
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Textbox.sendKeys(prod_name);
		search_Textbox.click();
		Thread.sleep(6000);
		driver.quit();
	}
}
