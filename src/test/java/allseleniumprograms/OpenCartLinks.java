package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> alllinks =driver.findElements(By.xpath("//ul[@class='list-unstyled']/li"));
		System.out.println(alllinks.size());
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		
//		for(WebElement link :alllinks)
//		{
//			System.out.println(link.getText());
//			String linkvalue=link.getText();
//			if(linkvalue.equals("Contact Us"))
//					{
//				          //aa.moveToElement(link).click().perform();
//				           Thread.sleep(4000);
//				           
//				           link.click();
//				           break;
//			        }
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
