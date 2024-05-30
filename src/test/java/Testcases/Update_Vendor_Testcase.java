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
import PO.Update_Vendor_PO;
import Utility.BrowserManager;

public class Update_Vendor_Testcase {
	WebDriver driver;
    JSONObject UpdateVendor;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Update_Vendor.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		UpdateVendor= new JSONObject(tokener);
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
    public void Update_Vendor_With_all_ValidData () throws Throwable {
  	  String loginEmail= UpdateVendor.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = UpdateVendor.getJSONObject("Valid").getString("loginPassword");
      String Name= UpdateVendor.getJSONObject("Valid").getString("Name");
      String Mobile= UpdateVendor.getJSONObject("Valid").getString("Mobile");
      String Email = UpdateVendor.getJSONObject("Valid").getString("Email");
      String Address= UpdateVendor.getJSONObject("Valid").getString("Address");
      String GST_Number= UpdateVendor.getJSONObject("Valid").getString("GST_Number");
      String Pan_Number= UpdateVendor.getJSONObject("Valid").getString("Pan_Number");
      String Pan_Image= UpdateVendor.getJSONObject("Valid").getString("Pan_Image");
      String Aadhar_Number= UpdateVendor.getJSONObject("Valid").getString("Aadhar_Number");
      String Aadhar_Image= UpdateVendor.getJSONObject("Valid").getString("Aadhar_Image");
      ExtentReport.test=ExtentReport.extent.startTest("Update_Vendor_With_all_ValidData");
      Update_Vendor_PO Obj = PageFactory.initElements(driver, Update_Vendor_PO.class);
  	  Obj.Update_Vendors_with_validData(loginEmail, loginPassword, Name, Mobile, Email, Address, GST_Number, Pan_Number, Pan_Image, Aadhar_Number, Aadhar_Image);
  	  
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


