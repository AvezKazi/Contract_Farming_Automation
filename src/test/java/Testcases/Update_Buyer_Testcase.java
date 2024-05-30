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
import PO.Update_Buyer_PO;
import Utility.BrowserManager;

public class Update_Buyer_Testcase {
	WebDriver driver;
    JSONObject UpdateBuyer;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Update_Buyer.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		UpdateBuyer= new JSONObject(tokener);
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
    public void Update_Buyer_with_All_validData () throws Throwable {
  	  String loginEmail= UpdateBuyer.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = UpdateBuyer.getJSONObject("Valid").getString("loginPassword");
      String Name= UpdateBuyer.getJSONObject("Valid").getString("Name");
      String Mobile= UpdateBuyer.getJSONObject("Valid").getString("Mobile");
      String Email = UpdateBuyer.getJSONObject("Valid").getString("Email");
      String Address= UpdateBuyer.getJSONObject("Valid").getString("Address");
      String GST_Number= UpdateBuyer.getJSONObject("Valid").getString("GST_Number");
      ExtentReport.test=ExtentReport.extent.startTest("Update_Buyer_with_All_validData");
      Update_Buyer_PO Obj = PageFactory.initElements(driver, Update_Buyer_PO.class);
  	  Obj.Update_Buyer(loginEmail, loginPassword, Name, Mobile, Email, Address, GST_Number);
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


