package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devkeydemands.underdev.in/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@id='undefinedinput'])[1]")).sendKeys("devkeydemand@gmail.com");
		driver.findElement(By.xpath("(//input[@id='undefinedinput'])[2]")).sendKeys("superadmin@1234");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		/*driver.findElement(By.xpath("//div[normalize-space()='Admin Team']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Add Admin']")).click();
		driver.findElement(By.name("name")).sendKeys("Backendteam");
		driver.findElement(By.name("email")).sendKeys("Backendteam@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("8090701020");
		driver.findElement(By.name("password")).sendKeys("Devtest@1234");
		WebElement ele=driver.findElement(By.id("city"));
		Select drp=new Select(ele);
		drp.selectByValue("Mumbai");
		WebElement ele1=driver.findElement(By.name("roles"));
		Select drp1=new Select(ele1);
		drp.selectByVisibleText("Relationship Manager");
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();*/
		
		//Validation
		
		String msg=driver.findElement(By.xpath("(//div[@class='swal-text'])[1]")).getText();
		System.out.println(msg);
		
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
