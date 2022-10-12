package javaPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class BubbleSort {
	

	public static void main(String[] args) {
	int a[]= {5,4,3,1,2};
		System.out.println("Before sorting elements are :"+Arrays.toString(a));
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting elements are :"+Arrays.toString(a));
		
		
	}

}
