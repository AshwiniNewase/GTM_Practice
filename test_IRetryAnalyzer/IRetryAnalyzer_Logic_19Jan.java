package test_IRetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzer_Logic_19Jan implements IRetryAnalyzer
{
	int init_retry=0;
	int final_retry=3;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(final_retry> init_retry)
		{
			init_retry++;
			return true;
		}
		return false;
	}

}
