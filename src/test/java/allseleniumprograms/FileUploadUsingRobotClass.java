package allseleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws Exception {
		 ChromeDriver driver = new ChromeDriver();
	      driver.get("https://automationexercise.com/contact_us");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
	      WebElement ele=driver.findElement(By.name("upload_file"));
	      JavascriptExecutor js =(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView();", ele);
	    System.out.println( js.executeScript("return window.pageYOffset"));
	     
	      Actions aa= new Actions(driver);
	      aa.moveToElement(ele).click().perform();
	      Thread.sleep(3000);
           StringSelection ss= new StringSelection("C:\\Users\\HP\\Downloads\\MANUAL TESTING QUESTIONS new (1).pdf");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		   
		   Robot rb = new Robot();
		   rb.delay(300);
		   //click Control-v
		   rb.keyPress(KeyEvent.VK_CONTROL);
		   rb.keyPress(KeyEvent.VK_V);
		   //click v
		   rb.keyRelease(KeyEvent.VK_V);
		   rb.keyRelease(KeyEvent.VK_CONTROL);
		   rb.delay(2000);
		   //clickEnter
		   rb.keyPress(KeyEvent.VK_ENTER);
		   rb.keyRelease(KeyEvent.VK_ENTER);

	}

}
