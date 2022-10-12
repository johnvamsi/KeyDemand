package allseleniumprograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Downloads\\Datadriventesting123.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("data");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		int cols=  sheet.getRow(rows).getLastCellNum();
		System.out.println(cols);
		for(int r=0;r<=rows;r++)
		{
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				String celldata =row.getCell(c).toString();
				System.out.print(celldata+"                           ");
			}
			System.out.println();
		}
		
		
	}

}
