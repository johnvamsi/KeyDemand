package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AddSeller;
import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;

public class TC_AddSeller_Test  extends KeyDemand_BaseClass{
	
	@Test
	public void Test_AddSeller() throws InterruptedException, IOException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		Thread.sleep(3000);
		AddSeller as=new AddSeller(driver);
		as.clickCustomersTab();
		as.ClickSellersTab();
		as.clickaddseller();
		as.enterContacTpersonName("VamsitestTs");
		as.EnterCompanyName("Microosofts");
		as.selectCountryDrp("India");
		as.selectStateDrp("Andhra Pradesh");
		as.selectOperatingCities("Chittoor");
		as.enterEmail("sssssssssssstt@yopmail.com");
		as.enterDesignation("TestQualityaSsurance");
		as.EnterPhoneNumber("7275527275");
		as.EnterDeveloperName("TestDeeveloper");
		as.EnterStats("MystatusissOnline");
		as.EnterAboutDevelopers("est Strategy is aa high-level document (static document) and usually developed by a project manager. It is a document which captures the approach on how we go about testing the product and achieve the goals. It is normally derived from the Business Requirement Specification (BRS). Documents like Test Plan are prepared by keeping this document as base.");
		as.EnterNoofPropertyUploads("10");
		as.EnterValidityDays("30");
		as.EnterUserDashborad("SellersDashboard");
		as.SelectDemandMails("Daily");
		as.SelectReferalCredits("Yes");
		as.SelectFeaturePositioning("Yes");
		as.SeleCtAssistedUploading("Yes");
		as.EnterSubmissionagainstDemanD("yessSubmitAgainstDeamnd");
		as.SeleCtRelationshipManager("Yes");
		as.ClickSellerPage();
		
		
		 for(int i=0;i<=2;i++)
		    {
		    	Thread.sleep(5000);
		    }
		    Thread.sleep(3000);
		    
		    driver.navigate().refresh();
		  String verifyText= as. ele_verifyname.getText();
		  if(verifyText.equals("VamsitestTs"))
		  {
			  System.out.println("sellerpage is created");
			  Assert.assertTrue(true);
		  }
		  
		  else  
		  {
			  System.out.println("sellerpage is not created");
			  captureScreen(driver,"AddSeller");
			  Assert.assertTrue(false);
		  }
	}

}
