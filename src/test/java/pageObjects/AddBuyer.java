package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddBuyer {
	
	WebDriver driver;
	 public AddBuyer(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 
	 //page objects 
	 
	 @FindBy(xpath="//div[normalize-space()='Customers']")
	 WebElement clk_Customerspage;
	 
	 @FindBy(xpath="//span[normalize-space()='Add Buyer']")
	 WebElement clk_AddBuyer;
	 
	 @FindBy(name="Contact Person*")
	 WebElement txt_ContactPerson;
	 
	 @FindBy(name="Company Name*")
	 WebElement txt_cmpName;
	 
	 @FindBy(name="Country*")
	 WebElement drp_country;
	 
	 @FindBy(name="State*")
	 WebElement drp_statet;
	 
	 @FindBy(name="Operating Cities*")
	 WebElement drp_oprtngCities;
	 
	 @FindBy(name="Email*")
	 WebElement txt_email;
	 
	 @FindBy(name="Designation*")
	 WebElement txt_designation;
	 
	 @FindBy(name="Phone Number*")
	 WebElement txt_phnNumb;
	 
	 @FindBy(name="Brand Name*")
	 WebElement txt_BrandName;
	 
	 @FindBy(name="About Brand*")
	 WebElement txt_aboutbrand;
	 
	 @FindBy(name="No. of Demands *")
	 WebElement txt_noofdemands;
	 
	 @FindBy(name="Validity Days *")
	 WebElement txt_validitydays;
	 
	 @FindBy(name="Contact Suppliers *")
	 WebElement txt_contactsuppliers;
	 
	 @FindBy(name="Email To Suppliers *")
	 WebElement drp_emailsuppliers;
	 
	 @FindBy(name="User Dashboard *")
	 WebElement txt_dashboard;
	 
	 @FindBy(name="Alerts *")
	 WebElement drp_alerts;
	 
	 @FindBy(name="Referal Credits *")
	 WebElement drp_ReferalCredits;
	 
	 @FindBy(name="Feature Positioning *")
	 WebElement drp_FeaturePositioning;
	 
	 
	 @FindBy(name="Assisted Uploading *")
	 WebElement drp_AssistedUploading;
	 
	 @FindBy(name="Homepage Slot and Banner *")
	 WebElement drp_HmpageSltandBanner;
	 
	 @FindBy(name="Relationship Manager *")
	 WebElement drp_relationshipmang;
	 
	 @FindBy(xpath="//span[normalize-space()='Create brand page']")
	 WebElement clk_createBP;
	 
	 @FindBy(xpath="(//table[@class='table'])[1]//tr[1]//td[2]")
	  public  WebElement ele_verifyname;
	 
	 //Action methods
	 public void clickCustomersTab()
	 {
		 clk_Customerspage.click();
	 }
	 
	 public void clickAddBuyer()
	 {
		 clk_AddBuyer.click();
	 }
	 
	 public void enterContacTpersonName(String name)
	 {
		 txt_ContactPerson.sendKeys(name);
	 }
	 
	 public void EnterCompanyName(String cmpname)
	 {
		 txt_cmpName.sendKeys(cmpname);
	 }
	 
	 public void selectCountryDrp(String value)
	 {
		 Select dropdown= new Select(drp_country);
		 dropdown.selectByVisibleText(value);
	 }
	 
	 public void selectStateDrp(String value1)
	 {
		 Select dropdown1= new Select(drp_statet);
		 dropdown1.selectByVisibleText(value1);
	 }
	 
	 public void selectOperatingCities(String value2)
	 {
		 Select dropdown2= new Select(drp_oprtngCities);
		 dropdown2.selectByVisibleText(value2);
	 }
	 
	 public void enterEmail(String email)
	 {
		 txt_email.sendKeys(email);
	 }
	 
	 public void enterDesignation(String designation)
	 {
		 txt_designation.sendKeys(designation);
	 }
	 
	 public void EnterPhoneNumber(String numb)
	 {
		 txt_phnNumb.sendKeys(numb);
	 }
	 
	 public void EnterBrandName(String brandname)
	 {
		 txt_BrandName.sendKeys(brandname);
	 }
	 
	 public void EnterAboutBrand(String Aboutbrand)
	 {
		 txt_aboutbrand.sendKeys(Aboutbrand);
	 }
	 
	 public void EnterNoOfDemands(String demands)
	 {
		 txt_noofdemands.sendKeys(demands);
	 }
	 
	 public void EnterValidityDays(String Days)
	 {
		 txt_validitydays.sendKeys(Days);
	 }
	 
	 public void EnterNoOfContactSuppliers(String suppliers)
	 {
		 txt_contactsuppliers.sendKeys(suppliers);
	 }
	 
	 public void SeleCTEmailToSuppliers(String emailsuppliers)
	 {
		 Select dropdown3= new Select(drp_emailsuppliers);
		 dropdown3.selectByVisibleText(emailsuppliers);
	 }
   
	 public void EnterUserDashborad(String dashBrd)
	 {
		 txt_dashboard.sendKeys(dashBrd);
	 }
	 
	 public void SeleCtAlerts(String value3)
	 {
		 Select dropdown4= new Select(drp_alerts);
		 dropdown4.selectByVisibleText(value3);
	 }
	 
	 public void SelectReferalCredits(String value4)
	 {
		 Select dropdown5= new Select(drp_ReferalCredits);
		 dropdown5.selectByVisibleText(value4);
	 }
	 
	 public void SelectFeaturePositioning(String value5)
	 {
		 Select dropdown6= new Select(drp_FeaturePositioning);
		 dropdown6.selectByVisibleText(value5);
	 }
	 
	 public void SeleCtAssistedUploading(String value6)
	 {
		 Select dropdown7= new Select(drp_AssistedUploading);
		 dropdown7.selectByVisibleText(value6);
		 
	 }
	 
	 public void SelectHomePageSlotBanner(String value7)
	 {
		 Select dropdown8= new Select(drp_HmpageSltandBanner);
		 dropdown8.selectByVisibleText(value7);
		 
	 }
	 
	 public void SeleCtRelationshipManager(String value8)
	 {
		 Select dropdown9= new Select(drp_relationshipmang);
		 dropdown9.selectByVisibleText(value8);
		 
	 }
	 
	 public void ClickBrandPage()
	 {
		 clk_createBP.click();
	 }

	 
	 
	 
	 
}
