package javaPrograms;

public class MultiDimArray {

	public static void main(String[] args) {
		//declaration
		int [][] a=new int[3][3];
		//intialization
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		
		a[1][0]=400;
		a[1][1]=500;
		a[1][2]=600;
	
		a[2][0]=700;
		a[2][1]=800;
		a[2][2]=900;
		
		//find length of an row
	    System.out.println(a.length);
	  //find length of an column
	    System.out.println(a[0].length);
	  //read single value from an array
	  		System.out.println(a[1][2]);
	  	//read all values from an array
			for(int i=0; i<a.length;i++)
			{
				for(int j=0; j<a[i].length;j++)
				{
					System.out.print(a[i][j]+"     ");
				}
				System.out.println();
				
			}
			
			
			
		

	}

}
