package allseleniumprograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.XLUtility;

public class FixedDepositCalculator {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String path="C:\\Users\\HP\\Downloads\\caldata.xlsx";
		XLUtility xlutils= new XLUtility(path);
		int rows=xlutils.getRowCount("Sheet1");
		System.out.println(rows);
		for(int r=1;r<=rows;r++)
		{
			String princ=xlutils.getCellData("Sheet1", r, 0);
			String roi=xlutils.getCellData("Sheet1", r, 1);
			String prd1=xlutils.getCellData("Sheet1", r, 2);
			String prd2=xlutils.getCellData("Sheet1", r, 3);
			String freq=xlutils.getCellData("Sheet1", r, 4);
			String expmaturity_Val=xlutils.getCellData("Sheet1", r, 5);
			
			//driverm code 
			driver.findElement(By.id("principal")).sendKeys(princ);
			driver.findElement(By.id("interest")).sendKeys(roi);
			driver.findElement(By.id("tenure")).sendKeys(prd1);
			WebElement drp=driver.findElement(By.id("tenurePeriod"));
			Select prddrp=new Select(drp);
			prddrp.selectByVisibleText(prd2);
			
			Select freq_drp=new Select(driver.findElement(By.id("frequency")));
			freq_drp.selectByVisibleText(freq);
			
			WebElement clic_Calculate = driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]"));

			JavascriptExecutor js = driver;
			js.executeScript("arguments[0].click();", clic_Calculate);
			Thread.sleep(2000);
			
			
		    String act_matValue= driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		    if(Double.parseDouble(expmaturity_Val)==Double.parseDouble(act_matValue))
		    {
		    	System.out.println("TestPassed");
		    	xlutils.setCellData("Sheet1", r, 7, "passed");
		    	xlutils.fillGreenColor("Sheet1", r, 7);//
		    	
		    }
		    else
		    {
		    	System.out.println("TestFailed");
		    	xlutils.setCellData("Sheet1", r, 7, "Failed");
		    	xlutils.fillGreenColor("Sheet1", r, 7);//
		    }
		    
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("//img[@class='PL5']")).click(); //clear button

			
		}
		driver.close();
		
		

	}
	

}
