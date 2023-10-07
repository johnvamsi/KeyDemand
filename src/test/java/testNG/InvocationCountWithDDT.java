package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvocationCountWithDDT {
	
	@Test(dataProvider="INVOCATION_COUNT",invocationCount=5)
	public void DataDriverTest(String data)
	{
		System.out.println("Data from Dataprovider         "+data);
	}
	
	@DataProvider(name="INVOCATION_COUNT")
	public String[][] Get_Data()
	{
		String[][] data= { 
									{"Vamsi Test1"},
									{"Vamsi Test2"},
									{"Vamsi Test3"},
									{"Vamsi Test4"},
		
		
							};
		return data;
		}
	
			

}
