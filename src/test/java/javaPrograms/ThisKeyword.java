package javaPrograms;

public class ThisKeyword {
	int a;
	int b;
	void getData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println(a+b);
	}
	
	
	//int a ,b;
//	void Thismethod(int x , int y)
//	{
//		a=x;
//		b=y;
//		
//		System.out.println(a+b);
//	}/.instead of this we can use this keyword to avoid int x and int y variables 
	void Thismethod()
	{
		this.a=a;
		this.b=b;
		
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.getData(10, 20);
		tk.display();
		
		tk.a=100;
		tk.b=200;
		tk.Thismethod();
	

	}

}
