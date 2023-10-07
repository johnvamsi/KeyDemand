package javaPrograms;

class singleinheritance
{
	int b;
	void show(int y )
	{
		b=y;
		System.out.println(b);
	}
	
	static void print()
	{
		System.out.println("This is print method");
	}
}

public class Inheritance extends singleinheritance{
	int a ;
	void display(int x) 
	{
		a=x;
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		Inheritance i=new Inheritance();
		i.display(10);
		i.show(20);
		
		//i.print();
		print();
		
		
	
	}

}
