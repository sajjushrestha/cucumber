package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases implements IRetryAnalyzer {
	
	private int retryCount=0;
	private int maxretryCount=2;

	@Override
	public boolean retry(ITestResult result) {
	
		if(retryCount<maxretryCount)
		{
			System.out.println("Retrying "+result.getName() + "again and count is "+retryCount);
			retryCount++;
			return true;
		}
		return false;
	}

}
