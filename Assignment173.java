package javaAssignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment173 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement automateMe_FooterLink=driver.findElement(By.xpath("(//a[@href='https://grotechminds.com/automate-me/'])[1]"));
		Point loc1=automateMe_FooterLink.getLocation();
		int y1=loc1.getY();
		js.executeScript("window.scrollBy(0,"+y1+")");
		wait.until(ExpectedConditions.visibilityOf(automateMe_FooterLink));
		automateMe_FooterLink.sendKeys(Keys.ENTER);
		
		//js.executeScript("window.scrollBy(0, 1500)");
		WebElement horizontalScroll_Card=driver.findElement(By.xpath("//a[@href='https://grotechminds.com/horizontal-scrolling/']"));
		WebElement verticleScroll_Card=driver.findElement(By.xpath("//a[@href='https://grotechminds.com/vertical-scrolling/']"));
		Point loc2=horizontalScroll_Card.getLocation();
		int y2=loc2.getY();
		js.executeScript("window.scrollBy(0,"+y2+")");
		wait.until(ExpectedConditions.visibilityOf(verticleScroll_Card));
		verticleScroll_Card.sendKeys(Keys.ENTER);
		
		Set<String> allbrowserid=driver.getWindowHandles();
		Iterator<String> iteratorIds=allbrowserid.iterator();
		String parentid=iteratorIds.next();
		String childid=iteratorIds.next();
		driver.switchTo().window(childid);
		WebElement pract1_link=driver.findElement(By.linkText("Practice1"));
		Point loc3=pract1_link.getLocation();
		int y3=loc3.getY();
		js.executeScript("window.scrollBy(0, "+y3+")");
		pract1_link.sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
