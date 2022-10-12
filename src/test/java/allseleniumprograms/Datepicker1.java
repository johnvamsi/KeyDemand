package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		
		String year="2022";
		String month="December";
		String date="23";
		
		while(true)
		{
			
		  String mon= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		
		  String yr= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		 
		            if(mon.equals(month) &&  year.equals(yr))
		               {
		            	  break;
		               }
		            else
		            {
		            	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//next button 
		            }
		  
			
		}
		
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
	        for(WebElement dates:alldates)
	        {
	        	
	        	String datestext=dates.getText();
	        	if(datestext.equals(date))
	        	{
	        		
	        		dates.click();
	        		break;
	        	}
	        	
	        }
	        Thread.sleep(3000);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		

	}

}
