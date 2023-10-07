package interviewPrograms;

// 0 1 1 2 3 5 8 13 21 34.......

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+"   "+n2);
		for(int i=0;i<10;i++)
		{
			sum=n1+n2;
			System.out.print("   "+sum); 
			n1=n2;
			n2=sum;
			
			
		}
		//reverse a FibonacciSeries
		
		/*int a1=89;
		int a2=55;
		int sum1=0;
		System.out.print(a1+"   "+a2);
		for(int i=0;i<10;i++)
		{
			sum1=a1-a2;
			System.out.print("   "+sum1); 
			a1=a2;
			a2=sum1;*/
			
			
		}

	}


