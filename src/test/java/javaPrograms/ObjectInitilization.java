package javaPrograms;

public class ObjectInitilization {
    int a;
		    void assignValue(int a)
		    {
		    		this.a=a;
		    		System.out.println(a);
		    }
		    ObjectInitilization(int a)
		    {
		    	this.a=a;
	    		System.out.println(a);
		    }
	public static void main(String[] args) {
		ObjectInitilization oo= new ObjectInitilization(1000);
		//intilization through object
//		oo.a=100;
//		System.out.println(oo.a);
		//intilization through method
	//oo.assignValue(200);

	}

}
