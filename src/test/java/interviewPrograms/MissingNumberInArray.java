package interviewPrograms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		//Missing number in the array
   	 int a[]= {1,2,3,4,5,7,8};//12345
   	 int sum=0;
   	 for(int i=0;i<a.length;i++)
   	 {
   		 sum=sum+a[i];
   	 }
   	 System.out.println("sum of the array is "+sum);
   	 int sum1=0;
   	 for(int i=1;i<=8;i++)
   	 {
   		 	
   		 sum1=sum1+i;
   		
   	 }
   	 System.out.println("The  missing number in the array is :"+(sum1-sum));

	}

}
