package javaPrograms;


public class AccessModifiers {
/*	Public
	public int a ;
	public void display()
	{
		System.out.println("This method is for public ");
	}*/
	
//	default
	 /*int a ;
	 void display()
	{
		System.out.println("This method is for default ");
	}*/
//	protected
		/* protected int a ;
		 protected void display()
		{
			System.out.println("This method is for protected ");
		}*/
	 
//	private
	private int a ;
	private void display()
	{
		System.out.println("This method is for private ");
	}
	
	
	

	public  static void main(String[] args)
	{
		//Public
		
		/*
		 * Abc c= new Abc(); c.a=200; System.out.println(c.a); c.display();
		 */
		//default 
		/*
		 * AccessModifiers am=new AccessModifiers(); am.a=200; System.out.println(am.a);
		 * am.display();
		 */
		//protected 
		/*AccessModifiers am=new AccessModifiers(); 
		am.a=300;
		System.out.println(am.a);
		am.display();
		*/
		//private
		AccessModifiers am=new AccessModifiers();
		am.a=300;
		System.out.println(am.a);
		am.display();
		
		
		
	}

}
