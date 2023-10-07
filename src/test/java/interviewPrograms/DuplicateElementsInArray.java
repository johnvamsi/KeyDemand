package interviewPrograms;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) 
	{
		//approach 1
		String a[]= {"Vamsi","Krishna","John","Scott","John"};
    	/*HashSet<String> set= new HashSet<String>();
    	boolean flag=false;
    	
    	
    	for(String l:a)
    	{
    		   
	    		if(set.add(l)==false)
	    		{
	    			System.out.println("Duplicate element found is :"+l);
	    			flag=true;
	    		}
    		
    	}
    	 if(flag==false)
    	 {
    		 System.out.println("Duplicate element is NOT found");
    	 }
    	 else
    	 {
    		 System.out.println("Duplicate element is  found");
    	 }*/
		boolean bb=false;
		for(int i=0;i<a.length;i++)
		{        
			int RepeatedWord=1;
					for(int j=i+1;j<a.length;j++)
					{
								//System.out.println(a[j]);
								if(a[i]==a[j])
								{
									RepeatedWord++;
									///System.out.println("Duplicate element in the array is "+a[j]);
									bb=true;
								}
					}
					if(RepeatedWord>1)
					{
						System.out.println("NUmb of Times word is repeated in string is "+RepeatedWord);
					}
		}
		if(bb==false)
   	 {
   		 System.out.println("Duplicate element is NOT found");
   	 }
   	 else
   	 {
   		 System.out.println("Duplicate element is  found");
   	 }
		

    	 
    	 

	}

}
