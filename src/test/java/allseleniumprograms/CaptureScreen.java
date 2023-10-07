package allseleniumprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreen {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();

    	//driver.get("https://demo.nopcommerce.com/");
		driver.get("https://devuserkeydemands.underdev.in/");
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	
    	//Full page screenshot 
    	
		TakesScreenshot ts = driver;//if you are using chromedriver
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File(System.getProperty("user.dir") + "\\screenshots\\MyTestCase.png");
		FileUtils.copyFile(src, trg);
    	
    	/*WebElement particularpage= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
    	TakesScreenshot ts=(TakesScreenshot)driver;/if you are using webdriver
    	File Src=   particularpage.getScreenshotAs(OutputType.FILE);
    	File Trg= new File(System.getProperty("user.dir")+ "\\screenshots\\particularpage.png");
    	FileUtils.copyFile(Src, Trg);*/
    	
    	
//    	WebElement Logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
//    	File Src= Logo.getScreenshotAs(OutputType.FILE);
//    	File Trg= new File(System.getProperty("user.dir")+"\\screenshots\\logos.png");
//    	FileUtils.copyFile(Src, Trg);
    	
    	
    	
    	
    	
    	
    	
    	
    	//driver.close();
    	
    	
       
      
       	

	}

}
