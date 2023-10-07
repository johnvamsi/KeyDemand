package javaPrograms;

public class EvenandOddnumbinArray {

	public static void main(String[] args) {
		int [] a=new int[5];
		a[0]=1;	a[1]=2;	a[2]=3;	a[3]=4;	a[4]=5;
		System.out.println(a.length);
		System.out.println(10%2);
		System.out.println(10/5);
		for(int i=0;i<a.length;i++)
		{
				if(a[i]%2==0)
				{
					System.out.println("Number is EVEN:" +a[i]);
				}
				else
				{
					System.out.println("Number is ODD:" +a[i]);
				}
			
		}

	}

}
