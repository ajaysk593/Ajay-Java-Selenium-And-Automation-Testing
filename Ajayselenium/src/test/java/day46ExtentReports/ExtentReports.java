package day46ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public  class ExtentReports implements ITestListener {
	
public ExtentSparkReporter  sparkReporter;
public ExtentReports Extent;
public ExtentTest test;
public void onstart(ITestContext context)
{
	sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/my Reports.html");
	
	sparkReporter.config().setDocumentTitle("Automation Reports");
	sparkReporter.config().setReportName("Functional Testing");
	sparkReporter.config().setTheme(Theme.DARK);
	Extent=new ExtentReports();
	Extent.attachReports(sparkReporter);
	Extent.setSystemInfo("computer Name","localhost");
	Extent.setSystemInfo("Environment","QA");
	Extent.setSystemInfo("Tester Name","AJAY");
	Extent.setSystemInfo("OS","Window10");
	Extent.setSystemInfo("Browser Name","Chrome");
}
public  void onTestsuccess(ITestResult result) {
test=Extent.createTest(result.getName());
test.log(Status.PASS,"Test case passed is:"+result.getName());
}
public void onTestfailure(ITestResult result) {
test=Extent.createTest(result.getName());
test.log(Status.FAIL,"Test Case failed is:"+result.getName());
}
public void onTestskipped(ITestResult result) {
test=Extent.createTest(result.getName());
test.log(Status.SKIP,"Test case skipped is:"+result.getName());
}
public void onfinsh(ITestContext context) {
	Extent.flush();
}









private void flush() {
	// TODO Auto-generated method stub
	
}
private ExtentTest createTest(String name) {
	// TODO Auto-generated method stub
	return null;
}
private void setSystemInfo(String string, String string2) {
	// TODO Auto-generated method stub
	
}
private void attachReports(ExtentSparkReporter sparkReporter2) {
	// TODO Auto-generated method stub
	
}


	
	
	
	
	
}
