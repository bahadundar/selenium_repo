package com.way2.Regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase5 {

	@AfterMethod
	public void closeBrowsers() {

		System.out.println("Close Browser");
		//Assert.assertTrue(true);
	}

	@Test(priority = 2, groups = "regression")
	public void doLogin() {
		Assert.assertTrue(false);
		System.out.println("Login");
	}

	@Test(priority = 1, groups = {"smoke", "regression"})
	public void doUserReg() {
		Assert.assertTrue(true);
		System.out.println("Reg");
	}

	@AfterTest
	public void closeDBConnection() {
		//Assert.assertTrue(true);
		System.out.println("Close DB");

	}

	@BeforeTest
	public void openDBConnection() {
		//Assert.assertTrue(true);
		System.out.println("open DB");

	}

	@BeforeMethod
	public void launchBrowsers() {
		//Assert.assertTrue(true);
		System.out.println("Launch Browser");
	}

}
