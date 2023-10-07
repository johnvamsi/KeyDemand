package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://devuserkeydemands.underdev.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[normalize-space()='City'])[1]")).click();
		List<WebElement>drp_options=	driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
		System.out.println(drp_options.size());
		
		
		for(WebElement option:drp_options)
		{
			String text=option.getText();
			System.out.println(text);
			if(text.equals("Hyderabad"))
			{
				option.click();
				break;
			}
		}
		/*
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://devuserkeydemands.underdev.in/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//a[normalize-space()='State']")).click();
		 List<WebElement>allStates=driver.findElements(By.xpath("//ul[@class='list-unstyled']//a"));
		  System.out.println("Number of states "+allStates.size());
		  
		  for(WebElement state:allStates)
		  {
			  if(state.getText().equals("Andhra Pradesh"))
			  {
				  state.click();
				  break;
			  }
			  
		  }
		  Thread.sleep(2000);	  
		  
		  
	driver.findElement(By.xpath("//a[normalize-space()='City']")).click();
	List<WebElement> allCities = driver.findElements(By.xpath("//ul[@class='list-unstyled']/child::a"));

	System.out.println("No of cities in the andhrapradesh is  " + allCities.size());
	
	
	for(int i=0;i<allCities.size();i++)
	{
		if(allCities.get(i).getText().equals("Pakala"))
		{
			allCities.get(i).click();
			break;
		}
	}
		 */

	}

}
