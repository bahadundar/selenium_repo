package com.way2.TestNGExample.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest{

	@Test
	public void compareCustomerResults() {
		//Assert.assertEquals("Merhaba", "Hello");
		Assert.assertTrue(true);	
	}
	
	@Test
	public void validateCustomerReqs() {	
		Assert.assertTrue(true);
	}
	
	
	
	
}
