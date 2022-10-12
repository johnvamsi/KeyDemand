package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		Thread.sleep(2000);
		// int
		// rows=driver.findElements(By.xpath("//table[@id='resultTable']//tr")).size();
		int rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println("No of rows :" + rows);
		int Enabled=0;
		
		for(int r=1;r<=rows;r++)
		{
			
            String Value= driver.findElement(By.xpath("//table[@id='resultTable']//tr["+r+"]/td[5]")).getText();
			//String Value=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
            if(Value.equals("Enabled"))
            {
            	Enabled++;
            	
            }
			
		}
		
		System.out.println("No of enabled persons :" +Enabled);
		System.out.println("No of Disabled persons :" +(rows-Enabled));
		
		
		
		
		
		
		
		
		driver.close();
		
	}

}
