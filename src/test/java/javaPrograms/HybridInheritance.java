package javaPrograms;
//HybridInheritance-is  a combination of multilevel and hiearrchy inheritance
interface PQR
{
	int a=10;
	default void displayValueA()
	{
		System.out.println(a);
	}
   void print();
	
	
	
}

interface STU extends PQR
{
	int b=20;
	default void displayValueB()
	{
		System.out.println(b);
	}
	
}

class CBA implements STU
{
	int c=30;
	 void displayValueC()
	{
		System.out.println(c);
	
     }
	
	public void print() 
	{
		System.out.println("This is print method");
		
	}
}

interface DEF
{
	int d=40;
	default void displayvalueD()
	{
		System.out.println(d);
	}
}

interface FED
{
	int f=50;
	default void displayvalueF()
	{
		System.out.println(f);
	}
}

public class HybridInheritance extends CBA implements DEF,FED
{
public static void main(String[]args)
	{
		
		  HybridInheritance hi=new HybridInheritance();
		  hi.displayValueA();
		  hi.displayValueB(); 
		  hi.displayValueC();
		  hi.displayvalueD();
		  hi.displayvalueF();
		  hi.print();
		
		
	}
}


