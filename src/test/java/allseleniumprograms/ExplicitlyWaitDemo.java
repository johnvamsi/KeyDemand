package allseleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		WebDriverWait mywait = new WebDriverWait(driver,(Duration.ofSeconds(10)));
		WebElement userName=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		//driver.findElement(By.name("username")).sendKeys("Admin");
		userName.sendKeys("Admin");
     
	}

}
