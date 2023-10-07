package interviewPrograms;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {
		System.out.println("Program is started");
		 Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println("before reversing number is "+a);
		//a=12345
		int revnum=0;
		while(a!=0)
		{
			revnum=revnum*10+(a%10);
			a=a/10;
        }
		System.out.println(revnum);

	}

}
