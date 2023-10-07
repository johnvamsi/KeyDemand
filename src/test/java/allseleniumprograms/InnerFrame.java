package allseleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InnerFrame {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("mytext1")).sendKeys("Frame1");
		driver.switchTo().defaultContent();
		WebElement frame2=	driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext3")).sendKeys("Frame3");
		//switch to inner frame
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
	}

}
