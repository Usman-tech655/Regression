package com.genericode;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ListenerTest implements ITestListener {

	public static void startTest()

	{

		ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");

		ExtentTest test= report.startTest("Key2Act");
		

	}

	public void onFinish(ITestContext Result) {
		System.out.println("The name of the testcase finished :" + Result.getName());
	}

	public void onStart(ITestContext Result) {
		System.out.println("The name of the testcase start :" + Result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		System.out.println("The name of the testcase SuccessPercentage is :" + Result.getName());
	}

	public void onTestFailure(ITestResult Result) {
		System.out.println("The name of the testcase failed is :" + Result.getName());
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println("The name of the testcase Skipped is :" + Result.getName());
	}

	public void onTestStart(ITestResult Result) {
		System.out.println(Result.getName() + " test case started");
	}

	public void onTestSuccess(ITestResult Result) {
		System.out.println("The name of the testcase passed is :" + Result.getName());
	}

}
