package javaPrograms;

public class Encapsulation1 {

	public static void main(String[] args) {
	
		Encapsulation es=new Encapsulation();
		es.setRollno(1234567);
		es.setName("VamsiKrishna");
		es.setDeptname("Testing");
		System.out.println(es.getRollno());
		System.out.println(es.getName());
		System.out.println(es.getDeptname());
	}

}
