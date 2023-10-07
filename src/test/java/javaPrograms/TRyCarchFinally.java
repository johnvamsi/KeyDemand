package javaPrograms;

public class TRyCarchFinally {

	public static void main(String[] args) {
	
		
		   int a=100;
	       try
	       {
			    	  // int c=100000000;
	    	   			int c=a/0;
			    	   System.out.println("Div of c is       "+c);
	       }
	       catch(Exception e )
	       {
	    	   System.out.println("Exception is Triggered");
	       }
	       finally
	       {
	    	   System.out.println("Finally block is executed");
	       }

	}

}
