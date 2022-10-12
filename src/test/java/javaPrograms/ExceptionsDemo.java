package javaPrograms;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is inprogress");
		
		
		//arithmetic exception
		Scanner sc= new Scanner(System.in);
		//arithmetic exception
		/*int num=sc.nextInt();
		System.out.println(100/num);
		
		//ArrayIndexOutofBoundsException
		int[] a= new int[5];
		System.out.println("Enter the value of an integer");
		int num=sc.nextInt();
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		a[pos]=num;
		
		//numberformatException
		System.out.println("Enter the string");
		String s=sc.next();
		int num=Integer.parseInt(s);*/
		
		//null pointerException
		String s=null;
		System.out.print(s.length());
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
		
	

	}

}
