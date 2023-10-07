package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns1 {

	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://itera-qa.azurewebsites.net/home/automation");
		  driver.manage().window().maximize();
		  Thread.sleep(4);
		  /* WebElement drp=driver.findElement(By.xpath("//select[@class='custom-select']"));
		  Select dropdown =new Select(drp);
		  List<WebElement>alloptions=dropdown.getOptions();
		  System.out.println(alloptions.size());
		  
		  Approach 1
		  for(WebElement option :alloptions)
		  {
			  String text=option.getText();
			  
			  if(text.equals("Italy"))
			  {
				  option.click();
				  break;
			  }
		  }*/
		  
		  //approach2
		  
//		  dropdown.selectByIndex(1);
//		  Thread.sleep(3000);
//		  dropdown.selectByVisibleText("Spain");
//		  Thread.sleep(3000);
//		  dropdown.selectByValue("5");
//		  Thread.sleep(3000);
		 
		

	}

}
