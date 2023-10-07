package allDatePickers;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PastCurrentFutureDatePicker {
	//selectPastDate
	static void selectPastDate(String d,String m,WebDriver driver) 
	{
			Calendar cal=Calendar.getInstance();
			int currentmonth=cal.get(Calendar.MONTH);
			System.out.println(currentmonth);
			for(int i=currentmonth;i>=1;i--)
					{
						driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/span")).click();
						String mon=driver.findElement(By.xpath("/html/body/div[5]/div/div/span[1]")).getText();
						if(mon.equals(m))
								{
									driver.findElement(By.linkText(d)).click();
									break;
								}
		}
        
		
	}	
	
	
	//selectFutureDate
	static void selectFutureDate(String d,String m,WebDriver driver,String year) 
	{
		Calendar cal=Calendar.getInstance();
		int currentmonth=cal.get(Calendar.MONTH);
		System.out.println(currentmonth);
		for(int i=currentmonth;i>=1;i++)
		{
			driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/span")).click();
			String mon=driver.findElement(By.xpath("/html/body/div[5]/div/div/span[1]")).getText();
			if(mon.equals("m"))
			{
				driver.findElement(By.linkText(d)).click();
				break;
			}
		}
        
		
	}
	
		//selectCurrentDate
		static void selectCurrentDate(WebDriver driver)
		   {
			    
			   Calendar cal = Calendar.getInstance();
			  int d=cal.get(Calendar.DATE);
			  System.out.println(d);
			  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")).click();
			   
			   
		   }


	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
			
			String year="2023";
			String month="January";
			String date="25";
			driver.findElement(By.id("datepicker")).click();
	
			
			
			
			//selectCurrentDate();
			selectFutureDate(date,month, driver, date);
			//selectPastDate(date,month,driver);
		}
     //selecting current date
	   
		

}
