package interviewPrograms;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all the three digits:");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is the Largest");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is the Largest");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is the Largest");
		}
		else
		{
			System.out.println("All the three digits has same value");
		}
				
		
		

	}

}
