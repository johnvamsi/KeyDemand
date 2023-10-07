package interviewPrograms;

import java.util.HashSet;

public class RemoveDuplicatesFromString {
	public static HashSet set =new HashSet();
	public static void main(String[] args) {
	//	RemoveDuplicatesFromString Object = new RemoveDuplicatesFromString();
		String afterRemoval="";
		//String ss="DeLL";
		String ss="TestingByvamsiKrsihnaTestautomation";
		
		 char Char[]=ss.toCharArray();
		 for(int i=0;i<Char.length;i++)
		 {
			 //Object.set.add(Char[i]);
			 set.add(Char[i]);
			 
			 
		 }
		 for(Object s:set) 
		 {
			 //print the String after duplicates are removed 
			 System.out.print(s+"  ");
		 }
	

	}

}
