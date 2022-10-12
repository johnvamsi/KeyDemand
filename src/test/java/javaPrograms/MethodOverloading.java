package javaPrograms;

public class MethodOverloading {
	//polyphorism -methodoverloading means  a class contains more than one method having same name 
	int a ;
	int b;
	void add()
	{
		a = 10;
		b = 20;
		System.out.println(a+b);
	}
	void add(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}

	void add(int a ,double b)
	{
	 
		System.out.println(a+b);
	}
	
	void add(int x,int y,double z)
	{
		System.out.println(x+"  "+y+"  "+z);
	}
	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		// mo.add();
		// mo.add(100, 200);
		//mo.add(100, 150.75);
		mo.add(100, 200, 150.75);
		
		


	}

}
