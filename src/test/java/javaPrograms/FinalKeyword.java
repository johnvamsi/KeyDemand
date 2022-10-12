package javaPrograms;
//final keyword is used to restrict the user ,if we declare any variable,method ,class is a final then it cant be extended

class Xx
{
	int a ;
	void display() 
	{
		System.out.println(a);
	}
}

public class FinalKeyword extends Xx{
	final int a=10;
	final void display()
	{
		int b=20;
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		
		FinalKeyword fk= new FinalKeyword();
		//fk.a=20
		System.out.println(fk.a);
		fk.display();
		
	}

}
