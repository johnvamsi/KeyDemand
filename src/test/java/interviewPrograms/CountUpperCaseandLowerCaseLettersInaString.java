package interviewPrograms;

public class CountUpperCaseandLowerCaseLettersInaString {
	
	public static void main(String[]args) throws Exception
	{
		String ss= "WElcome To AutoMationTestinG";
		int upperCase=0;
		int lowerCase=0;
		for(int i=0;i<ss.length();i++)
		{
						
						char ch=ss.charAt(i);
						if(ch>=65 && ch<=90)
						{
							System.out.println(ch+"  UpperCase");
							upperCase++;
						}
						else
						{
							System.out.println(ch+" LowerCase");
							lowerCase++;
						}
		}
		System.out.println(upperCase);
		System.out.println(lowerCase);
		
	}
	 


}