package interviewPrograms;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string that you want to reverse");
//		Scanner sc = new Scanner(System.in);
//		String ss=sc.nextLine();
		String rev="";
		//int len=ss.length();
		//Using approach 1
//		for(int i=len-1;i>=0;i--)
//		{
//			rev=rev+ss.charAt(i);
//		}
//		System.out.println(rev);
		
		//Using approach 2
		
		/*char a[]= ss.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			rev =rev+a[i];
		}
		System.out.println(rev);*/
	
		//Using approach 3
		
		StringBuffer sb= new StringBuffer("VamsiKrishna");
	   System.out.println(sb.reverse());
		
		
		
     
     
     
     
    

	}

	

}
