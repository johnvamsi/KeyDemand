package javaPrograms;

import java.util.HashMap;
/*
 * Data Can be Stored in The Form Key and value 
 * Insertion order is not possible-(index not followed)
 * key is Unique and we can have duplicate values
 */
public class HashMapDemo {

	public static void main(String[] args) {
	
		//HashMap<String,Integer> map=new HashMap<String,Integer>();
		/*HashMap map=new HashMap();
		
		map.put("100","Vamsi");
		map.put("101","Kkkk");
		map.put("102","CCCC");
		map.put("103","Scott");
		map.put("104","David");
		
		System.out.println(map);
		
		//Extract single value
		System.out.println(map.get("102"));
		
		//remove
//		System.out.println(map.remove("102"));
//		System.out.println(map);
		
		//Print only the keys-map.keySet();
		
		System.out.println(map.keySet());
		
		//retrieve the keys 
		for(Object x:map.keySet()) 
		{
		     System.out.println(x);
		}
		
		
		//retrieve the keys and its value
		for(Object k:map.keySet())
		{
			System.out.println(k+"     "+map.get(k));
		}
		
		map.clear();
		System.out.println(map);*/
		
		HashMap<String,Integer> map = new HashMap();
		map.put("Vamsi", 1);
		map.put("Krsihna", 2);
		map.put("Automation", 3);
		map.put("Testing", 4);
		map.put("apiautomation", 5);
		map.put("apiautomationTest", 0);
		
		System.out.println(map);
		System.out.println(map.get("Automation"));
	boolean bb=	map.containsKey("apiautomationTest");
		System.out.println(bb);
	
		System.out.println(map.get("apiautomationTest"));
		

	}

}
