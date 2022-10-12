package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	
	//Pageobjects
	
	   @FindBy(xpath="//input[@placeholder='Enter your email ID']")
	    WebElement txt_Email;
	   
	   @FindBy(xpath="//input[@placeholder='Enter your password']")
	    WebElement txt_pwd;
	   
	   @FindBy(xpath="//button[@type='submit']")
	   WebElement clk_loginbtn;
	   
	   @FindBy(xpath="//label[normalize-space()='Dashboard']")
	      public WebElement txt_dashboard;
	   
	   @FindBy(xpath="//div[normalize-space()='Logout']")
	   WebElement Clk_logout;
	   
	   
	   

	   public void setUsername(String email)
	   {
		   txt_Email.sendKeys(email);
		
	   }
	   public void clearUserName()
	   {
		   txt_Email.clear();
		}
	   
	   public void setPassword(String pwd)
	   {
		   txt_pwd.sendKeys(pwd);
	   }
	   public void clearPassWord()
	   {
		   txt_pwd.clear();
		}
	   
	   
	   public void ClickLogin()
	   {
		   clk_loginbtn.click();
	   }
	   
	   
	   public void ClickLogout()
	   {
		   JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", Clk_logout);
		   //Clk_logout.click();
	   }
	  
	   //verification-1
		public void pageVerification() 
		{
			String exp_title = txt_dashboard.getText();
			Assert.assertEquals(exp_title, "Dashboard");
		}
		
		 //verification-2
		public boolean isMyDashboardExists()
		{
			try
			{
				return(txt_dashboard.isDisplayed());
			}
			catch(Exception e)
			{
				return (false);
				
			}
		
		}
	
	
	
	

}
