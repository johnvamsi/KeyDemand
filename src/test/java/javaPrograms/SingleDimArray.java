package javaPrograms;

public class SingleDimArray {

	public static void main(String[] args) {
		//declaration
		int[] a= new int[5];
		//initialization
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		//find length of an array
		System.out.println(a.length);
		//read single value from an array
		System.out.println(a[2]);
		//read all values from an array
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//defining an array in second way
		int b[]= {10,20,30,40};
		System.out.println(b.length);
		
		
		

	}

}
