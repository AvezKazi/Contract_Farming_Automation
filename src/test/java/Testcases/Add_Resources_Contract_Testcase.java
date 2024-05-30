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
import PO.Add_Resources_Contract_PO;
import Utility.BrowserManager;

public class Add_Resources_Contract_Testcase {

	WebDriver driver;
    JSONObject Add_Resources;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_Resources.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Add_Resources= new JSONObject(tokener);
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
    public void Add_Resources_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Add_Resources.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Add_Resources.getJSONObject("Valid").getString("loginPassword");
      String Select_Resource_Type= Add_Resources.getJSONObject("Valid").getString("Select_Resource_Type");
      String Resource_Name= Add_Resources.getJSONObject("Valid").getString("Resource_Name");
      String Quantity = Add_Resources.getJSONObject("Valid").getString("Quantity");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Resources_with_all_the_valid_data");
      Add_Resources_Contract_PO Obj = PageFactory.initElements(driver, Add_Resources_Contract_PO.class);
  	  Obj.Add_Resources_with_ValidData(loginEmail, loginPassword, Select_Resource_Type, Resource_Name, Quantity);
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
