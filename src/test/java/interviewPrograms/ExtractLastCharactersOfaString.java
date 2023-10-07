package interviewPrograms;

public class ExtractLastCharactersOfaString {

	public static void main(String[] args) {
		String ss="TestAutomationByVamsi";
		  
		   String last="";
		   
		   for(int i=ss.length()-5;i<ss.length();i++)
		   {
			   last=last+ ss.charAt(i);
		   }
		   System.out.println("Last 5 characters are   "+last);

	}

}
