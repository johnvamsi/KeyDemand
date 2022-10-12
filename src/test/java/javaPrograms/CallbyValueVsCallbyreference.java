package javaPrograms;
//calbyvalue
class cal
{
	int x;
	void addition(int a)
	{
		x=a+5;
		System.out.println("Added value is :"+x);
	}
}

class cal2
{
	int x;
	void addition(cal2 a)
	{
		x=a.x+5;
		System.out.println("Added value is :"+x);
	}
}
public class CallbyValueVsCallbyreference 
{
	

	public static void main(String[] args) 
	{
		//CallbyValue
		/*cal c=new cal();
		int x=10;
		c.addition(x);
		System.out.println(c.x);*/
		
		//call by reference
		cal2 c = new cal2();
		c.x = 20;
		c.addition(c);
		System.out.println(c.x);
		

		

	}
	
	
		
	
}
