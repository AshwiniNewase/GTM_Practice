package testNG_Pract2_January;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestCaseLogic_16Jan implements IRetryAnalyzer
{
	int init_count=0;
	int retry_count=3;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(retry_count>init_count)
		{
			init_count++;
			return true;	
		}
		
		return false;
	}

}
