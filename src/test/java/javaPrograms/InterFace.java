package javaPrograms;
//interface is a blue print of class it consists of final and static variables and abstract methods
interface Shape
{
	int lenght=10;   // static & final
	int width=20;  // static final
	
	void circle();   // abstract method  , 
	
	static void square()   // static method
	{
		System.out.println("I am Square");
	}
	
		 default void rectangle()   // default method
		{
			System.out.println("Area of the rectangle:"+(lenght * width));
		}
		static void method()
		{
			System.out.println("This is static");
		}
		
		//constructor is not possible in interface
		
		
		
		
	
}


public class InterFace implements Shape{

	public void circle()
	{
		System.out.println("Iam a circle.......");
		
	}
	
	

	public static void main(String[] args) {	
		Shape ss= new InterFace();
		InterFace i=new InterFace();
		Shape.method();
		
		ss.circle();
		ss.rectangle();
		Shape.square();
		
		
		
		

	}

	

}
