package allseleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardactionsmultiplekeys {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
	WebElement Text1=	driver.findElement(By.id("inputText1"));
	WebElement Text2=	driver.findElement(By.id("inputText2"));
	Text1.sendKeys("Welcometo softwaretesting");
	
	Actions aa = new Actions(driver);
	//Select all the Text-CTRL+A
	aa.keyDown(Keys.CONTROL);
	aa.sendKeys("a");
	aa.keyUp(Keys.CONTROL);
	aa.perform();
	
	//Copy the Text 
	aa.keyDown(Keys.CONTROL);
	aa.sendKeys("c");
	aa.keyUp(Keys.CONTROL);
	aa.perform();
	
	//move to next  Tab;
	aa.sendKeys(Keys.TAB);
	aa.perform();
	
	//paste the text 
	aa.keyDown(Keys.CONTROL);
	aa.sendKeys("v");
	aa.keyUp(Keys.CONTROL);
	aa.perform();
	
	//verification 
    if((Text1.getText()).equals(Text2.getText()))
    {
    	System.out.println("Both text are Same");
    }
    else
    {
    	System.out.println("Both texts are not equal");
    }
	

	}

}
