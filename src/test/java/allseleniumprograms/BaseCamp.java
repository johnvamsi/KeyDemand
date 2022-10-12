package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCamp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://basecamp.underdev.in/signup");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8074835943");
		driver.findElement(By.xpath("//a[normalize-space()='Sign up'])[1]")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div[2]/div/div/button")).click();//sendOTP
		driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div[2]/div/div/div[1]/div/input"));
		;
		for(int i=0; i<=2;i++)
		{
			Thread.sleep(5000);
		}
		driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div[2]/div/div/div[1]/div/input"));
		driver.findElement(By.xpath("/html/body/app-root/app-signup/div/div[2]/div/button")).click();
		
		driver.quit();
	
		
		
		
		
		

	}

}
