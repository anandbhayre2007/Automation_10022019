package basicAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Module2 
{
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Module2");
	}
	
	
	@AfterClass
	public void afterModule()
	{
		System.out.println("After Module2");
	}
	
	@BeforeMethod
	public void beforeTesScript()
	{
		System.out.println("Before test script2");
	}	
	
	@AfterMethod
	public void afterTesScript()
	{
		System.out.println("After test script2");
	}	
	
	@Test
	public void test1()
	{
		System.out.println("Login test case2");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Logout test case2");
	}
	

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After suite");
	}
}
