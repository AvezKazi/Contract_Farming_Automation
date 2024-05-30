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
import PO.Update_Inventory_PO;
import Utility.BrowserManager;

public class Update_Inventory_Testcase {

	WebDriver driver;
    JSONObject Update_Inventory;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Update_InventoryStock.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Update_Inventory= new JSONObject(tokener);
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
    public void Update_VendorStock_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Update_Inventory.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Update_Inventory.getJSONObject("Valid").getString("loginPassword");
      String Quantity= Update_Inventory.getJSONObject("Valid").getString("Quantity");
      ExtentReport.test=ExtentReport.extent.startTest("Update_VendorStock_with_all_the_valid_data");
      Update_Inventory_PO Obj = PageFactory.initElements(driver, Update_Inventory_PO.class);
  	  Obj.Update_VendorStock_with_ValidData(loginEmail, loginPassword, Quantity);
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
