package interviewPrograms;

import java.util.Scanner;

public class FloidasTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows of floidas triangle that you want");
		//Scanner sc = new Scanner(System.in);
		//int num=sc.nextInt();
		int num1=1;
		
		for(int c=1;c<=10;c++)
		{
			for(int d=1;d<=c;d++)
			{
				System.out.print(num1+"  ");
				num1++;
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}
