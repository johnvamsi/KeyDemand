package javaPrograms;
//MethodOverriding-means parent class and child class has same variables and methods

class X
{
			int a=10 ;
			void display()
			{
						System.out.println(a);
			}
}
class Y extends X
{
			int b=20;
			void display()//this method is overrided from class X
			{
						System.out.println(b+a);
			}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Y yy=new Y();
		yy.display();
	
	}

}
