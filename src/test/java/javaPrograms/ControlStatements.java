package javaPrograms;

public class ControlStatements {

	public static void main(String[] args) {
		//if,if-else,nested -if,switch;
		int age =17;
		/*if(age>=18)
		{
			System.out.println("Eligible for vote ");
			
		}
		else
		{
			System.out.println("Not Eligible for vote ");
		}
		//Largest of three numbers 
		int a =10,b=20,c=30;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater than b and c");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is greater than a and c");
		}
		else
		{
			System.out.println("c is greater than a and b");
		}
		
		//if else ladder
		
		int d=10;
		if(d==1)
		{
			System.out.println("This is monday");
		}
		else if(d==2)
		{
			System.out.println("This is tuesday");
		}
		else if(d==3)
		{
			System.out.println("This is wednesday");
		}
		else if(d==4)
		{
			System.out.println("This is thursday");
		}
		else if(d==5)
		{
			System.out.println("This is friday");
		}
		else if(d==6)
		{
			System.out.println("This is saturday");
		}
		else if(d==7)
		{
			System.out.println("This is sunday");
		}
		else 
		{
			System.out.println("Invalid number ");
		}
		
		//Switch case 
		
		int x=7;
		switch(x)
		{
		case 1: System.out.println("This is sunday"); break;
		case 2: System.out.println("This is monday"); break;
		case 3: System.out.println("This is tuesday"); break;
		case 4: System.out.println("This is wednesday"); break;
		case 5: System.out.println("This is thursday"); break;
		case 6: System.out.println("This is friday"); break;
		case 7: System.out.println("This is satday"); break;
		case 8: System.out.println("invalid number "); break;
		
		}
		
		String day="wednesday";
		switch(day)
		{
		case "monday": System.out.println("1"); break;
		case "tuesday": System.out.println("2"); break;
		case "wednesday": System.out.println("3"); break;
		case "thursday": System.out.println("4"); break;
		case "friday": System.out.println("5"); break;
		case "saturday": System.out.println("6"); break;
		case "sunday": System.out.println("7"); break;
		case "invalid" : System.out.println("8"); break;
		
		}
		int x=0;
		if(x>=1)
		{
			System.out.println("given number is positive");
		}
		else 
		{
			System.out.println("given number is negative");
		}*/
		
		int a[]=new  int[5];
		a[0]=1;a[1]=2;a[2]=3;a[3]=4;a[4]=5;
		for(int i=0;i<=4;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Number is Even :"+a[i]);
			}
			else 
			{
				System.out.println("Number is Odd ");
			}
		}
		
			
			
		
		

	}

}
