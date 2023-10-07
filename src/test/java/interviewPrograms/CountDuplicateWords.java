package interviewPrograms;

public class CountDuplicateWords {

	public static void main(String[] args) {
	
		 String string = "Big black bug bit a big black dog on his big black nose"; 
		    string= string.toLowerCase();
		   String aa[]=string.split(" ");
 			 for(int i=0;i<aa.length;i++)
 			 {
 				     	int repeatedWord=0;
 				       for(int j=i+1;j<aa.length;j++)
 				       {
 				    	   		if(aa[i].equals(aa[j]))
 				    	   		{
 				    	   			repeatedWord++;
 				    	   			aa[j]="0";
 				    	   		}
 				       }
 				       if(repeatedWord>1  && aa[i]!="0")
 				       {
 				    	   System.out.println("Repeated Word Count is     "+repeatedWord+"  and Word is    "+aa[i]);
 				       }
 			 }

	}
}
