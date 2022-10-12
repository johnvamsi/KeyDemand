package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.PostDemandPrimaryPage;
import testBase.KeyDemand_BaseClass;

public class TC_Postdemand_Test extends KeyDemand_BaseClass {
	
	@Test
	public void Test_PostaDemand() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		Thread.sleep(3000);
		PostDemandPrimaryPage pd=new PostDemandPrimaryPage(driver);
		pd.ClickCustomers();
		pd.EnterTextinSearch("Kvamc");
		for(int i=0; i<=1;i++)
		{
			Thread.sleep(5000);
		}
		
		pd.ClickEyeicon();
		pd.clickAddDemand();
		pd.selectPropertyDropdown("Retail");
		pd.enterCity("Banglore");
		pd.enterLocation("whitefield");
		pd.CheckBoxRent();
		pd.enterRentMaxandMin("1000","10000");
		pd.eneterCarpetareaMinandMax("500", "1000");
		//pd.selectOtherLocationsdropdown("guindy");
		//pd.selectDropdownEnduse("Retail");
		Thread.sleep(3000);
		pd.selectPossesiondropdown("Immediate");
		//pd.setPreferedFloor("Ground");
		//pd.selectOCrequireddropdown("Yes");
		pd.ClickGooglelocation();
		pd.clickPropertyImgReq();
		pd.clickProertyVideoReq();
		pd.setAboutProperty("Test Automation");
		pd.ClickNextBtn();
	}
	

}
