package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devkeydemands.underdev.in/termsConditions");
		driver.findElement(By.id("undefinedinput")).sendKeys("devkeydemand@gmail.com");
		driver.findElement(By.xpath("(//input[@id='undefinedinput'])[2]")).sendKeys("superadmin@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[normalize-space()='Privacy Policy'])[1]")).click();
		WebElement clickedit=driver.findElement(By.xpath("(//button[normalize-space()='Edit'])[1]"));
		JavascriptExecutor js = driver;
		js.executeScript("arguments[0].click();", clickedit);
	

	
		Thread.sleep(3000);
		
		//driver.close();

		
	

	}

}
