package com.way2.TestNGExample.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest{

	@Test
	public void doRegister() {

		Assert.assertTrue(false);
	}

	@Test(priority = 1, dependsOnMethods = { "doRegister" })
	public void doLogin() {
		Assert.assertTrue(true);
	}

	@Test(priority = 2, dependsOnMethods = { "doRegister" }, alwaysRun = true)
	public void doOrder() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3)
	public void doPayment() {
		Assert.assertTrue(false);
	}

}
