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
import PO.PO_Location;
import Utility.BrowserManager;

public class Location_Testcase {
	WebDriver driver;
    JSONObject Add_State;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_State.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Add_State= new JSONObject(tokener);
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
    public void Add_State () throws Throwable {
  	  String Email= Add_State.getJSONObject("Valid").getString("Email");
	  String Password = Add_State.getJSONObject("Valid").getString("Password");
      String State_Name= Add_State.getJSONObject("Valid").getString("State_Name");
      String State_Code= Add_State.getJSONObject("Valid").getString("State_Code");
      String Select_State = Add_State.getJSONObject("Valid").getString("Select_State");
      String District_Name= Add_State.getJSONObject("Valid").getString("District_Name");
      String District_Code= Add_State.getJSONObject("Valid").getString("District_Code");
      String Select_district = Add_State.getJSONObject("Valid").getString("Select_district");
      String Taluka_Name= Add_State.getJSONObject("Valid").getString("Taluka_Name");
      String Taluka_Code= Add_State.getJSONObject("Valid").getString("Taluka_Code");
      String Select_Block = Add_State.getJSONObject("Valid").getString("Select_Block");
      String Village_Name= Add_State.getJSONObject("Valid").getString("Village_Name");
      String Village_Code= Add_State.getJSONObject("Valid").getString("Village_Code");
      ExtentReport.test=ExtentReport.extent.startTest("Add_State");
      PO_Location Obj = PageFactory.initElements(driver, PO_Location.class);
  	Obj.Add_State(Email, Password, State_Name, State_Code, Select_State, District_Name, District_Code, Select_district, Taluka_Name, Taluka_Code, Select_Block, Village_Name, Village_Code);
  	  
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
    


