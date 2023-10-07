package allseleniumprograms;

public class TestingPrograms {
	
	public TestingPrograms()
	{
		System.out.println("Constructor is executed ");
	}
	int a=10;
	int b=20;
	void display()
	{
		System.out.println("Addition of 2 numbers is "+(a+b));
	}

	public static void main(String[] args) {
		TestingPrograms tp= new TestingPrograms();
		tp.display();
	}

}
