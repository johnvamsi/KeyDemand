package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String year = "2022";
		String month = "December";
		String date = "23";
		driver.findElement(By.xpath("//*[@id=\"departon\"]")).click();
		
		
		WebElement calendar=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select caldrpdown=new Select(calendar);
		caldrpdown.selectByVisibleText("Dec");
		
		
		WebElement calendar1=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select caldrpdown1=new Select(calendar);
		caldrpdown.selectByVisibleText("1990");
		
		List<WebElement> alldates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement dates:alldates)
		{
			String Text=dates.getText();
			if(Text.equals(date))
			{
				dates.click();
				break;
			}
		}
		Thread.sleep(3000);
		
		
		
		
		
		
		
		  
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		

	}

}
