package javaPrograms;

import java.util.Scanner;

public class Interviewquestions {

	public static void main(String[] args) {
		/*int num=17711771;
		int num=1234;
		int rev_num=0;
		while(num!=0)
		{
			rev_num=rev_num*10+num%10;
			num=num/10;
			System.out.println(num);
			if(rev_num==num)
			{
				System.out.println("Given number is palindrome");
			}
		}
		//Count how many numbers are there in a variable
		int num=12345678;
		int count =0;
	
		while(num!=0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("Number of digits are :"+count);
		
		//Count sum of digits
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int num=sc.nextInt();
		//or 
	    int num=123456789;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
			
		}
		System.out.println("sum of given number is :"+sum);
		
		
		//Find Number of even and odd digits in a number
		int num=123456789;
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else 
			{
				odd_count++;
			}
			num=num/10;
		}
		System.out.println(even_count);
		System.out.println(odd_count);
	
		
	/*	String ss="vaammmssi";
		String a[]=new String[9];
		a[0]="v";a[1]="a";a[2]="a";a[3]="m";a[4]="m";a[5]="m";a[6]="s";a[7]="s";a[8]="i";
		
		for(int i=1;i<=8;i++)
		{
			if(a[i]==a[i+1])
			{
				System.out.println(a[i]);
			}
		}	*/
		
		
		
	

	}

}
