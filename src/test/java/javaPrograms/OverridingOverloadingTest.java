package javaPrograms;

class fff
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
}

class eee extends fff
{
	void m1(int a)				//Overriding
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b)      // Overloading
	{
		System.out.println(a+b);
	}
}




public class OverridingOverloadingTest {

	public static void main(String[] args) {
	
		eee  xyz=new eee();
		
		xyz.m1(100);
		
		xyz.m2(200);
		xyz.m2(10,20);
	}

}
