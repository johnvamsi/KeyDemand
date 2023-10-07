package interviewPrograms;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomStringandNumbers {
	
	
	public static String generateString(int count)
	{
		String generatedString=RandomStringUtils.randomAlphabetic(count);
		return(generatedString);
	}
	
	public static int generateNumber(int count)
	{
		String generatedNumber=RandomStringUtils.randomNumeric(count);
		return(Integer.parseInt(generatedNumber));
		
	}
	public static String randomAlphaNumeric(int count )
	{
		String generatedString2=RandomStringUtils.randomAlphanumeric(count);
		return(generatedString2);
	}
	public static void main(String[]args)
	{
		
//		System.out.println(generateString(10));
//		System.out.println(generateNumber(5));
		System.out.println(randomAlphaNumeric(10));
	}

}
