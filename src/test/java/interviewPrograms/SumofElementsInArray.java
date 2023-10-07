package interviewPrograms;

public class SumofElementsInArray {

	public static void main(String[] args) {
      int a[]= {10,20,30,40,50};
      int len=a.length;
      int sum=0;
      for(int i=0;i<len;i++)
      {
    	  sum=sum+a[i];
      }
     System.out.println("Sum of the elements in the array is :"+sum); 
      
      
      
      
      
      /*int sumOdd=0;
      int sumEven=0;
      for(int i=0;i<len;i++)
      {
    	  if(i==0 || i==2)
    	  {
    		  sumOdd=sumOdd+a[i];
    	  }
    	
    	  else
    	  {
    		  sumEven=sumEven+a[i];
    	  }
      }
    System.out.println("The odd number sum in the array is :"+sumOdd);
    System.out.println("The Even number sum in the array is :"+sumEven);*/
      
      
	}

}
