package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void TestMethod()
  {
	  System.out.println("This is test Method");
  }
  @Test
  public void TestMethod1()
  {
	  System.out.println("This testMethod");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("This is test beforeMethod");
  }
  

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("This is test afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is test beforeClass");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("This is test afterClass");
  }

  @BeforeTest
  public void beforeTest()
{
	  System.out.println("This is beforeTest method will execute before all the classes");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("This is After test method will execute After all the classes");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("This is test beforeSuite");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("This is afterSuite");
  }

}
