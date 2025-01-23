package january16_Parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Amazon_loginlogout_Parallel 
{
	
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	@Parameters("browser")
	@BeforeMethod
	public void login(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		/*WebElement accountsandlist_headerlink=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(accountsandlist_headerlink).perform();
		wait.until(ExpectedConditions.visibilityOf(accountsandlist_headerlink));*/
		WebElement signIn_buttonheader=driver.findElement(By.xpath("(//span[.='Sign in'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(signIn_buttonheader));
		signIn_buttonheader.click();
		
		WebElement username_Inputbox=driver.findElement(By.xpath("//input[@name='email']"));
		username_Inputbox.sendKeys("newase777@gmail.com");
		WebElement continue_button=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		continue_button.click();
		
		WebElement password_Inputbox=driver.findElement(By.xpath("//input[@name='password']"));
		password_Inputbox.sendKeys("swamisamartH!2");
		WebElement signIn_button=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		signIn_button.click();
	}
	@AfterMethod
	public void logout()
	{
		WebElement accountsandlist_headerlink=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(accountsandlist_headerlink).perform();
		WebElement signOut_link=driver.findElement(By.xpath("//span[.='Sign Out']"));
		wait.until(ExpectedConditions.elementToBeClickable(signOut_link));
		signOut_link.sendKeys(Keys.ENTER);
		driver.quit();
	}
}
