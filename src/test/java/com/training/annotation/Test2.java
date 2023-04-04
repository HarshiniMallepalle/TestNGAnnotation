package com.training.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Test(priority = 7)
	public void login() {
		System.out.println(" 2 My login TestNg framework order 1");
	}
	@Test(priority=11,groups={"title","web"})
	public void home() {
		System.out.println(" 2 My Home page");
	}
	
	@Test(priority=7,groups="web")
	public void accounts() {
		System.out.println(" 2 My accounts page");
	}
	@Test(priority=9,groups="title")
	public void log() {
		System.out.println(" 2 My login one TestNg framework order 2");
	}
//	@Test
//	@Parameters({"username","pswd"})
//	public void Account(String username, String pswd) {
//		System.out.println("2 My Account TestNg framework");
//		System.out.println(username);
//		System.out.println(pswd);
//	}
			
	@BeforeTest(groups={"web","title"})
	public void BeforeTest() {
		System.out.println("2 Launch url Before Test");
	}
	@BeforeSuite(groups={"web","title"})
	public void Beforesuite() {
		System.out.println("2 before launch Before suite");
	}
	@AfterSuite(groups={"web","title"})
	public void after() {
		System.out.println("after suite");
	}
	
	@AfterMethod(groups={"web","title"})
	public void TearDown() {
		System.out.println("2 Close After Method");
	}
	
}
