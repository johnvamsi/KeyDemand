package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.AddAdminuser;
import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;
import utilities.XLUtils;

public class TC_AdminDDT_02 extends KeyDemand_BaseClass{
	
	@Test(dataProvider="RegData")
	public void Test_Admin(String name,String email,String mobnumb,String password,String Value) throws InterruptedException, IOException
	{
		LoginPage lp= new LoginPage(driver);
		AddAdminuser aa=new AddAdminuser(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		
		Thread.sleep(3000);
		aa.ClickAddTeam();
		aa.ClickAddAdmin();
		aa.EnterName(name);
		aa.EnterEmail(email);
		aa.EnterMobilenum(mobnumb);
		aa.EnterPassword(password);
		aa.selectCity("Mumbai");
		aa.selectRoles("Relationship Manager");
		aa.ClickSave();
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(5000);
		}
		
		
		//driver.navigate().refresh(); 
		//boolean accountCreated=aa.isAccountCreated();
		String Sucess_msg=aa.getSuccessMessage();
		if(Value.equals("Valid"))
		{
		 if(Sucess_msg.equals("Relationship Manager added successfully.")) 
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
			
		}
		
		if(Value.equals("Invalid"))
		{
						 if(Sucess_msg.equals("Relationship Manager added successfully."))
							{
										captureScreen(driver,"Admintest");
										Assert.assertTrue(false);
							}
							else
							{
										Assert.assertTrue(true);
							}
		}
		Thread.sleep(5000);
		
		
	}
	
	@DataProvider(name="RegData")
	public String[][] getdata() throws IOException
	{
		String xlpath="C:\\Users\\HP\\Downloads\\TestDataLogin.xlsx";
		int rows=XLUtils.getRowCount(xlpath,"Sheet2");
		int cols=XLUtils.getCellCount(xlpath,"Sheet2", 1);
		String logindata[][]=new String[rows][cols];
		for(int r=1;r<=rows;r++)
		{
							for(int c=0;c<cols;c++)
							{
											logindata[r-1][c]=XLUtils.getCellData(xlpath, "Sheet2", r, c);
							}
		}
		
		
		return logindata ;
	}
	
	
	@DataProvider(name="SanityData")
	public String[][] getData()
	{
		String[][] Admin_sanityData= {{"FrontBackTeam","FrontBackTeam@yopmail.com","8002530030","dev@12345","Valid"}};
		return Admin_sanityData;
	}

}
