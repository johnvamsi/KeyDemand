package allseleniumprograms;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokerForm {
	public static String generateEmail()
	{
		String Name1=RandomStringUtils.randomAlphabetic(10);
		return(Name1);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}
	public static String generateName()
	{
		String Name=RandomStringUtils.randomAlphabetic(10);
		return(Name);
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devuserkeydemands.underdev.in/");
		driver.manage().window().maximize();
		for(int i=1;i<=2;i++)
	{
			if(i==1)
			{
				driver.findElement(By.xpath("//span[normalize-space()='Sign up as Broker']")).click();
				driver.findElement(By.id("nameinput")).sendKeys(generateName());
				driver.findElement(By.id("lastNameinput")).sendKeys(generateName());
				String  phnum=randomeNum();
				driver.findElement(By.name("phoneNumber")).sendKeys(String.valueOf(phnum));
				driver.findElement(By.name("email")).sendKeys(generateEmail()+"@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Developer@123");
				driver.findElement(By.xpath("//input[@id='terms']")).click();
				driver.findElement(By.xpath("//span[normalize-space()='Sign Up']")).click();
				Thread.sleep(4000);
				String text=driver.findElement(By.xpath("//div[normalize-space()='Broker']")).getText();
				if(text=="Broker")
				{
					System.out.println("TestCase passed");
				}
				else
				{
					System.out.println("TestCase Failed");
				}
				
				System.out.println(text);
				driver.navigate().refresh();
			}
			if(i==2)
			{
			driver.findElement(By.xpath("//span[normalize-space()='Sign up as Broker']")).click();
			driver.findElement(By.id("nameinput")).sendKeys(generateName());
			driver.findElement(By.id("lastNameinput")).sendKeys(generateName());
			String  phnum=randomeNum();
			driver.findElement(By.name("phoneNumber")).sendKeys(String.valueOf(phnum));
			driver.findElement(By.name("email")).sendKeys(generateEmail()+"@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Developer@1235");
			driver.findElement(By.xpath("//input[@id='terms']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Sign Up']")).click();
			Thread.sleep(4000);
			String text=driver.findElement(By.xpath("//div[normalize-space()='Broker']")).getText();
			if(text=="Broker")
			{
				System.out.println("TestCase passed");
			}
			else
			{
				System.out.println("TestCase Failed");
			}
			}
			
		//	driver.navigate().refresh();
			
		}
//		
		driver.close();
		
		
		
	}

}
