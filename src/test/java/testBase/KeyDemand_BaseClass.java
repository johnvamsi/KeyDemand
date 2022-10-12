package testBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyDemand_BaseClass {
	
	public WebDriver driver;
	public  Logger logger;
	
	@BeforeClass(groups= {"regression","sanity"})
	//@Parameters({"browser"})
	public void SetUp( ) throws InterruptedException
	{
		logger = LogManager.getLogger(getClass());
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://devkeydemands.underdev.in/login");//-superadmin
		driver.get("https://devuserkeydemands.underdev.in/");//--user
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		logger.info("Launched Chrome Browser");
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void Tear()
	{
		// driver.close();
		//driver.quit();
	}
	
	public String randomestring() 
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}
	
	public int randomeNumber() 
	{
		String generatedString2 = RandomStringUtils.randomNumeric(5);
		return (Integer.parseInt(generatedString2));
	}
	
	public long randomeNumber1() 
	{
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		//return (Integer.parseInt(generatedString2));
		return(Long.parseLong(generatedString2));
	}
	
	public  void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "\\screenshots\\" + tname + ".png");
		FileUtils.copyFile(source, target);
		
		
		
	}

}
