package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterClassVsBeforeClass {
	
	//After and before class will run only once after and before of all testmethods
	
	@BeforeClass
	void Launchurl()
	{
		System.out.println("This method will execute before all the test methods");
	}
	
	@Test
	void Testlogin()
	{
		System.out.println("Login is completed");
	}
	
	@Test
	void search()
	{
		System.out.println("search is working ");
	}
	@Test
	void searchbyemail()
	{
		System.out.println("searchby email is working ");
	}
	
	@AfterClass
	void Closedriver()
	{
		System.out.println("This method will execute after all the test methods");
	}
	
	

}
