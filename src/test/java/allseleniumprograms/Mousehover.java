package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement menuitem=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement macitem=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		Actions act = new Actions(driver);
//		act.moveToElement(menuitem).perform();
//		act.moveToElement(macitem).click().perform();
		
		act.moveToElement(menuitem).moveToElement(macitem).click().perform();
	
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();

}
	
	
}
