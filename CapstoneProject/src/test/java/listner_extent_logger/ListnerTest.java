package listner_extent_logger;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class ListnerTest implements ITestListener{
	
public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+ "passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+ "fail");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+ "skipped");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName()+ "started");

}
}
