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
import PO.Add_VisitDetails_PO;
import Utility.BrowserManager;

public class Add_visitDetails_Testcase {

	WebDriver driver;
    JSONObject Visit_Details;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_visitDetails.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Visit_Details= new JSONObject(tokener);
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
    public void Add_VisitDetails_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Visit_Details.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Visit_Details.getJSONObject("Valid").getString("loginPassword");
      String Visit_Date= Visit_Details.getJSONObject("Valid").getString("Visit_Date");
      String Harvest_Status= Visit_Details.getJSONObject("Valid").getString("Harvest_Status");
      String Remarks = Visit_Details.getJSONObject("Valid").getString("Remarks");
      String Expected_Yield= Visit_Details.getJSONObject("Valid").getString("Expected_Yield");
      String Image= Visit_Details.getJSONObject("Valid").getString("Image");
      String Image_2= Visit_Details.getJSONObject("Valid").getString("Image_2");
      String Select_Resource= Visit_Details.getJSONObject("Valid").getString("Select_Resource");
      String Resource_Name= Visit_Details.getJSONObject("Valid").getString("Resource_Name");
      String Quantity= Visit_Details.getJSONObject("Valid").getString("Quantity");
      ExtentReport.test=ExtentReport.extent.startTest("Add_VisitDetails_with_all_the_valid_data");
      Add_VisitDetails_PO Obj = PageFactory.initElements(driver, Add_VisitDetails_PO.class);
  	  Obj.Add_visitDetails_with_ValidData(loginEmail, loginPassword, Visit_Date, Harvest_Status, Remarks, Expected_Yield, Image, Image_2, Select_Resource, Resource_Name, Quantity);
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