package javaPrograms;

/*
1) Heterogenios data ---> allowed
2) Insertion order  --> preserved (Index)
3) Duplicate elements --> Allowed
4) Multiple nulls allowed
 * 
 */

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		/*int[] a= new int[5];
		a[0]=10;
		//a[1]="Vamsi";
		//a[2]=' ';
		//a[3]=10.50;
		//a[4]=true;
		
		System.out.println(a.length);
		for(Object x:a)
		{
			System.out.println(x);
		}
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//ArrayList
		//defining an arraylist
	/*	ArrayList list=new ArrayList();
		//to add data into the list we use add method
		list.add(100);
		list.add('K');
		list.add("Vamsi");
		list.add(10.5);
		list.add(true);//arraylist will also store the duplicate elements/objects and it will accept all types of data
		list.add(null);
		list.add(true);
		
		System.out.println(list);
		
		System.out.println(list.size());
//		for(Object x:list)
//		{
//			System.out.println(x);
//		}
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//if we want to remove the elements from the arryalist then we need to use remove
		
		list.remove(6);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		
		//To insert an elements in middle of an arraylist
		
		list.add(3, "Krishna");
		System.out.println(list);
		
		//To erase the data from arraylist we will use clear method
		
		list.clear();
		System.out.println(list);*/
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Vamsi");
		list1.add("Krishna");
		list1.add("Jesus");
		list1.add("John");
		System.out.println(list1);
		
		System.out.println(list1.get(3));
		list1.add(3, "Scott");
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		for(String x:list1)
		{
			
			System.out.println(x);
		}
		
		list1.remove(3);
		System.out.println(list1);
		
		list1.clear();
		System.out.println(list1);
		
		
		
		
		
		
	
		
	

	}
}
