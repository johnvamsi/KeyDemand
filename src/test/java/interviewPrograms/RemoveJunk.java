package interviewPrograms;

public class RemoveJunk {
	
	public static void main(String[]args)
	{
		//[^0-9a-zA-Z]-this particular command will keep the numbers,alphabets and removes  special characters or anything
		String s="!@#$%^&*&*()_+{}:><? 123456789 Vamsi Krishna";
		String s1=s.replaceAll("[^0-9a-zA-Z]", "");//it will print -  123456789VamsiKrishna
		System.out.println(s1);
		String s2=s.replaceAll("[^0-9a-z]", "");//it will print -123456789amsirishna
		System.out.println(s2);
		String s3=s.replaceAll("[^0-9]", "");//it will print -123456789
		System.out.println(s3);
		
		
		
	}

}
