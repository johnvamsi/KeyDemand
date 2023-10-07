package javaPrograms;

public class ConstructorOverloading {
	int a ;
	int b;
	public ConstructorOverloading()
	{
						a = 10;
						b = 20;
						System.out.println(a + b);
	}
	
	public ConstructorOverloading(int x ,int y )
	{
						a = x;
						b = y;
						System.out.println(a + b);
	}
	
	public ConstructorOverloading(int x,int y,double z)
	{
		System.out.println(x+"  "+y+"  "+z);
	}
	public void Test()
	{
		System.out.println("This is method");
	}


	public static void main(String[] args) 
	{
		//ConstructorOverloading co=new ConstructorOverloading();
		//ConstructorOverloading co=new ConstructorOverloading(300,400);
		ConstructorOverloading co=new ConstructorOverloading(10,20,20.50);
		co.Test();// method will not be invoked directly when we create a object.and we should call the method usimg object
		

	}

}
