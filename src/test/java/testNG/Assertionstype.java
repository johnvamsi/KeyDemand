package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertionstype {
	
	
@Test
	void test_hardassertions()
	{
		Assert.assertEquals("abc","xyz"); //Failed
		System.out.println("Hard assertion is completed.....");
	}
	
	
	@Test
	void test_softassertions()
	{
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("abc","xyz"); //Failed
		//Assert.assertEquals("abc","xyz");
		System.out.println("Soft assertion is completed.....");
		
		sa.assertAll(); // must be specified
	}

}
