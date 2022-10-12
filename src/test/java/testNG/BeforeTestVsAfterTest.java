package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestVsAfterTest {
	
	@BeforeTest
	void BT()
	{
		System.out.println("This method will execute  before all the beforeclass methods");
	}
	
	@BeforeClass
	void Launchurl()
	{
		System.out.println("This beforeclass method will execute before all the test methods");
	}
	
	@BeforeMethod
	void setup()
	{
		System.out.println("This method will execute before all the test methods");
	}
	
	@Test
	void Testlogin()
	{
		System.out.println("Login is completed");
	}
	
	@Test
	void logout()
	{
		System.out.println("logout is done");
	}
	
	@AfterMethod
	void Closethebr()
	{
		System.out.println("This method will execute after all the test methods");
	}
	
	
	
	@AfterClass
	void Closedriver()
	{
		System.out.println("This after class method will execute after all the test methods");
	}
	
	@AfterTest
	void AT()
	{
		System.out.println("This method will execute  after all the afterclass methods");
	}

}
