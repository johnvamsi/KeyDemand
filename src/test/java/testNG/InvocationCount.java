package testNG;


//InvocationCount  this keyword is used to run a method multiples times based on the count 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount 
{
//	@Test(invocationCount = 5)
//	public void loginTest()
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//		System.out.println("Page Title is " + driver.getTitle());
//		driver.quit();
//	}
	
	
	@Test(invocationCount=4, invocationTimeOut=3000)
	public void loginTest() throws InterruptedException
	{
	    Thread.sleep(1000);
	   System.out.println("Login test");
	   System.out.println("Login test");
	   System.out.println("Login test");
	   System.out.println("Login test");
	   System.out.println("Login test");
	}
}
