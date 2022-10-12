package allseleniumprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//System.out.println("This is parent:" +driver.getWindowHandle());
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println("This is child:" +driver.getWindowHandle());
		//Approach one using for -each loop 
		/*Set<String>windowvalues=driver.getWindowHandles();
		for(String windValue:windowvalues)
		{
		   String Title=	driver.switchTo().window(windValue).getTitle();
		   if(Title.equals("OrangeHRM"))
		   {
			   driver.close();
		   }
		   break;
		}*/
		
		//Approach 2 using arraylist concept
		
		Set<String>windowvalues=driver.getWindowHandles();
		
		List<String>windowlist=new ArrayList(windowvalues);
		//System.out.println(windowlist.get(0));
		System.out.println(windowlist.get(1));
		//driver.switchTo().window(windowlist.get(1));
		//System.out.println(driver.getTitle());
		
		
		
		
	}

}
