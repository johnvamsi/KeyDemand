package testCases;

import org.testng.annotations.Test;

import pageObjects.AddAdminuser;
import pageObjects.EditAdminUser;
import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;

public class TC_EditAdmin_Test extends KeyDemand_BaseClass{
	
	@Test
	public void Test_EditAdmin() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		AddAdminuser aa=new AddAdminuser(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		EditAdminUser ea=new EditAdminUser(driver);
		ea.ClickAddMinteam();
		ea.ClickEditbutton();
	
		ea.EnterName("TestAutomation");
		ea.EnterEmail("viki@yopmail.com");
		ea.EnterMobilenum("1020304050");
		ea.selectCountry("India");
		ea.selectState("Andhra Pradesh");
		ea.selectCity("Chittoor");
		ea.selectRoles("Relationship Manager");
		ea.ClickSave();
		Thread.sleep(3000);
       ea.userUpdatedVerification();
				
	}

}
