package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		
		
driver.findElement(By.xpath("//input[@id='dob']")).click(); // opens the date picker
		
		Select datepicker_month=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		datepicker_month.selectByVisibleText("Oct");
		
		Select datepicker_year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		datepicker_year.selectByVisibleText("1990");
		
		
		//Date selection
		String date="10";
		
		List<WebElement >allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			String dt=ele.getText();
			if(date.equals(dt))
			{
				ele.click();
				break;
			}
		}
		

	}

}
