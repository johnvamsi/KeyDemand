package javaPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FaceBOOOOK {
	
	
	public static String setUserName(WebDriver driver)
	{
		String UserName="vamsigabbarsingh@gmail.com";
		return UserName;
		
	}
	public static String setPassWord(WebDriver driver)
	{
		String PassWord="jesus7";
		return PassWord;
		
	}
		public static void main(String args[]) throws Exception
		{  
			ChromeOptions options = new ChromeOptions();

			//Add chrome switch to disable notification - "**--disable-notifications**"
			options.addArguments("--disable-notifications");
			        
			//Set path for driver exe 
			//System.setProperty("webdriver.chrome.driver","path/to/driver/exe");

			//Pass ChromeOptions instance to ChromeDriver Constructor
			WebDriver driver =new ChromeDriver(options);
			
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys(setUserName(driver));
			driver.findElement(By.name("pass")).sendKeys(setPassWord(driver));
			driver.findElement(By.name("login")).click();
		    driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).click();
		  
		   List<WebElement>allLinks= driver.findElements(By.xpath("//ul[@class='x78zum5 xdt5ytf x1iyjqo2']//li"));
		   System.out.println("Numb of suggested accounts is      "+allLinks.size());
		
		for(WebElement link :allLinks)
		{
			String name=link.getAttribute("id");
			System.out.println(name);
//			if(name.equals("poorna chandra") || name.equals("g karunakara"))
//			{
//				link.click();
//			}
		}
		
			
			
		}

}
