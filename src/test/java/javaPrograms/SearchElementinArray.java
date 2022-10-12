package javaPrograms;

public class SearchElementinArray {

	public static void main(String[] args) {
		int [] a=new int[5];
		a[0]=100;	a[1]=200;	a[2]=300;	a[3]=400;	a[4]=500;
		int searh_ele=100;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==searh_ele)
			{
				System.out.println("Number is found:" +a[i]);
				flag=true;
				break;
						
			}
			
		}
		if(flag==false)
			
		{
			System.out.println("Number is Not found:" );
		}
		
		

	}

}
