package interviewPrograms;

public class LargestNumbUsingArray {

	public static void main(String[]args)
	{
		int a[]= {10,30,40,20,50};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
				if(a[i]>max)
			   {
					max=a[i];
				}
		
		}
		System.out.println(max);
		
		//int a[]= new int[5];
	//a[0]=100; a[1]=200;a[2]=300;a[3]=400;a[4]=500;
		//int max=a[0];
		
		/*for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
			max=a[i];
		}
		
		}
		
		System.out.println(max);*/
		
		//minimum number in the array
		/*int a1[]= {10,20,30,40,50};
		int max1=a1[0];
		int min1=a1[0];
		for(int i=1;i<a1.length;i++)
		{
			if(a1[i]>max1)
			{
				max1=a1[i];
				System.out.println(max1);
			}
			else 
			{
				min1=a1[i];
				System.out.println(min1);
			}
		}
		System.out.println("Maximum number in the array is "+max1);
		System.out.println("Minimum number in the array is "+min1);*/
		
		
		
	}
	

}
