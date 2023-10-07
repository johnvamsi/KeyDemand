package allseleniumprograms;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks3 {
	
	public static void main(String [] args ) throws Exception
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[normalize-space()='Selenium Practice']"));
	JavascriptExecutor js =driver;

	WebElement link2=driver.findElement(By.xpath("(//a[normalize-space()='Broken Links'])[1]"));
	js.executeScript("arguments[0].click();", link2);	
	WebElement link1=driver.findElement(By.xpath("(//a[normalize-space()='Link1'])[1]"));
	js.executeScript("arguments[0].click();", link1);	
	List<WebElement>allLinks=driver.findElements(By.tagName("a"));
	System.out.println("Num of Links in the Page is       "+allLinks.size());
	int BrokenLink=0;
	for(WebElement link :allLinks)
	{
			    String hrefAttValue= link.getAttribute("href");
			    if(hrefAttValue==null || hrefAttValue .isEmpty())
			    {
			    	System.out.println("URL is EMPTY");
			    	continue;
			    }
			    
			    URL url= new URL(hrefAttValue);
			    try
			    {
			    	  HttpURLConnection conn= (HttpURLConnection)url.openConnection();//here Iam Opening The Connection
					    conn.connect();
					    
					    if(conn.getResponseCode()>=400)
					    {
					    	BrokenLink++;
					    	System.out.println("This is Broken Link     "+url+"     and the responseCode is     "+conn.getResponseCode());
					    }
					    else
					    {
					    	System.out.println("This is NOT Broken Link   "+url+"     and the responseCode is     "+conn.getResponseCode());
					    }
					    
			    }
			    catch(Exception e)
			    {
			    	System.out.println(e.getMessage());
			    }
		}
	System.out.println("Number of Broken links are       "+BrokenLink);	    
     
  
	
	
	
}

}
