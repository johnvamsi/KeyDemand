package javaPrograms;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

//static keyword is used to avoid duplication and save memory as well as to update variable or methods we can use this keyword
//Static keyword can be used when any variable or method is shared across all the objects 

public class StaticExample {
	static int a=10;
	int b=20;
	static void m1()
	{
		System.out.println("This method belong to static ");
	}
	 void m2()
	{
		
		System.out.println("This method belong to not static ");
		
	}
	 void m()
	 {
		 //we can call static and non static variables and methods in non static methods 
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
		 
	 }
	

	public static void main(String[] args) 
	{
		//Static stuff can access static stuff directly  without creating object
		System.out.println(a);
		m1();
	
		//Static stuff cant access static stuff directly  without creating object for not static variables and methods
		//System.out.println(b);
		StaticExample se= new StaticExample();
		System.out.println(se.b);
		se.m2();
		
		se.m();
	
	}

}
