package interviewPrograms;

public class FindEvenAndOdd {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int even_count=0,odd_count=0;
	
       for(int i=0;i<5;i++)
       {
    	   if(a[i]%2==0)
    	   {
    		   System.out.println(a[i]+"    this number is even");
    		   even_count++;
    	   }
    	   else
    	   {
    		   System.out.println(a[i]+"    this number is odd");
    		   odd_count++;
    	   }
    	  
       }
       
       System.out.println("The even count is ="+even_count+   "       the odd count is ="+odd_count);

	}

}
