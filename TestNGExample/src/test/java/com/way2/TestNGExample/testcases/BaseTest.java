package com.way2.TestNGExample.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	@BeforeSuite
	public void init() {
		System.out.println("Test Suite starts");

	}

	@AfterSuite
	public void close() {

		System.out.println("Test Suite ends");
	}

}
