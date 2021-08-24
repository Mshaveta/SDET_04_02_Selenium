package TestNGDemos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite...");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test...");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test
	public void testCase1() {
		System.out.println("testCase1....");
	}

	@Test
	public void testCase2() {
		System.out.println("testCase2....");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test...");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite...");
	}
	


}
