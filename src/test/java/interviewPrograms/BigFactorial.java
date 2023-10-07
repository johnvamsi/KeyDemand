package interviewPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		BigInteger inc= new BigInteger("1");
		BigInteger fact= new BigInteger("1");
		System.out.println("Enter  number");
		int a= sc.nextInt();
		
		for(int c=1;c<=a;c++)
		{
			fact=fact.multiply(inc);
			inc=inc.add(BigInteger.ONE);
			
		}
       System.out.println("The factorial of the number is "+a+" is ="+fact);
       
	}

}
