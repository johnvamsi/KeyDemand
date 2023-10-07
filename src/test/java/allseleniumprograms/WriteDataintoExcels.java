package allseleniumprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteDataintoExcels {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		String file="C://Users//HP//Downloads//ApacheTestcases.xlsx";
		FileOutputStream fo= new FileOutputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet=wb.createSheet("Data");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		int rowCount= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(rowCount);
		int colCount= driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]/td")).size();
		System.out.println(colCount);
		for(int r=2;r<=rowCount;r++)
		{
			XSSFRow row =sheet.createRow(r);
			for(int c=1;c<=colCount;c++)
			{
				String text=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(text);
				row.createCell(c).setCellValue(text);
			}
		}
		//or we can use below method also 
		sheet.createRow(1).createCell(1).setCellValue("Vamsi");
		sheet.createRow(1).createCell(2).setCellValue("Testing");
		sheet.createRow(1).createCell(3).setCellValue("Interview");
		
		
		wb.write(fo);
		driver.close();
		
	}

}
