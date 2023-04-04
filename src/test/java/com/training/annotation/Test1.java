package com.training.annotation;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class Test1 {

	@Test(priority = 5)
	@Parameters({"username"})
	public void login(String username ) {
		System.out.println("My login TestNg framework");
		System.out.println(username);
	}
	
	@Test(priority = 2)
	public void Account() {
		System.out.println("My Account TestNg framework");
	}
	
	@BeforeMethod
	public void launch() {
		System.out.println("Launch Before Method");
	}
	@AfterTest
	public void Aftertest() {
		System.out.println("Aftertest");
	}
	
	@AfterMethod
	public void TearDown() {
		System.out.println("Close After Method");
	}
	
}
