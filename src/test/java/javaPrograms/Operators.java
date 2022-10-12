package javaPrograms;

public class Operators {
	
	/*Arithmetic operators   + - * / % 
	2) Relational/comparison operators  >  >=  <  <=  !=  == 
	3) Logical operators   &&   ||  !
	4) Increment & Decrement operators  ++  --
	5) Assignment   = */

	public static void main(String[] args) {
		int a =20;
		int b=10;
		//Arithmetic operators   + - * / % 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);//qoutient
		System.out.println(a%b);//remainder
		
		//Relational operators  >  >=  <  <=  !=  == it will always return true or false only 
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		//Logical operators   &&   ||  ! it will always return true or false only 
		boolean x= true;
		boolean y= false;
		
		System.out.println(x && y);//and
		System.out.println(x||y);//or
		System.out.println(x!=y);//not equal 
		
	//	Increment & Decrement operators  ++  --
		int i=100;
		System.out.println(i);
		//i=i+1;
		//++i;
		i++;
		System.out.println(i);
		
		int p=100;
		System.out.println(p);
		//p=p+1;
		//++p;
		p--;
		System.out.println(p);
		
		
		
		
		

	}

}
