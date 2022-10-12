package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityvsdependsOnMethods {
	
	//priority will describe in which order we need to execute the script 
	//dependsOnMethods will describe which method we need to execute in order and it will execute methods if another methods is passed 
	
	@Test()
	void openurl()
	{
		System.out.println("This method will open the url");
	}
	
	
	@Test(priority=1,dependsOnMethods= {"openurl"})
	void login()
	{
		System.out.println("This is my first method");
		
	}
	
	@Test(priority=2,dependsOnMethods= {"login"})
	void search() throws InterruptedException
	{
		System.out.println("This is my second method");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3,dependsOnMethods= {"search"})
	void logout()
	{
		System.out.println("This is my third method");
	}
	
	@Test(priority=4,dependsOnMethods= {"logout"})
	void Close()
	{
		System.out.println("driver is closed");
		
	}
	
	
	
	

}
