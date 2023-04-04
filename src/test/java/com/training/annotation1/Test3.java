package com.training.annotation1;

import org.testng.annotations.Test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Test3 {

	@Test
	@Parameters({"username"})
	public void login(String username ) {
		System.out.println("My login TestNg framework Test3");
		System.out.println(username);
	}
	
	@Test
	public void Account() {
		System.out.println("My Account TestNg framework Test3");
	}
	
	@BeforeMethod
	public void launch() {
		System.out.println("Launch Before Method Test3");
	}

	
	@AfterMethod
	public void TearDown() {
		System.out.println("Close After Method Test3");
	}
	
}
