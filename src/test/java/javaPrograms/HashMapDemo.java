package javaPrograms;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	
		//HashMap<String,Integer> map=new HashMap<String,Integer>();
		HashMap map=new HashMap();
		
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
		System.out.println(map);
		
		
		
		

	}

}
