package interviewPrograms;

import java.util.Scanner;

public class ArmStrongNumber {
	
	static int power(int rem,int digits)
	{
					int p = 1,c=1;
					for(c=1;c<=digits;c++)
					{
						p=p*rem;
					}
					
					return p;
		
	}
	
	public static void main(String[]args)
	{
		int digits=0,remainder = 0,temp,sum=0;
		System.out.println("Enter the number to find armstrong number or not");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		temp=a;
	    //count the digits
		while(temp!=0)
		{
			digits++;
			temp=temp/10;
        }
		System.out.println("Number of digits in the given number is "+digits);
		
		temp=a;
		while(temp!=0)
		{
			remainder=temp%10;
			sum=sum+power(remainder,digits);
			temp=temp/10;
		}
		
		if(a==sum)
		{
			System.out.println("Given number is an armstrong number "+a);
		}
		else
		{
			System.out.println("Given number is NOT an armstrong number "+a);
		}
		
		
		
		//logic -2 
		
		 System.out.println("Enter the number");
		  int n = sc.nextInt();
		  int b,i=0,j=0;
		  b=n;
		  while(b>0) 
		  {
			  i=b%10;
			  j=(i*i*i)+j;
			  System.out.println(j);
			  b=b/10;
		  }
		  if(n==j) {
		  System.out.println("It is amstrong");
		  }
		  else {
		  System.out.println("It is not a amstrong");
		  }
		
		
		
	}
	
		

	
}
