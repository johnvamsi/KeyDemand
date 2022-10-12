package allseleniumprograms;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterpriseEnquiryForm {
	
	public static String generateName()
	{
		String Name=RandomStringUtils.randomAlphabetic(10);
		return(Name);
	}
	public static int generatePhnum()
	{
		String num=RandomStringUtils.randomNumeric(10);
		return (Integer.parseInt(num));
	}
	
	public static String generateEmail()
	{
		String Name1=RandomStringUtils.randomAlphabetic(10);
		return(Name1);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devuserkeydemands.underdev.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		for(int i=0;i<=20;i++) 
		{
			driver.findElement(By.linkText("Enterprise Solutions")).click();
		    driver.findElement(By.id("nameinput")).sendKeys(generateName());
			driver.findElement(By.id("companyNameinput")).sendKeys(generateName());
			driver.findElement(By.id("designationinput")).sendKeys(generateName());
			WebElement drp=driver.findElement(By.id("wantTo"));
		    Select dropdown=new Select(drp);
		    dropdown.selectByValue("Seller");
		    WebElement citydrp=driver.findElement(By.xpath("(//select[@id='city'])[1]"));
		    Select dropdown1=new Select(citydrp);
		    dropdown1.selectByVisibleText("Mumbai");
		    driver.findElement(By.id("emailinput")).sendKeys(generateEmail()+"@gmail.com");
		    String  phnum=randomeNum();
		   // int phnum =generatePhnum();
		   driver.findElement(By.id("phoneNumberinput")).sendKeys(String.valueOf(phnum));
		    Thread.sleep(3000);
		   WebElement moCdrp= driver.findElement(By.id("modeOfContact"));
		   Select dropdown3 = new Select(moCdrp);
		   dropdown3.selectByVisibleText("Call");
		   driver.findElement(By.xpath("//span[normalize-space()='Submit']")).click();
		   	Thread.sleep(3000);
		   	driver.navigate().refresh();
		}
		
		driver.close();
	

	}

}
