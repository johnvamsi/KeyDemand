package interviewPrograms;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.print("Enter the number that you want to multiply");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int c=1;c<=num;c++)
		{
			System.out.println(num+ "*" +c+ "     is="   +(num*c));
		}
			
			
		

		

	}

}
