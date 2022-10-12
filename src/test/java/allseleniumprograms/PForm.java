package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PForm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	List<WebElement>allLinks=	driver.findElements(By.xpath("(//ul[@class='nav navbar-nav']//li)"));
	int rowsize=allLinks.size();
	System.out.println(rowsize);
	for(WebElement link :allLinks)
	{
		
		String Text=link.getText();
		System.out.println(Text);
		if(Text.equals("Desktops"))
		{
			link.click();
			break;
		}
	}
		

	}

}
