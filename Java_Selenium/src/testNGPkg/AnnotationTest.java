package testNGPkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@Test
	public void testMethod() {
		System.out.println("@Test");
	}
	
	@BeforeSuite
	public void BeforeSuiteMethod() {
		System.out.println("@BeforeSuite");
	}
	
	@AfterSuite
	public void AfterSuitetMethod() {
		System.out.println("@AfterSuite");
	}
	
	@BeforeTest
	public void BeforeTestMethod() {
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void AfterTestMethod() {
		System.out.println("@AfterTest");
	}
	
	@BeforeGroups
	public void BeforeGroupsMethod() {
		System.out.println("@BeforeGroups");
	}
	
	@AfterGroups
	public void AfterGroupsMethod() {
		System.out.println("@AfterGroups");
	}
	
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("@AfterClass");
	}
	
	@BeforeMethod
	public void BeforeMethodMethod() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethodMethod() {
		System.out.println("@AfterMethod");
	}
}
