package allseleniumprograms;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesANDFrames {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Alert")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		FluentWait mywait = new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30));
		mywait.pollingEvery(Duration.ofSeconds(5));
		mywait.ignoring(NoSuchElementException.class);
		//WebDriverWait mywait = new WebDriverWait(driver,(Duration.ofSeconds(10)));
		WebElement overView=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Overview'])[1]")));
		//driver.findElement(By.linkText("Overview"));
		overView.click();
		
		Thread.sleep(3000);
		driver.close();
	

	}

}
