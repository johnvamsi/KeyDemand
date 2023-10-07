package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IGnoreTestCases {
	
	@Test
	
	public void IGNORE()
	{
		   System.out.println("This testCase needs to be ignored ");
	}
	@Test
	public void Test()
	{
		   System.out.println("This testCase needs to be Executed ");
	}

}
