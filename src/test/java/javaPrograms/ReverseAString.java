package javaPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		String str="madamm";		
	    String rev="";
	    System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			System.out.println(rev);
			if(str.equals(rev))
			{
				System.out.println("given string is an palindrome:");
			}
		}
		
		//System.out.println("Given string is not a palindrome");
		

	}

}
