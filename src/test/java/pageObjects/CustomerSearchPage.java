package pageObjects;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerSearchPage {
	     WebDriver driver;
	
	public CustomerSearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Buyer search page objects
	@FindBy(xpath="//div[normalize-space()='Customers']")
	WebElement clk_Customers;
	
	@FindBy(xpath="//input[@placeholder='search']")
	WebElement txt_searchbox;
	
	@FindBy(xpath="(//table[@class='table'])[1]//tr[1]//td[2]")
	WebElement getName;
	

	@FindBy(xpath="(//table[@class='table'])[1]//tr[1]//td[3]")
	WebElement getCity;
	

	@FindBy(xpath="(//table[@class='table'])[1]//tr[1]//td[4]")
	WebElement getdesignation;

	@FindBy(xpath="(//table[@class='table'])[1]//tr[1]//td[5]")
	WebElement getEnterprisename;

//	@FindBy(xpath="(//table[@class='table'])[1]//tr[1]//td[6]")
//	WebElement getRelationshiPmanager;
	
	
	
	//Buyer search action methods
	public void ClickCustomers()
	{
		clk_Customers.click();
	}
	
	public void EnterTextinSearch(String text)
	{
		txt_searchbox.sendKeys(text);
	}
	
	public void GetName()
	{
		String text=getName.getText();
	    Assert.assertEquals(text, "Kvamc");
	}
	
	public void GetCity()
	{
		String text=getCity.getText();
	    Assert.assertEquals(text, "Chittoor");
	}
	
	public void GetDesignation()
	{
		  String text=getdesignation.getText();
		  Assert.assertEquals(text, "QualityAassuranceTest");
	}
	
	public void GetEnterpriseName()
	{
		  String text=getEnterprisename.getText();
		  Assert.assertEquals(text, "Testinggttest");
	}
	
	
	
//	public void GetRMname()
//	{
//		   String text=getRelationshiPmanager.getText();
//		  Assert.assertEquals(text, "TestAutomation");
//	}
	
	//Enterprise seller page objects
	
	@FindBy(id="controlled-tab-example-tab-enterpriseSellers")
	WebElement clk_EntpSellerTab;
	
	//xpath-for second Table -(//table[@class="table"])[2]//tr[1]//td[2]
	
	//Enterprise seller page objects 
	
	
	
	@FindBy(xpath="(//table[@class='table'])[2]//tr[1]//td[2]")
	WebElement getSellerName;
	

	@FindBy(xpath="(//table[@class='table'])[2]//tr[1]//td[3]")
	WebElement getSellerCity;
	

	@FindBy(xpath="(//table[@class='table'])[2]//tr[1]//td[4]")
	WebElement getSellerDesignation;

	@FindBy(xpath="(//table[@class='table'])[2]//tr[1]//td[5]")
	WebElement getSellerEntpname;
	
	//Enterprise seller actions methods
	
	
	public void clickEnterpriseTab()
	{
		 clk_EntpSellerTab.click();
	}
	
	
	public void GetsellerName()
	{
		String text=getSellerName.getText();
	    Assert.assertEquals(text, "Vamsitest");
	}
	
	public void GetsellerCity()
	{
		String text=getSellerCity.getText();
	    Assert.assertEquals(text, "Chittoor");
	}
	
	public void GetsellerDesignation()
	{
		  String text=getSellerDesignation.getText();
		  Assert.assertEquals(text, "TestQualityaSsurance");
	}
	
	public void GetsellerEnterpriseName()
	{
		  String text=getSellerEntpname.getText();
		  Assert.assertEquals(text, "TestDeeveloper");
	}
	
	
	
	
	
	
	

}
