package testCases;

import org.testng.annotations.Test;

import pageObjects.AddAdminuser;
import pageObjects.AdminTeamSearchBox;
import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;

public class TC_AddminSearchBox_Test extends KeyDemand_BaseClass{
	
	@Test(priority=1)
	public void searchByName() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		AddAdminuser aa=new AddAdminuser(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		AdminTeamSearchBox  as=new AdminTeamSearchBox(driver);
		as.ClickAddMinteam();
		as.EnterSearchvalue("TestAutomation");
		Thread.sleep(4000);
		as.verifyNameSearchResult();
	}

	
     
	@Test(priority=2)
	public void searchByMobilenum() throws InterruptedException
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		AdminTeamSearchBox  as=new AdminTeamSearchBox(driver);
		
	  
		as.EnterSearchvalue("8074835943");
		Thread.sleep(5000);
		as.VerifyMobNumSearchResult();
	}

}
