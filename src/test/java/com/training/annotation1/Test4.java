package com.training.annotation1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void login() {
		System.out.println(" 2 My login TestNg framework Test4");
	}
	@Test
	public void login1() {
		System.out.println(" 2 My login one TestNg framework Test4");
	}
	
			
	@BeforeTest
	public void BeforeTest() {
		System.out.println("2 Launch url Before Test Test4");
	}
	
	@AfterSuite
	public void after() {
		System.out.println("after suite Test4");
	}
	
	@AfterMethod
	public void TearDown() {
		System.out.println("2 Close After Method Test4");
	}
	
}
