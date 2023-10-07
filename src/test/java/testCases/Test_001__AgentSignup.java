package testCases;

import org.testng.annotations.Test;


import pageObjects.AgentSignupPage;
import testBase.KeyDemand_BaseClass;

public class Test_001__AgentSignup extends KeyDemand_BaseClass {
	
	@Test
	public void Test__AgentSignup() throws InterruptedException
	{
		AgentSignupPage as= new AgentSignupPage(driver);
		as.clickAgentSignup();
		as.setFirstname("Tez");
		as.setLastname("phonepe");
		as.setMobileNumber("9090909090");
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(1000);
		}
		
		
	}

}
