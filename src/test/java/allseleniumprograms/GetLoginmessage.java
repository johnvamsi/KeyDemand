package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLoginmessage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devkeydemands.underdev.in/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@id='undefinedinput'])[1]")).sendKeys("devkeydemand@gmail.com");
		driver.findElement(By.xpath("(//input[@id='undefinedinput'])[2]")).sendKeys("superadmin@1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		

	}

}
