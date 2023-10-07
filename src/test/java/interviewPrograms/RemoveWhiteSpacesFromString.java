package interviewPrograms;

public class RemoveWhiteSpacesFromString {
	
	public static void main(String[]args)
	{
		// \\s this keyword will remove white spaces from string
		String s1="Vamsi    krishna   Test   architect";
		String s2=s1.replaceAll("\\s", "");
		System.out.println(s2);
	}

}
