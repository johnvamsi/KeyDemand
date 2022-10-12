package javaPrograms;

public class DataConversionFunctions {

	public static void main(String[] args) {
		//String s="welcome";
		//System.out.println(s.getClass().getName());
		
		//String to integer
		String s1="12345";
		Integer num =Integer.parseInt(s1);//this method wil convert string to integer data
		System.out.println(num);
		System.out.println(num.getClass().getName());
		
		//interger to string
		int x=100;
		String s =String.valueOf(x);//this method wil convert integer to string data
		System.out.println(s);
		System.out.println(s.getClass().getName());
		
		//String to double
		String s2="100.50";
		Double dd=Double.parseDouble(s2);
		System.out.println(dd);
		System.out.println(dd.getClass().getName());
		
		//double to string
		double dd1=100.50;
		String d=String.valueOf(dd1);
		System.out.println(d);
		System.out.println(d.getClass().getName());
		
		
		
	

	}

}
