package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement minslider =driver.findElement(By.xpath("//span[1]"));
		System.out.println(minslider.getLocation());
		Actions aa= new Actions(driver);
		aa.dragAndDropBy(minslider, 100, 0).perform();
		
		WebElement maxslider=driver.findElement(By.xpath("//span[2]"));
		System.out.println(maxslider.getLocation());
		aa.dragAndDropBy(maxslider, -100, 0).perform();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
