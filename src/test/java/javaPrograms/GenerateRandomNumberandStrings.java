package javaPrograms;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberandStrings {
	
	public String randomestring() 
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}
	
	public long randomeNumber() 
	{
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		//return (Integer.parseInt(generatedString2));
		return(Long.parseLong(generatedString2));
	}
	public int randomeNumber1() 
	{
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (Integer.parseInt(generatedString2));
	}

	public static void main(String[] args) 
	{
		GenerateRandomNumberandStrings random=new GenerateRandomNumberandStrings();
		for(int i=0;i<=10;i++)
		{
			System.out.println(random.randomeNumber()+"1");
			//System.out.println(random.randomestring());
		}
	
		
		
		
		
		
		

	}

}
