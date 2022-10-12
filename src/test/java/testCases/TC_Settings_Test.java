package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.SettingsPage;
import testBase.KeyDemand_BaseClass;

public class TC_Settings_Test extends KeyDemand_BaseClass{
	
	@Test(groups= {"regression"})
	public void Test_Settings() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		Thread.sleep(3000);
		SettingsPage sp= new SettingsPage(driver);
		sp.clickSettings();
		sp.setCompanyName("Apple");
		sp.setContactus("Hyederbad,Karnataka,jubilee hills,pincode -517152, maharastra 400000000000sdfsdddddfsdfsd");
		sp.setEmailid("Automationtest@yopmail.com");
		sp.setPhoneNumber("5454545457");
		sp.setDescription("Automationtest test Automation");
		sp.setWhatsappURL("https://web.whatsapp.com/");
		sp.setFacebookURL("https://www.facebook.com/");
		sp.setInstangramURL("https://www.instagram.com/");
		sp.clickSavebutton();
		Thread.sleep(3000);
	     sp.VerifySucessMessage();
	}

}
