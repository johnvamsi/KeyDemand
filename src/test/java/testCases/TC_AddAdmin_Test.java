package testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AddAdminuser;
import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;
import utilities.XLUtils;

public class TC_AddAdmin_Test  extends KeyDemand_BaseClass{
	
	 
	@Test(dataProvider="ReG_Admindata")
	public void AddAdmin_Test() throws InterruptedException
	{
		
		LoginPage lp= new LoginPage(driver);
		AddAdminuser aa=new AddAdminuser(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		Thread.sleep(3000);
		aa.ClickAddTeam();
		aa.ClickAddAdmin();
		aa.EnterName("FronteTeam");
		aa.EnterEmail("BackenTea@yopmail.com");
		aa.EnterMobilenum("9000069385");
		aa.EnterPassword("DevTest@1234");
//		aa.selectCountry("India");
//		aa.selectState("Andhra Pradesh");
		aa.selectCity("Mumbai");
		aa.selectRoles("Relationship Manager");
		aa.ClickSave();
		Thread.sleep(5000);
		//driver.navigate().refresh(); 
		
		aa.userCreatedVerification();
		
		
		
}
	@DataProvider(name="ReG_Admindata")
	public String[][] getData() throws IOException
	{
		String xlpath = "C:\\Users\\HP\\Downloads\\TestDataLogin.xlsx";
		int rows = XLUtils.getRowCount(xlpath, "Admin");
		int cols = XLUtils.getCellCount(xlpath, xlpath, 1);
		String reg_Admindata[][] = new String[rows][cols];
		for(int r=1;r<=rows;r++) 
		{
			for(int c=0;c<cols;c++)
			{
				reg_Admindata[r-1][c]=XLUtils.getCellData(xlpath, "Admin", r, c);
			}
			
		}

		return reg_Admindata;
		
	}

}
