package interviewPrograms;

public class CountUpperCaseandLowerCaseLettersInaString2 {
	
	public static void main(String[]args) throws Exception
	{
		String ss= "WElcome To AutoMationTestinG";
		int upperCase=0;
		int lowerCase=0;
		for(int i=0;i<ss.length();i++)
		{
						
						char ch=ss.charAt(i);
					
						if(Character.isUpperCase(ch))
						{
							System.out.println(ch+"  UpperCase");
							upperCase++;
						}
						else if(Character.isLowerCase(ch))
						{
							System.out.println(ch+" LowerCase");
							lowerCase++;
						}
		}
		System.out.println(upperCase);
		System.out.println(lowerCase);
		
	}
	 


}