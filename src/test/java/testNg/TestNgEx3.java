package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgEx3 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("Integer : "+n+" String : "+s);
	 
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      { 1, "a" },
     { 2, "b" },
     {3,"C"}
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Class 3 class start");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Class 3 class end");
  }

  @BeforeTest
  public void beforeTest() {
	
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
