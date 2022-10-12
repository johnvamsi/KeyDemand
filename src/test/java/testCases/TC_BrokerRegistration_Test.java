package testCases;



import java.awt.AWTException;

import org.testng.annotations.Test;

import pageObjects.BrokerPage;
import testBase.KeyDemand_BaseClass;

public class TC_BrokerRegistration_Test  extends KeyDemand_BaseClass {
	
	@Test
	public void BrokerSignup_Test() throws InterruptedException, AWTException 
	{
		BrokerPage bp=new BrokerPage(driver);
		bp.clickSingupAsaBroker();
		bp.setFirstName("Regina");
		bp.setLastName("john");
		bp.setMobileNumber("9777787777");
		bp.setEmail("DavidScotT@yopmail.com");
		bp.setPassword("Developer@1235");
		bp.setConformPassword("Developer@1235");
		bp.clickPrivacyCheckBox();
		bp.clickSignup();
//		bp.setProfilePicture1("");
//		bp.setProfilePicture2("");
//		bp.setAbout("");
//		bp.selectCity("Mumbai");
//		bp.clickSubmit1();
		Thread.sleep(3000);
	
		
		
	}

}
