package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AdminTeamSearchBox {
	
WebDriver driver;
	
	public AdminTeamSearchBox(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[normalize-space()='Admin Team']")
	WebElement clk_AdminTeam;
	
	@FindBy(xpath="//input[@placeholder='search']")
	WebElement txt_searchbox;
	
	@FindBy(xpath="//table[@class=\"table\"]//tr[1]//td[2]")//(//table[@class="table"])[1]//tr[1]//td[2]
	WebElement ele_Name;
	
	@FindBy(xpath="//table[@class=\"table\"]//tr[1]//td[5]")
	WebElement ele_Mobnum;
	
	
	
	
	 public void ClickAddMinteam()
     {
    	 clk_AdminTeam.click();
     }
	
//	 public void EnterSearchvalue(String value)
//	 {
//		 txt_searchbox.sendKeys(value);
//	 }
	 
	 public  void verifyNameSearchResult()
	 {
		String name= ele_Name.getText();
		Assert.assertEquals(name, "TestAutomation");
		 
	 }
	 
	 public void VerifyMobNumSearchResult()
	 {
		String num= ele_Mobnum.getText();
		Assert.assertEquals(num, "8074835943");
		 
	 }

	public void EnterSearchvalue(String value) {
		 txt_searchbox.sendKeys(value);
		
	}

}
