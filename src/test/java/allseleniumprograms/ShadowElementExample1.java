package allseleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowElementExample1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement Root = driver.findElement(By.tagName("book-app"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		SearchContext shadowElement = (SearchContext) js.executeScript("return arguments[0].shadowRoot", Root);
		WebElement appHeader = shadowElement.findElement(By.tagName("app-header"));
		WebElement appToolBar = appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement bookInput = appToolBar.findElement(By.tagName("book-input-decorator"));
		bookInput.findElement(By.cssSelector("input#input")).sendKeys("VamsiTesting");
		
		
		driver.close();

	}

}
