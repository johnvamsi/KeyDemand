package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import allseleniumprograms.XLUtils;
import pageObjects.LoginPage;
import testBase.KeyDemand_BaseClass;

public class TC_Login_Test extends  KeyDemand_BaseClass{
	//@Test(dataProvider="RegLoginData",groups= {"regression"})
	@Test(dataProvider="SanityLoginData",groups= {"sanity"})
	public void Test_Login(String uname,String pwd) throws InterruptedException, IOException
	{
		LoginPage lp= new LoginPage(driver);
		lp.clearUserName();
		lp.clearPassWord();
		lp.setUsername(uname);
		lp.setPassword(pwd);
		lp.ClickLogin();
		lp.pageVerification();// --verification 1
		
		//below is verification 2
		/*String exp_title =lp. txt_dashboard.getText();
		
		if (exp_title.equals("Dashboard!!!!"))
			
		{
			System.out.println("testcase is passed");
			Assert.assertTrue(true);
		} 

        else {
        	      System.out.println("testcase is Failed");
      	           captureScreen(driver, "loginTest");
                    Assert.assertTrue(false);
        	    }*/
		
		
		Thread.sleep(2000);
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
		String[][] Logindata= {{"vamsi@yopmail.com","Test@1234"},{"devkeydemand@gmail.com","superadmin@1234"}};
		return Logindata;
		
	}

}
