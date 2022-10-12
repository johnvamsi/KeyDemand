package testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.EnterpriseEnquiriesPage;
import testBase.KeyDemand_BaseClass;
import utilities.XLUtils;

public class TC_EnterpriseEnquiry_001 extends KeyDemand_BaseClass {
	
	@Test(dataProvider="ReG_Enterprisedata")
	void Test_EnterprisesolnsForm(String uname,String cname,String designation,String sellorbuy,String city,String email,String phnum,String moC) throws InterruptedException
	{
		
		EnterpriseEnquiriesPage ee=new EnterpriseEnquiriesPage(driver);
		
		ee.ClickEnterpriseSolutions();
		logger.info("Clicked on enterprise form");
		ee.setUsername(uname);
		logger.info("Entered username");
		ee.setCompanyName(cname);
		logger.info("Entered compyname");
		ee.setDesignation(designation);
		logger.info("Entered designation");
		ee.selectWantoDropdown(sellorbuy);
		logger.info("selected want to drp");
		//ee.selectCountryDropdown(country);
		logger.info("selected country drp");
		//ee.selectStateDropdown(state);
		logger.info("selected state");
		ee.selectCityDropdown("Mumbai");
		logger.info("selected city");
		ee.setEmail(email);
		logger.info("entered mail");
		ee.setMobileNumber(phnum);
		Thread.sleep(2000);
		logger.info("entered mobile num");
		ee.selectMOCDropdown(moC);
		logger.info("select moc dropdown");
		ee.ClickSubmit();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
	}
	
	@DataProvider(name="ReG_Enterprisedata")
	public String[][] getData() throws IOException
	{
		String xlpath = "C:\\Users\\HP\\Downloads\\TestDataLogin.xlsx";
		int rows = XLUtils.getRowCount(xlpath, "EntpEnq");
		int cols = XLUtils.getCellCount(xlpath, "EntpEnq", 1);
		String reg_EnterEnqdata[][] = new String[rows][cols];
		for(int r=1;r<=rows;r++) 
		{
			for(int c=0;c<cols;c++)
			{
				reg_EnterEnqdata[r-1][c]=XLUtils.getCellData(xlpath, "EntpEnq", r, c);
			}
			
		}

		return reg_EnterEnqdata;
		
	}

}
