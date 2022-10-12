package javaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		String str="madam";
	    String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			if(str.equals(rev))
			{
				System.out.println("given string is an palindrome:");
			}
		}
		
		System.out.println("Given string is not a palindrome");
		

	}

}
