package allseleniumprograms;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement>alllinks =driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		int brokenlinks=0;
		
		for(WebElement Ele: alllinks )
		{
			String url=Ele.getAttribute("href");
			System.out.println(url);
			if(url==null || ((CharSequence) url).isEmpty())
			{
				System.out.println("Url is empty");
			}
			
			URL link = new URL(url);
		try
			{
					HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();
					httpConn.connect();
				if(httpConn.getResponseCode()>=400)
				{
					System.out.println(httpConn.getResponseCode()+ "   "+link+"   "+"This link is broken link");
					
					brokenlinks++;
				}
				else
				{
					System.out.println(httpConn.getResponseCode()+ "   "+link+"   "+"This is valid  link");
				}
			
				
				
			}
			catch(Exception e)
			{
				
			}
					
		}
		
		System.out.println("Number of broken links:"+brokenlinks);	
		driver.quit();
		
		
	}

}
