package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NotificationsPage {
	WebDriver driver;
	public NotificationsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//pageObjects
	
	@FindBy(xpath="(//a[@href='/notification'])[1]")
	WebElement Notification_clk;
	
	@FindBy(xpath="//span[normalize-space()='Create Notification']")
	WebElement CreateNotification_clk;
	
	@FindBy(name="title")
	WebElement Notification_txt;
	
	@FindBy(name="message")
	WebElement message_txt;
	
	@FindBy(name="userType")
	WebElement selectUsers_drp;
	
	@FindBy(xpath="(//input[@placeholder='search'])[1]")
	WebElement PhoneNumber_search;
	
	@FindBy(xpath="//span[normalize-space()='send']")
	WebElement send_btn;
	
	@FindBy(xpath="//table[@class='table']//tr[1]//td[2]")
	WebElement NotificationTitle_ele;
	
	
	
	//Actions methods
	public void clickNotificationTab()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Notification_clk);
		//Notification_clk.click();
	}
	
	public void CreateNotification()
	{
		CreateNotification_clk.click();
	}
    
	public void setNotificationTitle(String title)
	{
		Notification_txt.sendKeys(title);
	}
	
	public void setMessage(String msg)
	{
		message_txt.sendKeys(msg);
	}
	
	public void setSelectUser(String user)
	{
		Select dropdown=new Select(selectUsers_drp);
		dropdown.selectByVisibleText(user);
	}
	
	public void seacrhMobileNumber(String phnnumb)
	{
		PhoneNumber_search.sendKeys(phnnumb);
	}
	
	public void clickSendButton()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", send_btn);
		//send_btn.click();
	}
	
	public String isNotificationcreated() 
	{
		String text=NotificationTitle_ele.getText();
		return (text);
		
	}
	
	

}
