package interviewPrograms;

import java.util.Scanner;

public class OddandEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find odd or even ");
		
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Given number is even ");
		}
		else 
		{
			System.out.println("Given number is odd");
		}
		
		
	}

}
