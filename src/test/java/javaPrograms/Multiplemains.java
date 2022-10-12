package javaPrograms;
//WE can overaload main method but no parameters or arguments should be different and also jvm will look for main method which has parameters is string [] args 
public class Multiplemains {
	
	 void main()
	{
		int a=10;
		System.out.println(a);
	}
	void main(int x,int y )
	{
		int a=x;int b=y;
		System.out.println(a+b);
	}
	
	 void main(int a, double b )
	{
		int x=a;double y=b;
		System.out.println(x+y);
	}
	
	

	public static void main(String[] args) {
		Multiplemains mm=new Multiplemains();
		mm.main();
		mm.main(10, 20);
		mm.main(100, 50.5);
	


	}

}
