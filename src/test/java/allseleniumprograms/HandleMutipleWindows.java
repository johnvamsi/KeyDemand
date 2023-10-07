package allseleniumprograms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMutipleWindows {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/broken-link1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//ul//li[4][@class='parent'])[2]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Window Handles']")).click();
		driver.findElement(By.xpath("//button[@class='whButtons' and @id='newWindowsBtn']")).click();
		Thread.sleep(3000);
		
		Set<String>allWinds=	driver.getWindowHandles();
		System.out.println("num of windows        "+allWinds.size());
		for(String wind:allWinds)
		{
			String title=driver.switchTo().window(wind).getTitle();
			System.out.println("Title of the WebPage is   "+title);
			if(title.equals("Basic Controls - H Y R Tutorials"))
			{
				driver.switchTo().window(wind);
				driver.findElement(By.name("fName")).sendKeys("vamsi");
				Thread.sleep(10000);
				driver.close();
				
				
			}
			if(title.equals("XPath Practice - H Y R Tutorials"))
				{
					driver.switchTo().window(wind);
					driver.findElement(By.name("name")).sendKeys("Krishna");
						Thread.sleep(10000);
					driver.close();
				
					
				}
			
			
		}
		
	}

}
