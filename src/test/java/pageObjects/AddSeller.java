package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddSeller {
	
	WebDriver driver;
	 public AddSeller(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
		 
	 }
	 
	 //page objects 
	 
	 @FindBy(xpath="//div[normalize-space()='Customers']")
	 WebElement clk_Customerspage;
	 
	 @FindBy(id="controlled-tab-example-tab-enterpriseSellers")
	 WebElement clk_sellerTab;
	 
	 @FindBy(xpath="//span[normalize-space()='Add Seller']")
	 WebElement clk_Addseller;
	 
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
	 
	 @FindBy(name="Developer Name*")
	 WebElement txt_devname;
	 
	 @FindBy(name="Stats*")
	 WebElement txt_stats;
	 
	 @FindBy(name="About Developer*")
	 WebElement txt_abtdeveloper;
	 
	 @FindBy(name="Property Uploads *")
	 WebElement txt_noofproperties;
	 
	 @FindBy(name="Validity Days *")
	 WebElement txt_validitydays;
	 
	 
	 
	 @FindBy(name="User Dashboard *")
	 WebElement txt_dashboard;
	 
	@FindBy(name="Demand Mails *")
	WebElement drp_demandmails;
	 
	 @FindBy(name="Referal Credits *")
	 WebElement drp_ReferalCredits;
	 
	 @FindBy(name="Feature Positioning *")
	 WebElement drp_FeaturePositioning;
	 
	 
	 @FindBy(name="Assisted Uploading *")
	 WebElement drp_AssistedUploading;
	 
	 @FindBy(name="Submission Against Demand *")
	 WebElement txt_subAgainstDemand;
	 
	 @FindBy(name="Relationship Manager *")
	 WebElement drp_relationshipmang;
	 
	 @FindBy(xpath="//span[normalize-space()='Create Developer Page']")
	 WebElement clk_createSP;
	 
	 @FindBy(xpath="(//table[@class='table'])[2]//tr[1]//td[2]")
	  public  WebElement ele_verifyname;
	 
	 
	
	 
	 public void clickCustomersTab()
	 {
		 clk_Customerspage.click();
	 }
	 
	 public void ClickSellersTab()
	 {
		 clk_sellerTab.click();
	 }
	 
	 public void clickaddseller()
	 {
		 clk_Addseller.click();
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
	 
	 public void EnterDeveloperName(String developername)
	 {
		 txt_devname.sendKeys(developername);
	 }
	 
	 public void EnterStats(String stats)
	 {
		 txt_stats.sendKeys(stats);
	 }
	 

	 
	 public void EnterAboutDevelopers(String Aboutdeveloper)
	 {
		 txt_abtdeveloper.sendKeys(Aboutdeveloper);
	 }
	 
	 public void EnterNoofPropertyUploads(String properties)
	 {
		 txt_noofproperties.sendKeys(properties);
	 }
	 
	 public void EnterValidityDays(String Days)
	 {
		 txt_validitydays.sendKeys(Days);
	 }
	 
	
	 public void EnterUserDashborad(String dashBrd)
	 {
		 txt_dashboard.sendKeys(dashBrd);
	 }
	 
	 public void SelectDemandMails(String mails)
	 {
		 Select dropdown= new Select(drp_demandmails);
		 dropdown.selectByVisibleText(mails);
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
	 
	 public void EnterSubmissionagainstDemanD(String value)
	 {
		 txt_subAgainstDemand.sendKeys(value);
	 }
	 
	 public void SeleCtRelationshipManager(String value8)
	 {
		 Select dropdown9= new Select(drp_relationshipmang);
		 dropdown9.selectByVisibleText(value8);
		 
	 }
	 
	 public void ClickSellerPage()
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", clk_createSP);
		 
		
	 }

}
