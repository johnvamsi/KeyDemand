package allseleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Now of rows in the Table is :     " + rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th"));
		System.out.println("Now of cols in the Table is :     " + cols.size());
		String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText();
		System.out.println(text);
		
		//Read data from all the rows & columns
		/*
		 * for(int r=2;r<=rows.size();r++) { for(int c=1;c<=cols.size();c++) { String
		 * Value
		 * =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+
		 * "]")).getText(); System.out.print(Value+"               "); }
		 * System.out.println(); }
		 */
		int sum1 = 0;
		for (int r = 2; r <= rows.size(); r++) {
			String sum = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			sum1 = Integer.parseInt(sum) + sum1;
		}
		System.out.println("Sum of the prices of all books is :     " + sum1);

		// 5) Print book names whose author is Amit

		
		 for(int r=2;r<=rows.size();r++) 
		 { 
			 String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+ "]/td[2]")).getText();
		  
		  if(author.equals("Mukesh"))
		  { 
			  String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText(); System.out.println(author+"    "+bookname); }
		 
		  }
		

		// 6)Find sum of prices for all the books

		for (int r = 2; r <= rows.size(); r++) 
		{
			String sum = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[4]")).getText();
			sum1 = Integer.parseInt(sum) + sum1;
		}
		System.out.println("Sum of the prices of all books is :     " + sum1);
	 		
  
	  Thread.sleep(4);
	   driver.close();
	}

}
