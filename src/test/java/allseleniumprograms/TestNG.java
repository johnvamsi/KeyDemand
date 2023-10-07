package allseleniumprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	void bs()
	{
		System.out.println("This is before suite.....");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("This is beforetest........");
		
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is beforeClass........");
		
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("This is beforemethod........");
		
	}
	@AfterMethod
	void am()
	{
		System.out.println("This is aftermethod........");
		
	}
	
	@AfterClass
	void Ac()
	{
		System.out.println("This is AfterClass........");
		
	}
	@AfterTest
	void at()
	{
		System.out.println("This is after test.....");
	}
	
	 @Test
	 void m()
	 {
		 System.out.println("This is TestMethod");
	 }

	@AfterSuite
	void as()
	{
		System.out.println("This is after suite.....");
	}
	
}
