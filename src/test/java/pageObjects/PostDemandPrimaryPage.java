package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PostDemandPrimaryPage {
	WebDriver driver;
	public PostDemandPrimaryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	//page objects 
	@FindBy(xpath="//div[normalize-space()='Customers']")
	WebElement clk_Customers;
	
	@FindBy(xpath="//input[@placeholder='search']")
	WebElement txt_searchbox;
	
	@FindBy(xpath="//div[@class='d-flex justify-content-center align-items-center ']//div[1]//*[name()='svg']")
	WebElement click_eyeicon;
	
	@FindBy(xpath="(//span[normalize-space()='Add Demand'])[1]")
	WebElement click_adddemand;
	
	@FindBy(id="formBasicEmail")
	WebElement drp_propertyType;
	
	@FindBy(name="Location")
	WebElement txt_entercity;
	
	@FindBy(name="microLocation")
	WebElement txt_entermicrolocation;
	
	@FindBy(id="inline-checkbox-1")
	WebElement chbox_rent;
	
	@FindBy(id="undefinedinput")
	WebElement txt_minvalue;
	
	@FindBy(id="Rent Max psfinput")
	WebElement txt_maxvalue;
	
	@FindBy(name="Carpet Min Area")
	WebElement txt_crapetmin;
	
	@FindBy(name="Carpet Max Area")
	WebElement txt_crapetmax; 
	
	@FindBy(xpath="//div[@class=' css-axzveb-control']") 
	WebElement drp_otherlocations;
	@FindBy(xpath="(//div[@class='multi-select-list ml-2 my-1'])[1]")
	WebElement select_guindy;
	@FindBy(xpath="//div[normalize-space()='besant nagar']")
	WebElement select_besantnagar;
	@FindBy(xpath="//div[normalize-space()='adayar']")
	WebElement select_adyar;
	
	@FindBy(id="formBasicEmail")
	WebElement drp_Enduse;
	
	@FindBy(xpath="(//select[@aria-label='Default select example'])[3]")
	WebElement drp_posession;
	
	@FindBy(xpath="(//input[contains(@name,'group1')])[10]")
	WebElement chbox_preferedFloor;
	@FindBy(xpath="(//select[@aria-label='Default select example'])[4]")
	WebElement drp_preferedFloor;
	
	@FindBy(xpath="(//input[contains(@name,'group1')])[11]")
	WebElement chbox_ocrequired;
	@FindBy(xpath="(//select[@aria-label='Default select example'])[5]")
	WebElement drp_oc;
	
	@FindBy(xpath="(//input[@id='check'])[1]")
	WebElement chbox_googlelocation;
	
	@FindBy(xpath="(//input[@id='check-api-checkbox'])[1]")
	WebElement chbox_propertimagesrequired;
	
	@FindBy(xpath="(//input[@class='form-check-input'])[14]")
	WebElement chbox_propertyvideorequired;
	
	@FindBy(xpath="(//input[@class='form-check-input'])[15]")
	WebElement chbox_aboutproperty;
	
	@FindBy(xpath="//textarea[@placeholder='Enter about your property']")
	WebElement txt_abtProperty;
	
	@FindBy(xpath="(//button[@class='btn f-14 fw-700 submit-btn'])[1]")
	WebElement clik_nextbtn;
	
	//Action methods
	
	public void ClickCustomers()
	{
		clk_Customers.click();
	}
	public void EnterTextinSearch(String text)
	{
		txt_searchbox.sendKeys(text);
	}
	
	public void ClickEyeicon()
	{
		click_eyeicon.click();
	}
	
	public void clickAddDemand()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", click_adddemand);
		
	}
	
	public void selectPropertyDropdown(String text)
	{
		Select dropdown= new Select(drp_propertyType);
		dropdown.selectByVisibleText(text);
	}
	public void enterCity(String city)
	{
		txt_entercity.sendKeys(city);
	}
	
	public void enterLocation(String location)
	{
		txt_entermicrolocation.sendKeys(location);
	}
	
	public void CheckBoxRent()
	{
		// chbox_rent.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chbox_rent);
	}
	
	public void enterRentMaxandMin(String min,String max)
	{
		txt_minvalue.sendKeys(min);
		txt_maxvalue.sendKeys(max);
	}
	public void eneterCarpetareaMinandMax(String min,String max)
	{
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", txt_crapetmin);
//		js.executeScript("arguments[0].click();", txt_crapetmax);
		txt_crapetmin.sendKeys(min);
		txt_crapetmax.sendKeys(max);
		
		
	}
	
	public void selectOtherLocationsdropdown(String locations)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", drp_otherlocations);
		
		
		if(locations.equals("guindy"))
		{
			js.executeScript("arguments[0].click();", select_guindy);
			//select_guindy.click();
		}
		else if(locations.equals("besant nagar"))
		{
			js.executeScript("arguments[0].click();", select_besantnagar);
			//select_besantnagar.click();
		}
		else
		{
			js.executeScript("arguments[0].click();", select_adyar);
			
			//select_adyar.click();
		}
			
		
	}
	
	public void selectDropdownEnduse(String text)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", drp_Enduse);
		//drp_Enduse.click();
		Select dropdown=new Select(drp_Enduse);
		dropdown.selectByValue(text);
	}
	public void selectPossesiondropdown(String posession)
	{
		Select dropdown1= new Select(drp_posession);
		dropdown1.selectByVisibleText(posession);
	}
	
	public void setPreferedFloor(String oc)
	{
		chbox_preferedFloor.click();
		Select dropdown2 = new Select(drp_preferedFloor);
		dropdown2.selectByVisibleText(oc);
	}
	public void selectOCrequireddropdown(String text)
	{
		chbox_ocrequired.click();
		Select dropdown3=new Select(drp_oc);
		dropdown3.selectByVisibleText(text);
	}
	public void ClickGooglelocation()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chbox_googlelocation);
		//chbox_googlelocation.click();
	}
	
	public void clickPropertyImgReq()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chbox_propertimagesrequired);
		
		//chbox_propertimagesrequired.click();
	}
	public void clickProertyVideoReq()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chbox_propertyvideorequired);
		//chbox_propertyvideorequired.click();
	}
	
	public void setAboutProperty(String about)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", chbox_aboutproperty);
		//chbox_aboutproperty.click();
		txt_abtProperty.sendKeys(about);
	}
	
	public void ClickNextBtn()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clik_nextbtn);
		//clik_nextbtn.click();
	}


	
}
