package javaPrograms;
/*
 * Limitations of method OverLoading
 * method names should be the same -1
 * if the method names are same then number of parameters should be different-2
 * if the number of parameters are same then datatypes should be different-3
 * if the datatypes are same then order of parameter should be changed-4
 */
public class MethodOverloading2 {
	public void add(int a)//-1
	  {
		  System.out.println("This is a Value "+a);
	  }
	public void add(int a ,int b) //-2
	  {
		  System.out.println("This is a & b  Value "+(a+b));
	  }
	public void add(int a ,double  b)//-3
		  {
			  System.out.println("This is a & b  Value "+(a+b));
	    }
	public   void add(double  b,int a)//-4
		  {
			  System.out.println("This is a & b  Value "+(a+b));
	    }
	
	
public static void main(String[] args) throws Exception {

	MethodOverloading2 tp = new MethodOverloading2();
				tp.add(10);
				tp.add(10,20);//-2
				tp.add(10, 100.0);//-3
				tp.add(100.0, 20);//-4
				
				tp.add(10, 100.0);
				tp.add(100.0,20);

	}
}