package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollingpagejavascriptcode {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//1. Scroll down page by pixel
		js.executeScript("window.scrollBy(0,3000)", "");
		/*
		long value = (Long) js.executeScript("return window.pageYOffset;");
		System.out.println("Number of pixels moved:" + value); // 3000*/
		
		//2. Scroll down page till the element is visible
		
//        WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of Israel']"));
//		js.executeScript("arguments[0].scrollIntoView();",flag);
//		long value=(Long)js.executeScript("return window.pageYOffset;");
//		System.out.println("Number of pixels moved:"+value);
		
	      //Scroll page to the end 
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); 
		 long  value=(Long)js.executeScript("return window.pageYOffset;"); 
		  System.out.println("Number of pixels moved:"+value); 
		 		
		  

//			JavascriptExecutor js = driver;
//			js.executeScript("arguments[0].click();", webelement);//if element is not clickable then use this method
//			
		
		
		driver.close();

	}

}
