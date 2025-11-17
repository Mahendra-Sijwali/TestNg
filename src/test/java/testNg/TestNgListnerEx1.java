package testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestNgListnerEx1 implements ITestListener {
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test pass");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
	}
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}
	public void onStart(ITestContext result) {
		System.out.println("On Start");
	}
	public void onFinish(ITestContext result) {
		System.out.println("On Finish");
	}
	
}
