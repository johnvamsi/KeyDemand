package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AftermethodVsBeforemethod {
	
	//before method and after method will run after and before every test method
	@BeforeMethod
	void Launchurl()
	{
		System.out.println("This will launch url before test method");
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
	
	@AfterMethod
	void Closedriver()
	{
		System.out.println("This will close the  driver after test method is executed ");
	}


}
