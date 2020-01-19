package com.way2.Listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomizeListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestStart(result);
		
		System.out.println("test start"+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSuccess(result);
		System.out.println("test success"+ result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailure(result);
		//<a href="/artifact/org.testng" xpath="1"></a>
		
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		Reporter.log("<a href=\"C:\\Users\\baha\\eclipse-workspace\\TestNGExample\\test-output\\img.jpg\" target =\"_blank\">see the screenshot</a>");
		Reporter.log("<br/>");
		
		Reporter.log("<a href=\"C:\\Users\\baha\\eclipse-workspace\\TestNGExample\\test-output\\img.jpg\" target =\"_blank\"> <img width =400, height =200, src = \"C:\\Users\\baha\\eclipse-workspace\\TestNGExample\\test-output\\img.jpg\"></a>");
		//Reporter.log("<a href=\"C:\\Users\\baha\\eclipse-workspace\\TestNGExample\\test-output\\img.jpg\" <img src = \"C:\\Users\\baha\\eclipse-workspace\\TestNGExample\\test-output\\img.jpg\"> target =\"_blank\"></a>");
		
		
		System.out.println("test fail"+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestSkipped(result);
		System.out.println("test skip"+ result.getName());
	}



}
