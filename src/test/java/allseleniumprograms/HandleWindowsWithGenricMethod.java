package allseleniumprograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsWithGenricMethod {

	//genericeMethod
		public static boolean  switchToRightWindow(String Title,WebDriver driver,List<String> handleList)
		{
			for(String hlist:handleList)
			{
				String  title=driver.switchTo().window(hlist).getTitle();
				if (title.equals(Title))
				{
					System.out.println("I switched to my Desired Window "+driver.getCurrentUrl()+"   and Title is      "+title);
					return true;
				}
			}
					return false;
		}
		public static void CloseAllWindows(String pw,WebDriver driver,List<String> handleList)
		{
					for(String hlist:handleList)
					{
								if (!hlist.equals(pw))
								{
												driver.switchTo().window(hlist).close();
								}
					}
		}
		public static  void switchToParentWindow(String pW,WebDriver driver)
		{
			driver.switchTo().window(pW);
			System.out.println(driver.getCurrentUrl()+"         "+driver.getTitle());
			System.out.println("This method is executed");
			driver.findElement(By.name("username")).sendKeys("VamsiTest");
		}

		public static void main(String[] args) {
		
			WebDriver driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentWindow=driver.getWindowHandle();
		String parentWindowTitle=driver.switchTo().window(parentWindow).getTitle();
			System.out.println("parentWindowTitle is    "+parentWindowTitle);
		List<WebElement>allLinks =driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/child::a"));
		System.out.println("Number of Links is          "+allLinks.size());
		 
			for(WebElement  link :allLinks)
			{
				link.click();//to open all The links 
				
			}

		Set<String>allHandleValues=driver.getWindowHandles();
		System.out.println("No of HandleValues are ---------"+allHandleValues.size());
		List<String>handleList = new ArrayList(allHandleValues); //here iam converting set variable into list variable
		if(switchToRightWindow("OrangeHRM (@orangehrm) / Twitter" ,driver,handleList))
				{
			          System.out.println(driver.getCurrentUrl()+"  Title is        "+driver.getTitle());
				}
		CloseAllWindows(parentWindow ,driver,handleList);
		switchToParentWindow(parentWindow, driver);
		}
}