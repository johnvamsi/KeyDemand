package interviewPrograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		//approach1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number to find prime or not ");
		int num=sc.nextInt();
		//int num=10;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					
						{
							count++;
							
						}
			}
			
			if(count==2)
			{
				System.out.println("Given number "+num+"   is  a prime number");
			}
			else 
			{
				System.out.println("Given number "+num+"   is not a prime number");
			}
		
		}
		else
		{
			System.out.println("Given number "+num+"   is not a prime number");
		}
	
		
	//approach 2
		/*boolean flag = false;
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag = true;
				break;
			}

		}
		if(flag==false)
		{
		System.out.println(num + " is a prime number");
		} else
		{
		System.out.println(num + " is not a prime number");
		}*/
		
		
	
		

	}

}
