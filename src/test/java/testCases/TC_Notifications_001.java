package testCases;


import org.testng.annotations.Test;
import org.testng.Assert;
import pageObjects.LoginPage;
import pageObjects.NotificationsPage;
import testBase.KeyDemand_BaseClass;

public class TC_Notifications_001 extends KeyDemand_BaseClass{
	
	@Test
	public void Test_Notification() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.setUsername("devkeydemand@gmail.com");
		lp.setPassword("superadmin@1234");
		lp.ClickLogin();
		Thread.sleep(3000);
		
		NotificationsPage np=new NotificationsPage(driver);
		np.clickNotificationTab();
		np.CreateNotification();
		np.setNotificationTitle("Developer");
		np.setMessage("message for notification");
		np.setSelectUser("send it to selected user");
		np.seacrhMobileNumber("8903166445");
		np.clickSendButton();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		String Title=np.isNotificationcreated();
		System.out.println(Title);
		String actTitle="Developer";
		if(Title.equals(actTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		System.out.println("Test case is executed");
		
	
			
		
		
	}

}
