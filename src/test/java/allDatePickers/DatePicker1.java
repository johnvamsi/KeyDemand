package allDatePickers;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/broken-link1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Selenium Practice']")).click();
		driver.findElement(By.xpath("//ul//li[4]//ul//li[10]//a[normalize-space()='Calendars Practice']")).click();
		//click 1stDropdown
		driver.findElement(By.id("first_date_picker")).click();
	  Thread.sleep(3000);
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  while(true)
	  {
				 WebElement click_Next= driver.findElement(By.xpath("//a[@title='Next']"));//next or forward button
				 js.executeScript("arguments[0].click();", click_Next);
				 String monName= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				 if(monName.equals("December"))
				 {
					 break;
				 }
		  
	  }
	  Thread.sleep(3000);
		//select Date
	 List<WebElement>allDates=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		System.out.println("Num of Days in Calendar is "+allDates.size());
		for(WebElement date :allDates)
		{
			String text=date.getText();
			if(text.equals("25"))
			{
				WebElement date1=driver.findElement(By.linkText(text));
				 js.executeScript("arguments[0].click();", date1);
				break;
			}
		}
		

	}

}
