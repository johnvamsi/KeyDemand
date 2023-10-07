package allseleniumprograms;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {
	public static void main(String[] args) throws InterruptedException {

	
		  WebDriverManager.chromedriver().setup(); 
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.opencart.com/index.php?route=account/register");
		 driver.manage().window().maximize(); 
		   Thread.sleep(3000);
		WebElement alldropdowns=  driver.findElement(By.xpath("//*[@id=\"input-country\"]"));
		Select dropdown = new Select(alldropdowns);
		//System.out.println(dropdown.getOptions().size());
		List<WebElement>options=dropdown.getOptions();
		System.out.println(options.size());
//		for(WebElement option:options)
//		{
//			
//			String textvalue =option.getText();
//			if(textvalue.equals("Israel"))
//			{
//				option.click();break;
//			}
//		}
		
	    dropdown.selectByIndex(5);
	    Thread.sleep(2000);
	    dropdown.selectByValue("104");
	    Thread.sleep(3000);
	    dropdown.selectByVisibleText("United States");
	  WebElement firstOption=  dropdown.getFirstSelectedOption();
	 System.out.println(firstOption.getText());
		

	}

}
