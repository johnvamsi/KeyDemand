package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> checkboxes =driver.findElements(By.xpath("(//input[@type='checkbox' and contains(@id,'day')])"));
		System.out.println(checkboxes.size());
		/*
		 * for(int i = 0; i<checkboxes.size(); i++) 
		 * { 
		 *   checkboxes.get(i).click();
		 * 
		 * }
		
		
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		} */
		
		
		/*
		 * for(int i=0;i<checkboxes.size();i++) { if(i<3) { checkboxes.get(i).click(); }
		 * }
		 */
		/*
		 * for(int i=checkboxes.size()-3; i<checkboxes.size();i++) {
		 * checkboxes.get(i).click(); }
		 */
		
		for(WebElement checkbox:checkboxes)
		{
			String value=checkbox.getAttribute("id");
			System.out.println(value);
			if(value.equals("monday") || value.equals("sunday"))
			{
				checkbox.click();
			}
		}
		
		
		
	}

}
