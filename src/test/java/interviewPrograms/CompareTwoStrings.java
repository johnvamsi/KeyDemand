package interviewPrograms;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		
		String s1, s2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string");
		s1 = in.nextLine();
		
		System.out.println("Enter the second string");
		s2 = in.nextLine();
		if ( s1.compareTo(s2) > 0 ) 
		{
			System.out.println("s1 comes after s2");
		}
	   else if ( s1.compareTo(s2) < 0 )
	   {
		   System.out.println("s1 comes before s2");
	   }
	else if( s1.compareTo(s2) ==0)
	{
		System.out.println("Both strings are equal.");
	}
		
		
	
	}

}
