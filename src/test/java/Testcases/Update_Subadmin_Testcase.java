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
import PO.Update_Subadmin_PO;
import Utility.BrowserManager;

public class Update_Subadmin_Testcase {
	WebDriver driver;
    JSONObject UpdateSubadmin;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/UpdateSubadmin.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		UpdateSubadmin= new JSONObject(tokener);
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
    public void Update_Subadmins_with_all_ValidData () throws Throwable {
  	  String loginEmail= UpdateSubadmin.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = UpdateSubadmin.getJSONObject("Valid").getString("loginPassword");
      String Name= UpdateSubadmin.getJSONObject("Valid").getString("Name");
      String Mobile= UpdateSubadmin.getJSONObject("Valid").getString("Mobile");
      String Email = UpdateSubadmin.getJSONObject("Valid").getString("Email");
      String Address= UpdateSubadmin.getJSONObject("Valid").getString("Address");
      ExtentReport.test=ExtentReport.extent.startTest("Update_Subadmins_with_all_ValidData");
      Update_Subadmin_PO Obj = PageFactory.initElements(driver, Update_Subadmin_PO.class);
  	  Obj.Update_Subadmins_with_ValidData(loginEmail, loginPassword, Name, Mobile, Email, Address);
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

