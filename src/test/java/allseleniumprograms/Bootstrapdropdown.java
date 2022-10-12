package allseleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");

		// Select product type
		driver.findElement(By.xpath("//div[@class='drp1']//a[@class='btn-primary dropdown-toggle btn-block']")).click();

		List<WebElement> prodTypes = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
		System.out.println("Number of options:" + prodTypes.size());

		// select option
		for (WebElement ptype : prodTypes) {
			// System.out.println(ptype.getText());
			if (ptype.getText().equals("Loans")) {
				ptype.click();
				break;
			}
		}

	}

}
