package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IndicesWithDataProvider {
	
	
	@Test(dataProvider="ddt")
	public void DDT(String Value,String status)
	{
		System.out.println(Value);
		System.out.println(status);
	}
	
	
	
	@DataProvider(name="ddt" ,indices= {0,3})
	public  String[][] getData()
	{
		String [][] data= {
										{"Value","Status"},
										{"Value1","Status1"},
										{"Value2","Status2"},
										{"Value3","Status3"},
										{"Value4","Status4"},
				
				
								  };
		
		
		return data;
	}


}
