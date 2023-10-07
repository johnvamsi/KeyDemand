package interviewPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class AdditionofLargerNumber {

	public static void main(String[] args) {
		String numb1,numb2;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a first largest number");
		 numb1=sc.nextLine();
		 BigInteger fisrt= new BigInteger(numb1);
		 
		 System.out.println("Enter a second largest number");
		 numb2=sc.nextLine();
		 BigInteger second= new BigInteger(numb2);
		 
		 BigInteger sum=fisrt.add(second);
		 
		 System.out.println("The sum of two lagerst numbers are :"+sum);
		 
		 
		 
	}

}
