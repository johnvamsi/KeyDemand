package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BrokerPage {
	WebDriver driver;
	public BrokerPage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//PageObjects 
	@FindBy(xpath="//span[normalize-space()='Sign up as Broker']")
	WebElement signupasABroker_btn;
	
	@FindBy(name="name")
	WebElement firstName_txt;
	
	@FindBy(name="lastName")
	WebElement lastName_txt;
	
	@FindBy(name="phoneNumber")
	WebElement mobnum_txt;
	
	@FindBy(name="email")
	WebElement email_txt;
	
	@FindBy(name="password")
	WebElement password_txt;
	
	@FindBy(name="Confirm Password")
	WebElement confirmPwd_txt;
	
	@FindBy(xpath="(//input[@id='terms'])[1]")
	WebElement privacyPolicy_checkbox;
	
	@FindBy(xpath="(//span[normalize-space()='Sign Up'])[1]")
	WebElement signup_btn;
	
	@FindBy(xpath="//div[@class='d-flex flex-column justify-content-center align-items-center imageUpload-container containImage']")
	WebElement addProfile_btn;
	
	@FindBy(name="about")
	WebElement about_txt;
	
	@FindBy(name="city")
	WebElement city_drp;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submit_btn;
	
	@FindBy(xpath="(//div[@class='swal-text'])[1]")
	WebElement success_msg;
	
	
	
	
	
	//Action Methods
	public void clickSingupAsaBroker() 
	{
		signupasABroker_btn.click();
	}
	
	public void setFirstName(String fname)
	{
		firstName_txt.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		lastName_txt.sendKeys(lname);
	}
	
	public void setMobileNumber(String number)
	{
		mobnum_txt.sendKeys(number);
	}
	
	public void setEmail(String email)
	{
		email_txt.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		password_txt.sendKeys(pwd);
	}
	
	public void setConformPassword(String pwd1)
	{
		confirmPwd_txt.sendKeys(pwd1);
	}
	public void clickPrivacyCheckBox()
	{
		privacyPolicy_checkbox.click();
	}
	
	public void clickSignup()
	{
		signup_btn.click();
	}
	
	public void setProfilePicture1(String path)
	{
		addProfile_btn.sendKeys(path);
	}
	
	public void setProfilePicture2(String path) throws AWTException
	{
		addProfile_btn.click();
		StringSelection ss=new StringSelection(path);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    
	    Robot rb=new Robot();
	     rb.delay(300);
	     
	     //CTRL+V
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	        
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	     rb.delay(2000);
	     
	     //press Enter key
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	    
	}
	
	public void setAbout(String text)
	{
		about_txt.sendKeys(text);
	}
	
	public void selectCity(String city)
	{
		Select dropdown=new Select(city_drp);
		dropdown.selectByVisibleText(city);
	}
	
	public void clickSubmit1()
	{
		submit_btn.click();
	}
	
	public String getSuccessMsg() 
	{
		String text=success_msg.getText();
		    return text;
	}

}
