package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static WebDriver driver;
	
	public  void selectDate(String month,String year)
	{
		driver.findElement(By.id("dob")).click();
		WebElement monele=driver.findElement(By.xpath("//select[@aria-label='Select month']"));//month
		Select mondrp=new Select(monele);
		mondrp.selectByVisibleText(month);
		
		WebElement yrele=driver.findElement(By.xpath("//select[@aria-label='Select year']"));//year
		Select yrdrp=new Select(yrele);
		yrdrp.selectByVisibleText(year);
		
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tr[4]//td[6]")).click();
		
		
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 Practice pr = new Practice();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("travname")).sendKeys("Test");
		driver.findElement(By.id("travlastname")).sendKeys("Automation");
		driver.findElement(By.id("order_comments")).sendKeys("Automation testing is started");
		pr.selectDate("Dec","1996");
		WebElement radmale=driver.findElement(By.id("sex_1"));
		System.out.println(radmale.isDisplayed());
		System.out.println(radmale.isEnabled());
		radmale.click();
		System.out.println(radmale.isSelected());
		driver.findElement(By.name("addmorepax")).click();
		driver.findElement(By.id("select2-addpaxno-container")).click();
		driver.findElement(By.xpath("//li[text()='add 1 more passenger (100%)']")).click();
		
	
//	for(WebElement ele:drpele)
//	{
//		System.out.println(ele.getText());
//	}
		
	
		
		
    //  driver.close();
    
	}

}
