package interviewPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int a, b, c, d;
		System.out.println("Enter the range of numbers to print their multiplication");
		Scanner sc = new Scanner(System.in);
		 a=sc.nextInt();
		 b=sc.nextInt();
		 
		 for( c=a;c<=b;c++)
		 {
			 System.out.println("Multiplication table of "+c);
			 for( d=1;d<=10;d++)
			 {
				 System.out.println(c+"*"+d+  "is =" +(c*d));
				 
			 }
		 }
		
		
		

		

	}

}
