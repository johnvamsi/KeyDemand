package interviewPrograms;

public class PrintEven_OddnumbersfromanArray {

	public static void main(String[] args) {
//   int a[]=new int[6];
//   a[0]=1;a[1]=2; a[2]=3;a[3]=4; a[4]=5;a[5]=6;
		int a[]= {10,20,35,56,78,40,91};
        int len=a.length;
       int even_c=0;
       int odd_c=0;
   for(int i=0;i<len;i++)
   {
	   if(a[i]%2==0)
	   {
		   System.out.println("This number is even      " +a[i]);
		   even_c++;
	   }
	   else
	   {
		   System.out.println("This number is Odd        "+a[i]);
		   odd_c++;
	   }
   }
   System.out.println("The even count is :"+even_c+"     The odd count is  "+odd_c);

	}

}
