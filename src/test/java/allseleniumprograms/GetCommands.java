package allseleniumprograms;

import java.time.Duration;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCommands {
	/*
		     get()
			getTitle()
			getCurrenturl()
			getPageSource()
			getWindowHandle()
            getWindowHandles()
	 */
	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// get()-this method is used to launch the Url
		driver.get("https://testautomationpractice.blogspot.com/?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//getTitle()-this method is used get title of the page 
		String title=driver.getTitle();//Automation Testing Practice
		System.out.println(title);
		//getCurrenturl()-this method will return the current url of the page
/*		String CurrentURl=driver.getCurrentUrl();
		System.out.println(CurrentURl);
		//getPageSource()-this method will return the page source of an webpage
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);*/
		
		/*	getWindowHandle()-this method is used to get Current window handle value of a browser
		
         driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
		
		driver.findElement(By.className("wikipedia-search-button")).click();
		
		String text=driver.findElement(By.xpath("(//div[@id='wikipedia-search-result-link'])[3]/a")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//div[@id='wikipedia-search-result-link'])[3]/a")).click();
		String handlevalue=driver.getWindowHandle();
		System.out.println(handlevalue);
		Thread.sleep(3000);*/
		/*getWindowHandles()-this method is used to get all window handle values of each and every browser
	      driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Selenium");
	      driver.findElement(By.className("wikipedia-search-button")).click();
	    List<WebElement>searchResult=  driver.findElements(By.xpath("(//div[@id='wikipedia-search-result-link'])/a"));
	    for(WebElement singlEle:searchResult)
	    {
	    	System.out.println(singlEle.getText());
	    	singlEle.click();
	    
	    	String text=singlEle.getText();
	    	if(text.equals("Selenium (software)"))
	    	{
	    		singlEle.click();
	    		
	    	}
	    	
	    }
	
  Set<String>handlevalues=  driver.getWindowHandles();
  for(String singlehandlevalue:handlevalues)
  {
	  System.out.println(singlehandlevalue);
  }*/
        
        
		
		
		
		
		
		//driver.quit();
		
		
		
				

		
		
		
		
		
		
		
		  
		

		   
		
		

	}

}
