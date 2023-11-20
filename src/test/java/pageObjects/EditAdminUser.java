package pageObjects;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditAdminUser {
	WebDriver driver;
	
	public EditAdminUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//PageObjects
	@FindBy(xpath="//div[normalize-space()='Admin Team']")
	WebElement clk_AdminTeam;
	
     @FindBy(xpath="//tbody/tr[1]/td[8]/div[1]//*[name()='svg']")
     WebElement clk_edit;
     
     
     @FindBy(name="name")
	 WebElement txt_name;
	 
	 @FindBy(name="email")
	 WebElement txt_email;
	 
	 @FindBy(name="phoneNumber")
	 WebElement txt_phnumb;
	 
	 @FindBy(name="country")
	 WebElement drp_country;
	 
	 @FindBy(name="state")
	 WebElement drp_state;
	 
	 @FindBy(name="city")
	 WebElement drp_city;
	 
	 @FindBy(name="roles")
	 WebElement drp_roles;
	 
	 @FindBy(xpath="//span[normalize-space()='Save']")
	 WebElement clk_save;
	 
	 @FindBy(xpath="//table[@class='table']//tr[1]//td[2]")
	 WebElement ele_updatedname;
	 
     
     
     public void ClickAddMinteam()
     {
    	 clk_AdminTeam.click();
     }
     
     public void ClickEditbutton()
     {
    	 clk_edit.click();
     }
     
     
     public void EnterName(String name)
	 {
    	 txt_name.clear();
		 txt_name.sendKeys(name);
	 }
	 
	 public void EnterEmail(String email)
	 {
		 txt_email.clear();
		 txt_email.sendKeys(email);
	 }
	 
	 public void EnterMobilenum(String numb)
	 {
		 txt_phnumb.clear();
		 txt_phnumb.sendKeys(numb);
	 }
	 
	 
	 
	 public void selectCountry(String country)
	 {
		 Select dropdown = new Select(drp_country);
		  dropdown.selectByVisibleText(country);
	 }
	 
	 public void selectState(String state)
	 {
		 Select dropdown1=new Select(drp_state);
		 dropdown1.selectByVisibleText(state);
	 }
	 
	 public void selectCity(String city)
	 {
		 Select dropdown2= new Select(drp_city);
		 dropdown2.selectByVisibleText(city);
	 }
	 
	 
	 public void selectRoles(String roles)
	 {
		 Select dropdown3= new Select(drp_roles);
		 dropdown3.selectByVisibleText(roles);
	 }
	 
	 public void ClickSave()
	 {
		 clk_save.click();
	 }
	 
	 public void userUpdatedVerification() 
	 {
		 String updatedname=ele_updatedname.getText();
		 System.out.println(ele_updatedname);
		 Assert.assertEquals(updatedname, "TestAutomation");
	 }
     
    
	 
	
	
}
