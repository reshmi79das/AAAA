package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listenerUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
System.out.println("Test execution started for :-----"+result.getName()+"------------");
		
	}

	public void onTestSuccess(ITestResult result) {
System.out.println("Test passed---"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
System.out.println("-------------Test Failed--------------");
System.out.println("Test Name is -----"+result.getName());
System.out.println("Status of the test is-----"+result.getStatus());
		System.out.println("***************"+result.getThrowable().getMessage()+"********************");
	}

	public void onTestSkipped(ITestResult result) {

		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {

		
	}

}
