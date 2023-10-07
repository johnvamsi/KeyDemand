package allseleniumprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindows2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/?");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");

		driver.findElement(By.className("wikipedia-search-button")).click();

		Thread.sleep(3000);

		List<WebElement> search_results = driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]"));

		System.out.println(search_results.size());

		for (WebElement e : search_results) {
			String link = e.getText();
			System.out.println(link);
			driver.findElement(By.linkText(link)).click();
		}
		
		Thread.sleep(3000);
		Set<String>allwindowHandvalues=	driver.getWindowHandles();
		for(String windowHV:allwindowHandvalues)
		{
			System.out.println(windowHV);
			String title=driver.switchTo().window(windowHV).getTitle();
			
			
			if(title.equals("Selenium in biology") || title.equals("Selenium (software)") || title.equals("Selenium disulfide"))
			{
				driver.close();
			}
			break;
		}
		
		
		driver.quit();
		
	}

}
