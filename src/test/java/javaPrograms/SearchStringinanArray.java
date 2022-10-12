package javaPrograms;

public class SearchStringinanArray {

	public static void main(String[] args) {
		String[] arr= {"Vamsi","john","Scott", "David","Thomas"};
		int a=arr.length;
		boolean b=false;
		String search_string ="Scott";
		//method-1
		/*for(int i=0;i<a;i++) 
		{
			if(arr[i]==search_string)
			{
				System.out.println("Search string is found :"+arr[i]);
				b=true;
				break;
			}
			
		}
		if(b==false)
		{
			System.out.println("Search string is NOT  found :");
		}*/
		//method-2
		for(String n:arr)
		{
			if(n.equals(search_string))
			{
				System.out.println("Search string is found :");
				b=true;
				break;
			}
		}
		
		if(b==false)
		{
			System.out.println("Search string is NOT  found :");
		}
		
	}

}
