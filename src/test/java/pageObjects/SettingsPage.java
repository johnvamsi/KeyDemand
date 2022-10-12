package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SettingsPage {
	WebDriver driver;
	
	public SettingsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//pageobjects 
	
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	WebElement clk_settings;
	
	@FindBy(name="Company Name")
	WebElement txt_Compname;
	
	@FindBy(name="Contact us")
	WebElement txt_contactus;
	
	@FindBy(name="Email id")
	WebElement txt_emailid;
	
	@FindBy(name="Phone Number")
	WebElement txt_phnnumb;
	
	@FindBy(name="Description")
	WebElement txt_description;
	
	@FindBy(name="Whatsapp")
	WebElement txt_whatsapplink;
	
	@FindBy(name="Facebook")
	WebElement txt_FBapplink;
	
	@FindBy(name="Instagram")
	WebElement txt_Instaapplink;
	
	@FindBy(xpath="//span[normalize-space()='Save']")
	WebElement clk_savebtn;
	
	@FindBy(xpath="//div[@role='alert']//div[contains(text(),'Settings updated.')]")
	  WebElement ele_sucessmsg;
	
	
	//Actions methods
	
	
	public void clickSettings()
	{
		clk_settings.click();
	}
	
	public void setCompanyName(String cname)
	{
		txt_Compname.clear();
		txt_Compname.sendKeys(cname);
	}
	public void setContactus(String contactus)
	{
		txt_contactus.clear();
		txt_contactus.sendKeys(contactus);
	}
	
	public void setEmailid(String email)
	{
		txt_emailid.clear();
		txt_emailid.sendKeys(email);
	}
	
	public void setPhoneNumber(String phnnum)
	{
		txt_phnnumb.clear();
		txt_phnnumb.sendKeys(phnnum);
	}
	
	public void setDescription(String descrp)
	{
		txt_description.clear();
		txt_description.sendKeys(descrp);
	}
	
	public void setWhatsappURL(String wurl)
	{
		txt_whatsapplink.clear();
		txt_whatsapplink.sendKeys(wurl);
	}
    public void setFacebookURL(String fburl)
    {
    	txt_FBapplink.clear();
    	txt_FBapplink.sendKeys(fburl);
    }
    
    public void setInstangramURL(String instangramURL)
    {
    	txt_Instaapplink.clear();
    	txt_Instaapplink.sendKeys(instangramURL);
    }
    
    public void clickSavebutton()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", clk_savebtn);
    	
    }
    
    public void VerifySucessMessage()
    {
    	String text=ele_sucessmsg.getText();
    	System.out.println(text);
    	Assert.assertEquals(text, "Settings updated.");
    }
    
}
