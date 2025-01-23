package january16_Parallel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class LoginLogoutAmazon_Excelsheet
{
	WebDriver driver;
	@DataProvider(name="amazonlogin")
	public Object[][] amazonlogin_data() throws EncryptedDocumentException, IOException
	{
		Object[][] data=new Object[3][2];
		FileInputStream file=new FileInputStream("/Users/kiranshinde/eclipse-workspace/Maven_JanuaryProject/Testing Data/Amazon_LoginDetails.xlsx");
		Workbook workbook=WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheet("Login Details");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				Cell cell=sheet.getRow(i).getCell(j);
				if(cell.getCellType()==CellType.STRING)
				{
					data[i][j]=cell.getStringCellValue();
				}
				else
				{
					data[i][j]=NumberToTextConverter.toText(cell.getNumericCellValue());
				}
			}
		}
		return data;	
	}
	
	@BeforeMethod//(dataProvider="amazonlogin")
	public void login(String username, String password)
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement accountsandlist_headerlink=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(accountsandlist_headerlink).perform();
		WebElement signIn_buttonheader=driver.findElement(By.xpath("//span[.='Sign in']"));
		signIn_buttonheader.click();
		
		WebElement username_Inputbox=driver.findElement(By.xpath("//input[@name='email']"));
		username_Inputbox.sendKeys(username);
		WebElement continue_button=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		continue_button.click();
		
		WebElement password_Inputbox=driver.findElement(By.xpath("//input[@name='password']"));
		password_Inputbox.sendKeys(password);
		WebElement signIn_button=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		signIn_button.click();
	
	}
	@AfterMethod
	public void logout()
	{
		WebElement accountsandlist_headerlink=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(accountsandlist_headerlink).perform();
		WebElement signOut_link=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signOut_link.click();
		driver.quit();
	}
}
