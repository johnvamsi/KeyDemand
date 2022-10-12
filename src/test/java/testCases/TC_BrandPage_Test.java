package testCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddBuyer;

import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;

public class TC_BrandPage_Test  extends KeyDemand_BaseClass{
	
	@Test
	public void BrandPage_Test() throws InterruptedException, IOException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		Thread.sleep(3000);
		AddBuyer bp= new AddBuyer(driver);
		bp.clickCustomersTab();
		bp.clickAddBuyer();
		bp.enterContacTpersonName("KvamcK");
		bp.EnterCompanyName("Doodleeeeeblue");
		bp.selectCountryDrp("India");
		bp.selectStateDrp("Andhra Pradesh");
		bp.selectOperatingCities("Chittoor");
		bp.enterEmail("bbbbbbbbyyyyxyyyzz@yopmail.com");
		bp.enterDesignation("QualityAassuranceTest");
		bp.EnterPhoneNumber("9249647641");
		bp.EnterBrandName("Testinggttest");
		bp.EnterAboutBrand("In this poooosst, we will seee the difference between Test Strategy vs Test Plan. Before learning the difference between Test Strategy and Test Plan, let us first understand the individual concepts of Test Plan and Test Strategy in brief. In most of the interviews, you will face this question i.e., Test Strategy Vs Test Plan. Here in this post, we will show 10 differences between Test Strategy and Test Plan. Both these Test Strategy and Test Plan templates come under Test Artifacts. As a tester, these two templates are very useful in the Software Test Life Cycle (STLC).");
	    bp.EnterNoOfDemands("10");
	    bp.EnterValidityDays("31");
	    bp.EnterNoOfContactSuppliers("10");
	    bp.SeleCTEmailToSuppliers("Yes");
	    bp.EnterUserDashborad("Testdashboard");
	    bp.SeleCtAlerts("Daily");
	    bp.SelectReferalCredits("Yes");
	    bp.SelectFeaturePositioning("Yes");
	    bp.SeleCtAssistedUploading("Yes");
	    bp.SelectHomePageSlotBanner("Yes");
	    bp.SeleCtRelationshipManager("Yes");
	    Thread.sleep(5000);
	    bp.ClickBrandPage();
	    for(int i=0;i<=2;i++)
	    {
	    	Thread.sleep(5000);
	    }
	    Thread.sleep(3000);
	    
	    driver.navigate().refresh();
	  String verifyText= bp. ele_verifyname.getText();
	  if(verifyText.equals("KvamcK"))
	  {
		  System.out.println("Brandpage is created");
		  Assert.assertTrue(true);
	  }
	  
	  else  
	  {
		  System.out.println("Brandpage is not created");
		  captureScreen(driver,"AddBuyer");
		  Assert.assertTrue(false);
	  }
		  
	    
	
	
	}
	
	
	

}
