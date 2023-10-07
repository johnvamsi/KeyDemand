package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://itera-qa.azurewebsites.net/home/automation");
		  driver.manage().window().maximize();
		  Thread.sleep(4000);
		  
 List<WebElement> alloptions=driver.findElements(By.xpath("(//select[@class='custom-select'])//option"));
		  
		  //approach 1 using for-each loop
		  for(WebElement option :alloptions)
		  {
			 String value= option.getText();
			 if(value.equals("Norway"))
			 {
				 option.click();
				 break;
			 }
		  }
		  
		//approach 2 using for loop
		  for(int i=0;i<alloptions.size();i++)
		  {
				 String value= alloptions.get(i).getText();
				 if(value.equals("Norway"))
				 {
					 alloptions.get(i).click();
					 break;
				 }
		  }

	}

}
