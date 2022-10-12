package javaPrograms;

class Parent
{
	int a =10;
	void display() 
	{
		System.out.println(a);
	}
	
}
class Child1 extends Parent
{
	int b=20;
	void add() 
	{
		System.out.println(a+b);
	}
}
class Child2 extends Parent
{
	int c=20;
	void multiplication() 
	{
		System.out.println(a*c);
	}
	
}

public class HiearrachyInheritance {

	public static void main(String[] args) {
		Child1 c1= new Child1();
		c1.display();
		c1.add();
		Child2 c2= new Child2();
		c2.display();
		c2.multiplication();
		
		
	

	}

}
