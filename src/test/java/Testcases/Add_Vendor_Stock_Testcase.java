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
import PO.Add_Vendor_Stock_PO;
import Utility.BrowserManager;

public class Add_Vendor_Stock_Testcase {

	WebDriver driver;
    JSONObject Vendor_Stock;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_VendorStock.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Vendor_Stock= new JSONObject(tokener);
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
    public void Add_VendorStock_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Vendor_Stock.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Vendor_Stock.getJSONObject("Valid").getString("loginPassword");
      String Select_Vendor= Vendor_Stock.getJSONObject("Valid").getString("Select_Vendor");
      String Select_Resource_Type= Vendor_Stock.getJSONObject("Valid").getString("Select_Resource_Type");
      String Resource = Vendor_Stock.getJSONObject("Valid").getString("Resource");
      String Quantity= Vendor_Stock.getJSONObject("Valid").getString("Quantity");
      String price= Vendor_Stock.getJSONObject("Valid").getString("price");
      ExtentReport.test=ExtentReport.extent.startTest("Add_VisitDetails_with_all_the_valid_data");
      Add_Vendor_Stock_PO Obj = PageFactory.initElements(driver, Add_Vendor_Stock_PO.class);
  	  Obj.Add_VendorStock_with_ValidData(loginEmail, loginPassword, Select_Vendor, Select_Resource_Type, Resource, Quantity, price);
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
