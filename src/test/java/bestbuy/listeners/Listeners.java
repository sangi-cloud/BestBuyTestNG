package bestbuy.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import best.baseclass.BaseClass;
import bestbuy.extentreport.ExtentReportTestng;

public class Listeners extends BaseClass implements ITestListener{
	ExtentReports ext=  ExtentReportTestng.getReportObject();
	ExtentTest test;
	ThreadLocal<ExtentTest> t=new ThreadLocal<>();
@Override
public void onTestStart(ITestResult result) {
	test= ext.createTest(result.getMethod().getMethodName());
	t.set(test);
}

@Override
public void onTestSuccess(ITestResult result) {
	t.get().log(Status.PASS, "Test Passed");
}

@Override
public void onTestFailure(ITestResult result) {
	String path = null;
	t.get().fail(result.getThrowable());
	try {
		 path = TakeScreenshotAs(result.getMethod().getMethodName(), driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t.get().addScreenCaptureFromPath(path);
}

@Override
public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	ext.flush();
}

}

