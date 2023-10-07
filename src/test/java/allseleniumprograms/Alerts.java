package allseleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage(  ).window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/ul/li[3]/button")).click();
		driver.switchTo().alert().sendKeys("Automation testing ");
		Thread.sleep(3000);
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		Thread.sleep(5000);
		myalert.accept(    );
		
		//driver.close();
		
		
		
		
	}

}
