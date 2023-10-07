package interviewPrograms;

public class LargestWordInaString {

	public static void main(String[] args) {
		//String data="India is My country";
		String data="vamsi t te testautomation manual java selenium  selenium";
	//	String array[]=data.split(" ");
		
		
			/*int a= array[0].length();
			int b= array[1].length();
			int c= array[2].length();
			int d= array[3].length();
			
			if(a>b && a>c &&a>d)
			{
				System.out.println("a is greater  "+array[0]);
			}
			else if(b>a && b>c &&b>d)
			{
				System.out.println("b is greater  "+array[1]);
			}
			else if(c>a && c>b && c>d)
			{
				System.out.println("c is greater  "+array[2]);
			}
			else if(d>a && d>c &&d>b)
			{
				System.out.println("d is greater  "+array[3]);
			}
			else
			{
				System.out.println("all are same  ");
			}*/
	     //secondapproach
		//String data="TestAutomation is my india and my country"; 
		String [] mydata=data.split(" ");
		
		String max= mydata[0];
		
		for(int i=0;i<mydata.length;i++)
		{
					 if(mydata[i].length()>max.length())
					 {
						 		max=mydata[i];
					 }
			
		}
		System.out.println("max in the array is      "+max);
		
		String data1="India is TestAutomation My bbbbbbbbbbbbbbbb country";
		String array[]=data1.split(" ");
		String max1=array[0];
		String min1=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i].length()>max1.length())
			{
				max1=array[i];
			}
			else if(array[i].length()<min1.length())
			{
				min1=array[i];
			}
		}
		
		System.out.println("largest word is "+max1);
		System.out.println("Smallest word is "+min1);

	}

}
