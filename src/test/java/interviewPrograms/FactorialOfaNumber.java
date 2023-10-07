package interviewPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfaNumber {

	public static void main(String[] args) {
		int  Fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a =sc.nextInt();
		
		if(a>0)
		{ 
			 for(int c=1;c<=a;c++)
			 {
				 Fact =Fact*c;
			 }
			
		}
		else
		{
			System.out.println("factorial number must be non-negative");
		}
	
		System.out.println("The factorial of the given number is :"+a+"    is ="+Fact);
		

	}

}
