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
import PO.Add_Package_of_Practice_PO;
import Utility.BrowserManager;

public class Add_Package_of_Pratices_Testcase {
	WebDriver driver;
    JSONObject Add_POP;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_POP.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Add_POP= new JSONObject(tokener);
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
    public void Add_POP_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= Add_POP.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Add_POP.getJSONObject("Valid").getString("loginPassword");
      String Package_Name= Add_POP.getJSONObject("Valid").getString("Package_Name");
      String Description= Add_POP.getJSONObject("Valid").getString("Description");
      String Step_Name= Add_POP.getJSONObject("Valid").getString("Step_Name");
      String Duration= Add_POP.getJSONObject("Valid").getString("Duration");
      String Step_Description= Add_POP.getJSONObject("Valid").getString("Step_Description");
      ExtentReport.test=ExtentReport.extent.startTest("Add_POP_with_all_the_Valid_Data ");
      Add_Package_of_Practice_PO Obj = PageFactory.initElements(driver, Add_Package_of_Practice_PO.class);
  	  Obj.Add_POP_with_ValidData(loginEmail, loginPassword, Package_Name, Description, Step_Name, Duration, Step_Description);
  	  
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




