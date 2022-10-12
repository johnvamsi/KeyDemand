package allseleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestiondropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(5000);
		
			
			  List<WebElement> options=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']"));
			  
			 System.out.println("Total suggested options :" +  options.size()); 
			 for(WebElement option:options)
			 {
			      if(option.getText().equals("selenium"))
			          {
				         option.click(); break; 
			           } 
			 
			  }
			 
		      
		

	}

}
