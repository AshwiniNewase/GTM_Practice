package testNG_Pract2_January;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ITestListener_Logic_17Jan implements ITestListener
{
	static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		
		Date d1 = new Date();
		//SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS");
		String date1=d1.toString();
		String date=date1.substring(8, 10)+date1.substring(4, 7)+date1.substring(24)+date1.substring(11, 16);
		TakesScreenshot sshot=(TakesScreenshot) driver;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File source_loc=sshot.getScreenshotAs(OutputType.FILE);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File dest_loc=new File("/Users/kiranshinde/eclipse-workspace/Maven_JanuaryProject/PassedTC_Screenshots"+date+".png");
		try {
			FileHandler.copy(source_loc, dest_loc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test Passed-L");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		ITestListener.super.onTestFailure(result);
		
		Date d1 = new Date();
		//SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS");
		String date1=d1.toString();
		String date=date1.substring(8, 10)+date1.substring(4, 7)+date1.substring(24)+date1.substring(11, 14);
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File source_loc=screenshot.getScreenshotAs(OutputType.FILE);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File dest_loc=new File("/Users/kiranshinde/eclipse-workspace/Maven_JanuaryProject/FailedTC_Screenshots"+date+".png");
		try {
			FileHandler.copy(source_loc, dest_loc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("Test Failed-L");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Test Skipped");
	}
	
}
