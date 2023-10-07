package javaPrograms;

public class MethodChaining2 {
	static MethodChaining2 mc;
	int a,b,c,d;
	int sum,mul,sub;
	public MethodChaining2 doAddition(int a, int b)
	{
		this.a=a;
		this.b=b;
		 sum=(a+b);
		System.out.println("Addition of a and b is "+sum);
		return mc;
	}
	public MethodChaining2 doMultiplication(int c )
	{
		this.c=c;
		
		mul=(sum*c);
		System.out.println("Multiplication  is "+mul);
		return mc;
	}
	public MethodChaining2 doSubtraction(int d)
	{
		this.d=d;
		sub=(mul-d);
		System.out.println("Subtraction  is "+sub);
		return mc;
	}
	public MethodChaining2 doDivision()
	{
		return mc;
	}
	public static void main(String[] args) {
		 mc= new MethodChaining2();
		mc.doAddition(10, 20).doMultiplication(100).doSubtraction(100);
      

	}

}
