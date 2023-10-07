package allseleniumprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver(options);
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("This is parent:" +driver.getWindowHandle());
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println("This is child:" +driver.getWindowHandle());
		
		//Approach one using for -each loop 
//		 Set<String>windowvalues=driver.getWindowHandles();
//		for(String windValue:windowvalues)
//		{
//			   String Title=	driver.switchTo().window(windValue).getTitle();
//			   if(Title.equals("OrangeHRM"))
//			   {
//				   driver.close();
//			   }
//			   break;
//		}
		
		//Approach 2 using arraylist concept
		
		Set<String>windowvalues=driver.getWindowHandles();
		
		List<String>windowlist=new ArrayList(windowvalues);
		//System.out.println(windowlist.get(0));
		System.out.println(windowlist.get(0)+"          sop ");
		//driver.switchTo().window(windowlist.get(1));
		//System.out.println(driver.getTitle());
		
		
		
		
		
//		WebDriverManager.chromedriver().setup();
//		 WebDriver driver=new ChromeDriver();
		   
		/* driver.get("https://devuserkeydemands.underdev.in/");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 
		WebElement ele1= driver.findElement(By.xpath("//a[@href='https://www.instagram.com/keydemand.in/']"));
		WebElement ele2= driver.findElement(By.xpath("//a[@href='https://www.facebook.com/keydemand']"));
		 
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", ele1);
		 js.executeScript("arguments[0].click();", ele2);
		Set<String> allWindowIds= driver.getWindowHandles();
		
		//WebElement fb=driver.findElement(By.xpath("//input[@placeholder='Email or phone']"));
		
		for(String windowID:allWindowIds)
		{
			
			String title=driver.switchTo().window(windowID).getTitle();
			System.out.println(title);
			if(title.equals("Keydemand | Mumbai | Facebook") || title.equals("Keydemand - Leasing & Beyond"))
			{
				driver.close();
			}
			
		}*/
		
		
		
	}	

}
