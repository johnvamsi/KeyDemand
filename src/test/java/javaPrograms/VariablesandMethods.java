package javaPrograms;

public class VariablesandMethods {
	//Variables
			int empid;
			String empname;
			String empjob;
			int empsal;
			
			//methods
		    void display()
		    {
		    	System.out.println(empid+"   "+empname+"    "+empjob+"    "+empsal);
		    	
		    }
		    
		    void setData(int id,String name,String job,int sal)
		    {
		    	empid=id;
		    	empname=name;
		    	empjob=job;
		    	empsal=sal;
		    
		    }
		    
		    //Constructor
		   public  VariablesandMethods(int id,String name,String job,int sal)
		    {

		    	empid=id;
		    	empname=name;
		    	empjob=job;
		    	empsal=sal;
		    }

		    public static void main(String [] args ) {
	           
		    	//VariablesandMethods vm= new VariablesandMethods();
		    	/* by using object refrence variable-1
		    	vm.empid=100;
		    	vm.empname="johndavid";
		    	vm.empjob="Softwaretesting";
		    	vm.empsal=100000;
		    	
		    	vm.display();*/
		    	
		    	//How many ways u can intialiaze the values
		    	/* by using object refrence variable
		    	 * using method
		    	 * using constructor
		    
		    	
		    	//using method-2
		    	vm.setData(200, "JOHNDAVID", "Testing",5000);
		    	vm.display(); */
		    	
		    	//using constructor
		    	VariablesandMethods vm= new VariablesandMethods(300, "JOHN", "Testing",7000);
		    
		    	vm.display();

	}

}
