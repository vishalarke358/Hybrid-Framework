package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


	public class listeners extends baseClass implements ITestListener{
        
		//ExtentTest
		ExtentReports extent=extentReportGenrator.getReports();
		ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
		
		public void onTestStart(ITestResult result) {
			library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
			extentTest.set(library.test);
			library.test.addScreenCaptureFromBase64String(getScreenShot());
		}

		
		public void onTestSuccess(ITestResult result) {
			extentTest.get().log(Status.PASS,"Test Case is Pass");
			library.test.addScreenCaptureFromBase64String(getScreenShot());
		}

		public void onTestFailure(ITestResult result) {
			extentTest.get().log(Status.FAIL,"Test Case is Fail");
		}

		public void onTestSkipped(ITestResult result) {
			extentTest.get().log(Status.SKIP, "Test Case is Skip");
		}

		public void onFinish(ITestContext context) {
			extent.flush();
		}
		
		public static String getScreenShot() {
			TakesScreenshot ts=(TakesScreenshot) driver;
			return ts.getScreenshotAs(OutputType.BASE64);
					
		}
		
		
	
}
