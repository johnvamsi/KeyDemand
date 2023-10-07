package interviewPrograms;

public class CountDuplicateCharcatersInString {

	public static void main(String[] args) {
		
		String string1 = "VamsiKrishnaVamsiTestingSoftware";  
		//String string1="Vams  iTestAu  toma  tiontest  MyVamsi";
        int count;  
          
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        //Counts each character present in the string  
        for(int i = 0; i <string.length; i++)
        {  
            	count = 1;  int dupliCateWordCount=0;
			            for(int j = i+1; j <string.length; j++) 
			            {  
						                if(string[i] == string[j] && string[i] != ' ') 
						                {  
						                    count++;  dupliCateWordCount++;
						                    //Set string[j] to 0 to avoid printing visited character  
						                    string[j] = '0';  
						                }  
			            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0') 
            {
            	//System.out.println(string[i]);
            	System.out.println(string[i]+"     Duplicate count is "+dupliCateWordCount);
            }
                  
        }  
		
		
		
		
		
		
		
	}
}
