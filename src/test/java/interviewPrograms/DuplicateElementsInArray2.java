package interviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicateElementsInArray2 {

	public static void main(String[] args) {
		//remove duplicates using for -loop 
				//remove duplicates using HashSet
				//-1
				/*String a[]= {"Vamsi","Krishna","John","Scott","John","Krishna",};
				List mylist = new ArrayList();
				
				for(int i=0;i<a.length;i++)
				{
									mylist.add(a[i]);
								  for(int j=i+1;j<a.length;j++)
								  {
											   if(a[i].equals(a[j])) 
											   {
																	   mylist.remove(a[i]);
																	   System.out.println("This is duplicate element "+a[i]);
											   }
								  }
				}
				
				System.out.println("After removing ..elements are   ");
				 
				for(Object x :mylist)
				{
							System.out.print(x+"  ");
				}
				*/
				
				//-2
			/*	String a[]= {"Vamsi","Krishna","John","Scott","John","Krishna",};
				
				HashSet myset = new HashSet();
				
				for(int i=0;i<a.length;i++)
				{
								if(myset.add(a[i])==false)
								{
												System.out.println("This is duplicate ele ........"+a[i]);
								}
				}
				
						System.out.println("After removing elements.......");
						for(Object set:myset)
						{
										System.out.print(set+"  ");
						}*/

	}

}
