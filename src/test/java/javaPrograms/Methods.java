package javaPrograms;

public class Methods {
	//method is a block of code which will perform certain task 
	/*method wont receive parameters and it wont return then value 
	 * method will receive parameters and it wont return then value 
	 * method wont receive parameters and it will return then value 
	 * method will receive parameters and it will return then value 
	 */
    //method-1
	void display()
	{
		System.out.println("This method is not taking any parameters and it wont return any value ");
	}
	void show(int a)
	{
		System.out.println(a);
	}
	int print()
	{
		int a=10;
		int b=20;
		System.out.println("multiplication of  a and b is :");
		return (a*b);
	}
	int addition(int a,int b)
	{
		
		System.out.println("multiplication of  a and b is :");
		return (a*b);
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Methods ms= new Methods();
		ms.display();//m1
		ms.show(20);//m2
		System.out.println(ms.print());//m3
		System.out.println(ms.addition(20,30));//m4
	

	}

}
