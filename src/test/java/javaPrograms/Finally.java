package javaPrograms;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		System.out.println("Program is started...");

		int a[]=new int[5];  //0----4
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println("Enter Position:");
		int pos=sc.nextInt();
		
		try
		{
		a[pos]=num;
		}
		catch(Exception e)
		{
			System.out.println("Invalid input");
		}
		finally
		{
			System.out.println("Entered in to finally block.....");
		}
		
		System.out.println("Program is existed...");

	}

}
