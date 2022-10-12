package javaPrograms;

abstract class abc
{
	 int a =10;
	abstract void display();//abstract method
	void show()//non -abstract method
	{
		int b=20;
		System.out.println(b);
	}
	static void print()//static method
	{
		System.out.println("This method is static");	
	}
	
	public void displayConsole()
	{
		System.out.println("displayConsole");
	}
	
	abc()
	{
		System.out.println("iam a constructor from abc class");
	}
}
 
class XYZ extends abc
{
	void display()
	{
		System.out.println(a);
	}
	
}
public class AbstractExample {

	public static void main(String[] args) {
		XYZ abstracT=new XYZ();
		abstracT.a=200;
		System.out.println(abstracT.a);
		abstracT.display();
		abstracT.show();
		abstracT.print();
		abstracT.displayConsole();
		
		
		
		
		
	

	}

}
