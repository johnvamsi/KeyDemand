package allseleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWithHiddenOptions {

	public static void main(String[] args) {
		
		//To  handle DropdownWithHiddenOptions TestCaes  we need inspect the element and then we need to click on event
		//Listners and then click on browser refresh button untill blur option displays in event listeners and then click on  remove in blur option and then automate.
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//div[6]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		
		List<WebElement>allEles=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("No of options in the dropdown is :      "+allEles.size());
		
		for(WebElement ele:allEles)
		{
					String text=ele.getText();
					if(text.equals("Account Assistant"))
					{
						ele.click();
						break;
					}
			
		}
		
		
		
		
		
		
	   //driver.close();
	}

}
