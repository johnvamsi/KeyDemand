package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeTest {
		@Test(dataProvider="TestIndices")
		public void Test___Indices(String UserName)
		{
			System.out.println("The username is     "+UserName);
		
		}
		
		
		
		
	
		@DataProvider(name="TestIndices",indices= {0,2})
		public String[][]  getData()
		{
						  String[][] data= {
								  
												{"Value"},
												{"Value1"},
												{"Value2"},
												{"Value3"},
												{"Value4"},
								  											
								  
						  									};
						  return data;
		}
	

}
