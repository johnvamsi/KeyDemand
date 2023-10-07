package javaPrograms;



interface TestInterfaceTest {
	int a=100;
	void display();
	void display(int a );


}
 interface TestInterfaceTestinterface {
	int b=200;
	void print();


}
public class TypeCasting implements  TestInterfaceTest,TestInterfaceTestinterface {
	 public static void main(String[] args) 
	  {
		  //TestInterface.a=200;
		       //System.out.println(a);
		 TypeCasting practice = new TypeCasting();
		  
		       TestInterfaceTest  p= practice;//class 2 interface
		       TestInterfaceTestinterface test=(TestInterfaceTestinterface) p;//interface 2 interface
		       p.display() ;
		       test.print();
		 		   
	}

	public void display() 
	{
		      
		    System.out.println("Display method ");
	}

	public void print() {
		System.out.println("print method ");
		
	}

	@Override
	public void display(int a) {
	System.out.println("This is the value of a      "+a);
		
	}
	

}
