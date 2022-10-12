package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import allseleniumprograms.XLUtils;

import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;

public class TC_LoginDDT_01 extends KeyDemand_BaseClass{
	
	//@Test(dataProvider="SanityLoginData",groups= {"sanity"})
	 @Test(groups= {"regression"},dataProvider="RegLoginData")
	public void Test_Login(String email,String pwd,String value) throws InterruptedException, IOException
	{
		LoginPage lp= new LoginPage(driver);
		lp.clearUserName();
		lp.clearPassWord();
		lp.setUsername(email);
		lp.setPassword(pwd);
		lp.ClickLogin();
     	boolean dshboardpage=	lp.isMyDashboardExists();
     	if(value.equals("Valid"))
     	{
     		if(dshboardpage==true)
     		{
     			
     			lp.ClickLogout();
     			Assert.assertTrue(true);
     		}
     		else
     		{
     			
     			Assert.assertTrue(false);
     			
     		}
     	}	
     	if(value.equals("Invalid"))
     		{
     			if(dshboardpage==true)
     			{
     				
     				lp.ClickLogout();
         			Assert.assertTrue(false);
     			}
     			else
     			{
     				
     				Assert.assertTrue(true);
     			}
     		}
     		
     		driver.navigate().refresh();
     		
     	}
		
		
	@DataProvider(name="RegLoginData")
	public String[][] getdata() throws IOException
	{
		String xlpath="C:\\Users\\HP\\Downloads\\TestDataLogin.xlsx";
		int rows=XLUtils.getRowCount(xlpath,"Sheet1");
		int cols=XLUtils.getCellCount(xlpath,"Sheet1", 1);
		String logindata[][]=new String[rows][cols];
		for(int r=1;r<=rows;r++)
		{
			for(int c=0;c<cols;c++)
			{
				logindata[r-1][c]=XLUtils.getCellData(xlpath, "Sheet1", r, c);
			}
		}
		
		
		return logindata ;
	}
	
	@DataProvider(name="SanityLoginData")
	public String[][] getData()
	{
		String[][] Logindata= {{"vamsi@yopmail.com","Test@1234","Invalid"},{"devkeydemand@gmail.com","superadmin@1234","Valid"}};
		return Logindata;
		
	}
		
		
		
	

}

	
	
	
	

