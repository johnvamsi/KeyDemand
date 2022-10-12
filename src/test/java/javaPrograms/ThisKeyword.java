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

	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.getData(10, 20);
		tk.display();
	

	}

}
