package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgentSignupPage {
	
	WebDriver driver;
	public AgentSignupPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//pageObjects 
	@FindBy(xpath="//span[normalize-space()='Sign up as Agent']")
	WebElement signup_btn;
	
	@FindBy(name="name")
	WebElement fisrtname_txt;
	
	@FindBy(id="lastNameinput")
	WebElement lastname_txt;
	
	@FindBy(id="phoneNumberinput")
	WebElement mobnum_txt;
	
	@FindBy(xpath="//a[normalize-space()='Verify']")
	WebElement verify_btn;
	
	@FindBy(id="emailinput")
	WebElement email_txt;
	
	@FindBy(name="password")
	WebElement password_txt;
	
	@FindBy(id="Confirm Passwordinput")
	WebElement confirmPwd_txt;
	
	@FindBy(xpath="//input[@id='terms']")
	WebElement click_checkbox;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickSignup_btn;
	
	
	
	//actionMethods
	public void clickAgentSignup()
	{
		signup_btn.click();
	}
	public void setFirstname(String fname)
	{
		fisrtname_txt.sendKeys(fname);
	}
	public void setLastname(String lname)
	{
		lastname_txt.sendKeys(lname);
	}
	public void setMobileNumber(String numb)
	{
		mobnum_txt.sendKeys(numb);
		verify_btn.click();
	}
	public void setEmail(String email)
	{
		email_txt.sendKeys(email);
	}
    public void setPassword(String pwd)
    {
    	password_txt.sendKeys(pwd);
    }
	public void setConfirmPassword(String cnfpwd )
	{
		confirmPwd_txt.sendKeys(cnfpwd);
	}
	public void clickCheckBox()
	{
		click_checkbox.click();
	}
	public void clickSignupButton()
	{
		clickSignup_btn.click();
	}
	
	
	
}
