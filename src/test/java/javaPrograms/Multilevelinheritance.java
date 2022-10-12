package javaPrograms;
class A
{
	int a ;
	void show(int x )
	{
		a=x;
		System.out.println(a);
	}
}
class B extends A
{
	int b ;
	void display(int y )
	{
		b=y;
		System.out.println(b);
	}
}

class C extends B
{
	int c ;
	void Print(int z )
	{
		c=z;
		System.out.println(c);
	}
}

public class Multilevelinheritance {

	public static void main(String[] args) {
		C bobj=new C();
		bobj.show(10);
		bobj.display(20);
		bobj.Print(30);
	
	}

}
