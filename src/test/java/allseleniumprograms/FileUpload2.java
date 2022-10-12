package allseleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload2 {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	     
	     driver.get("https://www.monsterindia.com/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
	      
	     //Aprpaoch1 - Using sendKeys() method
	     //driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\HP\\Downloads\\MANUAL TESTING QUESTIONS new (1).pdf");
	     
	     //Appraoch2
	     //driver.findElement(By.xpath("//input[@id='file-upload']")).click(); //opens the window - not working
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='file-upload']")));
	     
	   //put path to file in a clipboard
	     StringSelection ss=new StringSelection("C:\\Users\\HP\\Downloads\\MANUAL TESTING QUESTIONS new (1).pdf");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     
	    //Robot class
	     Robot rb=new Robot();
	     rb.delay(300);
	     
	     //CTRL+V
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	        
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	     rb.delay(2000);
	     
	     //press Enter key
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
