package Testcases;

import java.io.InputStream;
import java.time.Duration;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ExtentReport.ExtentReport;
import PO.Customer_Support_PO;
import Utility.BrowserManager;

public class Customer_Support_Testcase {

	WebDriver driver;
    JSONObject Update_Status;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Customer_Support.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Update_Status= new JSONObject(tokener);
  	  }
  	  catch (Exception e) {
  		  e.printStackTrace();
  		  throw e;
  	  } finally {
  		  if (data!= null) {
  			  data.close();
  		  }
  	  }
    }
    @BeforeMethod
    @Parameters({"Browser","Url"})
    public void setup (String Browser, String Url) throws Throwable
    {
  	driver = BrowserManager.getDriver(Browser);
  	Thread.sleep(2000);
  	driver.get(Url);
  	Thread.sleep(2000);
  	driver.manage().window().maximize();
  	Thread.sleep(2000);
  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void update_Customer_Support_with_ValidData () throws Throwable {
  	  String loginEmail= Update_Status.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Update_Status.getJSONObject("Valid").getString("loginPassword");
      String Staff_Remark= Update_Status.getJSONObject("Valid").getString("Staff_Remark");
      String Status= Update_Status.getJSONObject("Valid").getString("Status");
      ExtentReport.test=ExtentReport.extent.startTest("update_Customer_Support_with_ValidData");
      Customer_Support_PO Obj = PageFactory.initElements(driver, Customer_Support_PO.class);
  	  Obj.update_Customer_Support_with_ValidData(loginEmail, loginPassword, Staff_Remark, Status);
    }
    @AfterClass 
   	public void endReport()
   	{ExtentReport.extent.flush();
       } @AfterMethod
   	public void teardown()
       {
   	ExtentReport.extent.endTest(ExtentReport.test);
   	driver.quit();
   	}  
   	}

