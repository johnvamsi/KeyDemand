package testCases;

import org.testng.annotations.Test;

import pageObjects.CustomerSearchPage;
import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;

public class TC_Buyersearch_Test  extends KeyDemand_BaseClass{
	
	@Test(priority=1)
	public void Test_searchname() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		Thread.sleep(3000);
		CustomerSearchPage cs=new CustomerSearchPage(driver);
		cs.ClickCustomers();
		cs.EnterTextinSearch("Kvamc");
		Thread.sleep(5000);
		cs.GetName();
	
		
	}
	@Test(priority=2)
	public void Test_searchCity() throws InterruptedException
	{
		driver.navigate().refresh();
		CustomerSearchPage cs=new CustomerSearchPage(driver);
		cs.EnterTextinSearch("Chittoor");
		Thread.sleep(5000);
		cs.GetCity();
		
		
	}
	
	@Test(priority=3)
	public void Test_searchDestination() throws InterruptedException
	{
		driver.navigate().refresh();
		CustomerSearchPage cs=new CustomerSearchPage(driver);
		cs.EnterTextinSearch("QualityAassuranceTest");
		Thread.sleep(5000);
		cs.GetDesignation();
	
		
	}
	
	@Test(priority=4)
	public void Test_EnterpriseName() throws InterruptedException
	{
		driver.navigate().refresh();
		CustomerSearchPage cs=new CustomerSearchPage(driver);
		cs.EnterTextinSearch("Testinggttest");
		Thread.sleep(5000);
		cs.GetEnterpriseName();
		
		
	}
	
	
	


}
