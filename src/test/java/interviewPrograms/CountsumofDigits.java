package interviewPrograms;

import java.math.BigInteger;

public class CountsumofDigits {

	public static void main(String[] args) {
	  int a=12345;
	  int sum=0;
	  while(a!=0)
	  {
		  sum=sum+a%10;
		  System.out.println(sum);
		  a=a/10;
	  }
	  System.out.println("The sum of given number is :"+sum);

	}

}
