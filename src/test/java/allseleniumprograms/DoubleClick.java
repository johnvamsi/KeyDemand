package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("field1")).clear();
		driver.findElement(By.id("field1")).sendKeys("welcometo Testing");
		
		WebElement copytextbutton=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions act= new Actions(driver);
		act.doubleClick(copytextbutton).perform();
		Thread.sleep(2000);
		
		

	}

}
