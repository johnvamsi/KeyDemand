package javaPrograms;

public class MethodChaining {
	private int id;      
	private String name;  
	private int age;  
	private int std;
	
	public MethodChaining setID(int id)
	{
		this.id=id;
		return this;
	}
	
	public MethodChaining setName(String name)
	{
		this.name=name;
		return this;
	}
	
	public MethodChaining setAge(int age)
	{
		this.age=age;
		return this;
	}
	
	public MethodChaining setStandard(int std)
	{
		this.std=std;
		return this;
	}
	
	public void displayDetails()
	{
		System.out.println("Id is  "+id+"   and Name is    "+name+"    and age is    "+age+"    and standard is    "+std);
	}

	public static void main(String[] args) {
		MethodChaining mc= new MethodChaining();
		mc.setID(10).setName("Vamsi").setAge(15).setStandard(10);
       mc.displayDetails();
	}

}
