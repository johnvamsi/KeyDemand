package interviewPrograms;

public class VowelsandConsonants {

	public static void main(String[] args) {
		String ss="vamsiTestAUTOMATIONaeiou";
		ss=ss.toLowerCase();
		int vowelCount=0;
		int consonantCount=0;
		
		for(int i=0;i<ss.length();i++)
		{
			char Character=ss.charAt(i);
				if(Character=='a' ||Character=='e' || Character=='i' || Character=='o' ||Character=='u')
						{
							vowelCount++;
						}
				else
				{
							consonantCount++;
				}
		}
		
		System.out.println("Number of vowels in the string is   "+vowelCount);
		System.out.println("Number of consonats in the string is   "+consonantCount);

	}

}
