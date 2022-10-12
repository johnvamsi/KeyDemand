package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	int a =10;
	int b=20;
	
	
	@Test
	void Testassertions()
	{
		
		  Assert.assertTrue(true);
//		  System.out.println("THis is assertions test"); 
//		  Assert.assertEquals(a, b);
//		
////		  Assert.assertEquals(a, b);
//		  
			//Assert.assertTrue(a == b);
			Assert.assertFalse(a == b);
		 
		
	}

}
