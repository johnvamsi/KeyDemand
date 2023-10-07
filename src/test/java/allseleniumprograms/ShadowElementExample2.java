package allseleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowElementExample2 {

	public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement Root = driver.findElement(By.tagName("shop-app"));
		WebElement shadowElement = getShadow(Root, driver);
		
		
		WebElement ironPages = shadowElement.findElement(By.tagName("iron-pages"));
		WebElement shopHome = ironPages.findElement(By.name("home"));
		WebElement shadowElement2 = getShadow(shopHome, driver);
		
		shadowElement2.findElement(By.cssSelector("div : nth-child(2) > shop-button > a")).click();
		
		
		
	
		
		
		driver.close();
	  
  }
    public static WebElement getShadow(WebElement Element ,WebDriver driver)
     {
    	JavascriptExecutor js =(JavascriptExecutor)driver;
    	WebElement ele=(WebElement)js.executeScript("return arguments[0].shadowRoot",Element );
    	 return  ele;
     }

}
