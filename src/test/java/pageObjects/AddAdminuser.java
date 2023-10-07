package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddAdminuser {
	
	 WebDriver driver;
	  public AddAdminuser(WebDriver driver) 
	 {
			this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//page objects
	 @FindBy(xpath="//div[normalize-space()='Admin Team']")
	 WebElement clk_AdminTeam;
	
	 
	 @FindBy(xpath="//span[normalize-space()='Add Admin']")
	 WebElement clk_Addadmin;
	 
	 @FindBy(name="name")
	 WebElement txt_name;
	 
	 @FindBy(name="email")
	 WebElement txt_email;
	 
	 @FindBy(name="phoneNumber")
	 WebElement txt_phnumb;
	 
	 @FindBy(name="password")
	 WebElement txt_pwd;
	 
	 
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
	 
	 @FindBy(xpath="(//div[@class='swal-text'])[1]")
	 WebElement sucess_msg;//Content Manager added successfully. //Relationship Manager added successfully.
	 
	 
	 
	 
	 
	 
	 public  void ClickAddTeam()
	 {
		 clk_AdminTeam.click();
	 }
	 
	 public void  ClickAddAdmin()
	 {
		 clk_Addadmin.click();	 
	 }
	 
	 public void EnterName(String name)
	 {
		 txt_name.sendKeys(name);
	 }
	 
	 public void EnterEmail(String email)
	 {
		 txt_email.sendKeys(email);
	 }
	 
	 public void EnterMobilenum(String numb)
	 {
		 txt_phnumb.sendKeys(numb);
	 }
	 
	 public void EnterPassword(String pwd)
	 {
		 txt_pwd.sendKeys(pwd);
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
	 
	 public void userCreatedVerification() 
	 {
		 String updatedname=ele_updatedname.getText();
		 System.out.println(ele_updatedname);
		 Assert.assertEquals(updatedname, "FrontendTeam");
	 }
	 public String getSuccessMessage()
	{
	    String msg=sucess_msg.getText();
	     return msg;
	}
	 
	 
	 
	
	

}
