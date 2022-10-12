package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterpriseEnquiriesPage {
	
	
	WebDriver driver;
	public EnterpriseEnquiriesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//page objects 
	
	@FindBy(linkText="Enterprise Solutions")
	WebElement clk_EntSolns;
	
	@FindBy(name="name")
	WebElement Enter_Name;
	
	@FindBy(name="companyName")
	WebElement Enter_CompName;
	
	@FindBy(name="designation")
	WebElement Enter_designation;
	
	@FindBy(name="wantTo")
	WebElement drp_wantTo;
	
	@FindBy(name="country")
	WebElement drp_country;
	
	@FindBy(name="state")
	WebElement drp_state;
	
	@FindBy(name="city")
	WebElement drp_city;
	
	@FindBy(name="email")
	WebElement Enter_email;
	
	@FindBy(name="phoneNumber")
	WebElement Enter_mobnum;
	
	@FindBy(name="modeOfContact")
	WebElement drp_modeOfContact;
	
	@FindBy(xpath="//span[normalize-space()='Submit']")
	WebElement Clk_submit;
	
	
	//Actions methods 
	
	public void ClickEnterpriseSolutions()
	{
		clk_EntSolns.click();
	}
	
	public void setUsername(String name)
	{
		Enter_Name.sendKeys(name);
	}
	
	
	public void setCompanyName(String Cmpname)
	{
		Enter_CompName.sendKeys(Cmpname);
	}
	
	public void setDesignation(String dest)
	{
		Enter_designation.sendKeys(dest);
	}
	
	public void selectWantoDropdown(String value1)
	{
		Select drp= new Select (drp_wantTo);
		drp.selectByVisibleText(value1);
	}
	
	public void selectCountryDropdown(String value2)
	{
		Select drp= new Select (drp_country);
		drp.selectByVisibleText(value2);
	}
	
	public void selectStateDropdown(String value3)
	{
		Select drp= new Select (drp_state);
		drp.selectByVisibleText(value3);
	}
	
	public void selectCityDropdown(String value4)
	{
		Select drp= new Select (drp_city);
		drp.selectByVisibleText(value4);
	}
	
	public void setEmail(String email)
	{
		Enter_email.sendKeys(email);
	}
	
	public void setMobileNumber(String num)
	{
		Enter_mobnum.sendKeys(num);
	}
	
	
	public void selectMOCDropdown(String value5)
	{
		Select drp= new Select (drp_modeOfContact);
		drp.selectByVisibleText(value5);
	}
	
	
	public void ClickSubmit()
	{
		Clk_submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
