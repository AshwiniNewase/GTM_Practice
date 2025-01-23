package january16_Parallel;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_FailedTestCase_Logic implements IRetryAnalyzer
{

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}

}
