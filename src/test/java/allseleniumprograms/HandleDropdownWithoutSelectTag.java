package allseleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdownWithoutSelectTag {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		 List<WebElement>allEles= driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));
		 //List<WebElement>allOptions=	driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li//input"));
		 System.out.println("No of options is :"+allEles.size());
		  
		  ////label[@class='checkbox' and not(contains(text(),'HTML'))   and not(contains(text(),'CSS'))] -this xpath will exclude the selected elements and it will clicks on remaining elements
		  
		  for(WebElement   ele :allEles)
		  {
			  String text=ele.getText();
			  System.out.println(text);
			  
			  if(text.equals("Bootstrap") || text.equals("Java") || text.equals("C#")||text.equals("Python"))
				  {
				  			ele.click();
				  			
				  }
			  {
				  
			  }
		  }
		 
		   
		   
		  
		  Thread.sleep(4);
		   //driver.close();

	}

}
