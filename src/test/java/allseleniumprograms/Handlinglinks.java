package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlinglinks {
	public static void main(String [] args) throws InterruptedException
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		List<WebElement> alllinks =driver.findElements(By.tagName("a"));
		
	System.out.println(alllinks.size());
	for (WebElement link :alllinks)
		{
			//System.out.println(link.getText());
		   System.out.println(link);
	}
		
	}

}
