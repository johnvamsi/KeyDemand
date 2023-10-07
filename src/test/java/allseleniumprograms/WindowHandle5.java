package allseleniumprograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle5 {

	
	
	public static WebDriver driver;
    
	public static void main(String[] args) throws Exception {
		driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//String ParentWindowID=driver.getWindowHandle();
	List<WebElement>allLinks =driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/child::a"));
	 for(WebElement link :allLinks)
	 {
		 		link.click();
		 
	 }
		Set<String> AllWindowHandles=driver.getWindowHandles();
		List<String>HandleList= new ArrayList<String>(AllWindowHandles);
		int count=0;
		for(String handlev:HandleList)
		{
			String Title=driver.switchTo().window(handlev).getTitle();
			System.out.println("Title of the Page is "+Title+"    and the Count is    "+count);
			count++;
		}
		String handle3=HandleList.get(3);
		closeAllWindows(HandleList,handle3);
		Thread.sleep(4000);
		driver.switchTo().window(HandleList.get(3));
		String Title=driver.getTitle();
		System.out.println(driver.getCurrentUrl()+"           "+Title);
		
		
		

	}

	private static void closeAllWindows(List<String>HandleList,String pw)
	{
				for(String hlist:HandleList)
				{
					if(!hlist.equals(pw))
					{
						driver.switchTo().window(hlist).close();
					}
				}
		
	}
}
