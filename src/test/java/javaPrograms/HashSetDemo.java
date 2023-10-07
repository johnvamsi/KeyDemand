package javaPrograms;

import java.util.HashSet;

/*
1) Heterogenios data ---> allowed
2) Insertion order  --> Not preserved (Index)
3) Duplicate elements --> Not Allowed
4) Multiple nulls Not allowed/ only single null is allowed
 */

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add("Vamsi");
		set.add(100);
		set.add('c');
		set.add(100.50);
		set.add(true);
		set.add(null);
		
		System.out.println(set.size());
		
		//print the hashset
		System.out.println(set);
		
		//insertion is not possible in hashset
		//set.add(4,"Vamsi");
		
		//remove an element from an hashset
		set.remove(null);//here we need to remove the value not the index number
		System.out.println(set);
		
		//Retrieve specific of an element
	     //set.get(); it is not possible 
		
		//contains this method is used to check the elements in hashset
		System.out.println(set.contains("kk"));//false
		System.out.println(set.contains("Vamsi"));//true
		
		
//		set.isEmpty();
//		System.out.println(set.isEmpty());
		//set.clear();
		//System.out.println(set);
		System.out.println(set.isEmpty());
		for(Object x:set)
		{
			System.out.println(x);
		}
		
		
	

	}

}
