package TestNGMaven_JanuaryProject.Maven_JanuaryProject;

import java.io.FileInputStream;
import java.io.IOException;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Excelsheet_13Jan 
{
	@DataProvider(name="login_data")
	public Object[][] amazon_logindata() throws EncryptedDocumentException, IOException
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
				if (cell.getCellType() == CellType.STRING) 
				{
				    data[i][j] = cell.getStringCellValue();
				} 
				else if (cell.getCellType() == CellType.NUMERIC) 
				{
					data[i][j]= NumberToTextConverter.toText(cell.getNumericCellValue());
				}
			}
		}
		return data;	
	}
	@Test(dataProvider="login_data")
	public void amazon_login(String username, String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.co.uk/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=gbflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		WebElement mobileNumber_textbox=driver.findElement(By.id("ap_email"));
		mobileNumber_textbox.sendKeys(username);
		WebElement continue_button=driver.findElement(By.id("continue"));
		continue_button.click();
		
		WebElement password_Textbox=driver.findElement(By.xpath("//input[@id='ap_password']"));
		password_Textbox.sendKeys(password);
		WebElement signIn_Button=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signIn_Button.click();
		
		driver.quit();
	}
	
}

