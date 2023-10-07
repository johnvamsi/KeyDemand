package allseleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownWithoutSelectTag2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
        
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
	//List<WebElement>allOptions=	driver.findElements(By.xpath("//ul[@Class='multiselect-container dropdown-menu']//li" ));
		//Below xpath is to exclude CSS and HTML elements and to select remaining options.
	List<WebElement>allOptions=	driver.findElements(By.xpath("//label[@class='checkbox' and not(contains(text(),'HTML'))   and not(contains(text(),'CSS'))]" ));
	System.out.println("Num of option in the Dropdown is    "+allOptions.size());
	//unselect HTML
	driver.findElement(By.xpath("//label[@class='checkbox' and (contains(text(),'HTML'))]")).click();
	//unselect CSS
	driver.findElement(By.xpath("//label[@class='checkbox' and (contains(text(),'CSS'))]")).click();
	Thread.sleep(4000);

	for(int i=0;i<allOptions.size();i++)
	{
						allOptions.get(i).click();
	}
		
		
		
		
		
		
		
		
		//driver.quit();

	}

}
