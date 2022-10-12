package allseleniumprograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FixedDepositCalculator1 {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		

		
         String path="C:\\Users\\HP\\Downloads\\caldata.xlsx";
		
		int rows=XLUtils.getRowCount(path, "Sheet1");
		
		for(int r=1;r<=rows;r++)
		{
			String pric=XLUtils.getCellData(path, "Sheet1", r, 0);
			String rateofinterest=XLUtils.getCellData(path, "Sheet1", r, 1);
			String per1=XLUtils.getCellData(path, "Sheet1", r, 2);
			String per2=XLUtils.getCellData(path, "Sheet1", r, 3);
			String fre=XLUtils.getCellData(path, "Sheet1", r, 4);
			String exp_mvalue=XLUtils.getCellData(path, "Sheet1", r, 5);
			
			//application code
			driver.findElement(By.id("principal")).sendKeys(pric);
			driver.findElement(By.id("interest")).sendKeys(rateofinterest);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			
			Select perdrp=new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
						
			Select fredrp=new Select(driver.findElement(By.id("frequency")));
			fredrp.selectByVisibleText(fre);
			
			WebElement clic_Calculate = driver.findElement(By.xpath("//div[@class='PT25']//a[1]//img[1]"));

			JavascriptExecutor js = driver;
			js.executeScript("arguments[0].click();", clic_Calculate);
			Thread.sleep(2000);
			
		
			
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue))
			{
				System.out.println("Test Passed");
				XLUtils.setCellData(path, "Sheet1", r, 7, "Passed");
				XLUtils.fillGreenColor(path,"Sheet1", r, 7);
			}
			else
			{
				System.out.println("Test Failed");
				XLUtils.setCellData(path, "Sheet1", r, 7, "Failed");
				XLUtils.fillRedColor(path,"Sheet1", r, 7);
			}
			
			Thread.sleep(3000);
			WebElement clr_btn=driver.findElement(By.xpath("//img[@class='PL5']")); //clear button
			js.executeScript("arguments[0].click();", clr_btn);
			Thread.sleep(2000);
			
			
		}
		
		driver.close();

	}

}
