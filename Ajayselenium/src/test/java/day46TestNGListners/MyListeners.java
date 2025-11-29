package day46TestNGListners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener {
	
	public void onstart(ITestContext context) {
	System.out.println("Test Execution is Started.....");
	}
	
	public void onTest(ITestResult result) {
	System.out.println("Test Started......");
	}
	
	public void onTestSuccess(ITestResult result) {
	System.out.println("Test Passed....");
	}
	
	public void onTestfailure(ITestResult result) {
	System.out.println("Test Passsed......");
	}
	
	public void onTestskipped(ITestResult result) {
	System.out.println("Test is skipped.....");
	}
	
	public void onfinish(ITestResult result) {
	System.out.println("Test Execution is compeleted.........");
	
	
	}
}		
	
