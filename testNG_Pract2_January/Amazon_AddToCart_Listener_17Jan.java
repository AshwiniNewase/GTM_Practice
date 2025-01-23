package testNG_Pract2_January;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ITestListener_Logic_17Jan.class)
public class Amazon_AddToCart_Listener_17Jan extends ITestListener_Logic_17Jan
{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	@BeforeMethod
	public void launch_amazon()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	@Test
	public void addtocartproduct()
	{
		WebElement search_Textbox=driver.findElement(By.id("twotabsearchtextbox"));
		search_Textbox.sendKeys("books"+Keys.ENTER);
		WebElement first_book=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(first_book));
		first_book.click();
		Set<String> allwindowids=driver.getWindowHandles();
		Iterator<String> windowids_itr=allwindowids.iterator();
		String parentid=windowids_itr.next();
		String childid=windowids_itr.next();
		driver.switchTo().window(childid);
		WebElement addToCart_Button=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		wait.until(ExpectedConditions.elementToBeClickable(addToCart_Button));
		addToCart_Button.click();
		String current_url=driver.getCurrentUrl();
		Assert.assertEquals(current_url.contains("cart"), true);
	}
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
