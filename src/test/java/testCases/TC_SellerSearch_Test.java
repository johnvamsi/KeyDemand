package testCases;

import org.testng.annotations.Test;

import pageObjects.CustomerSearchPage;
import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;

public class TC_SellerSearch_Test extends KeyDemand_BaseClass {
	
	@Test(priority=1)
	public void Test_Sellersearch() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		Thread.sleep(3000);
		CustomerSearchPage cs=new CustomerSearchPage(driver);
		cs.ClickCustomers();
		cs.clickEnterpriseTab();
		cs.EnterTextinSearch("Vamsitest");
		Thread.sleep(5000);
		cs.GetsellerName();
	}
	
	
	@Test(priority=2)
	public void Test_SellersearchCity() throws InterruptedException
	{
		driver.navigate().refresh();
		CustomerSearchPage cs=new CustomerSearchPage(driver);
		cs.clickEnterpriseTab();
		cs.EnterTextinSearch("Chittoor");
		Thread.sleep(5000);
		cs.GetsellerCity();
		
		
	}
	
	@Test(priority=3)
	public void Test_SellersearchDestination() throws InterruptedException
	{
		driver.navigate().refresh();
		CustomerSearchPage cs=new CustomerSearchPage(driver);
		cs.clickEnterpriseTab();
		cs.EnterTextinSearch("TestQualityaSsurance");
		Thread.sleep(5000);
		cs.GetsellerDesignation();
	
		
	}
	
	@Test(priority=4)
	public void Test_SellersearchEnterpriseName() throws InterruptedException
	{
		driver.navigate().refresh();
		CustomerSearchPage cs=new CustomerSearchPage(driver);
		 cs.clickEnterpriseTab();
		cs.EnterTextinSearch("TestDeeveloper");
		Thread.sleep(5000);
		cs.GetsellerEnterpriseName();
		
	}
	

}
