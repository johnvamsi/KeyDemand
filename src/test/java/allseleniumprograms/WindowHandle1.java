package allseleniumprograms;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); 
		String link;

		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		
		driver.findElement(By.className("wikipedia-search-button")).click();
		
		Thread.sleep(3000);
		
		List <WebElement>search_results=driver.findElements(By.xpath("//*[@id='wikipedia-search-result-link']/a"));
		//List<WebElement>searchResult=driver.findElements(By.xpath("(//div[@id='wikipedia-search-result-link'])/a"));
		System.out.println(search_results.size());
		
		for(WebElement e:search_results)
			{
					 link=e.getText();
					driver.findElement(By.linkText(link)).click();
			}
		
		Set<String>windowvalues=driver.getWindowHandles();
		for(String windValue:windowvalues)
		{
			System.out.println(windValue);
		   String Title=	driver.switchTo().window(windValue).getTitle();
		  System.out.println(Title);
		   if (Title.equals("Selenium in biology - Wikipedia") || Title.equals("Selenium (software) - Wikipedia")|| Title.equals("Selenium (software)") || Title.equals("Selenium disulfide - Wikipedia")) 
			{
				driver.close();
			}
				
		}
//		
//		for(WebElement e:search_results)
//		{
//				 link=e.getText();
//				driver.findElement(By.linkText(link)).click();
//				System.out.println(link);
//				Thread.sleep(4000);
//				String handlevalue=driver.getWindowHandle();
//				System.out.println(handlevalue);
//				
//				if (link.equals("Selenium dioxide") || link.equals("Selenium in biology")|| link.equals("Selenium (software)") || link.equals("Selenium disulfide")) 
//				{
//					driver.close();
//				}
		{
		}	
		
		//driver.quit();
	}	  

}
