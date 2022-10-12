package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickeyeicon {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://devkeydemands.underdev.in/login");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("superadmin@keydemand.com");
		driver.findElement(By.name("password")).sendKeys("superadmin@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//input[@placeholder='search']")).sendKeys("TestBuyer");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody[1]/tr[1]/td[7]/div[1]/div[1]")).click();
		
		driver.close();
		

	}

}
