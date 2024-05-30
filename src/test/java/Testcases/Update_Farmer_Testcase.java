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
import PO.Update_Farmer_PO;
import Utility.BrowserManager;

public class Update_Farmer_Testcase {

	WebDriver driver;
    JSONObject UpdateFarmer;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Update_Farmer.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		UpdateFarmer= new JSONObject(tokener);
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
    public void Update_Farmer_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= UpdateFarmer.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = UpdateFarmer.getJSONObject("Valid").getString("loginPassword");
      String Select_Type= UpdateFarmer.getJSONObject("Valid").getString("Select_Type");
      String Profile_Image= UpdateFarmer.getJSONObject("Valid").getString("Profile_Image");
      String Name= UpdateFarmer.getJSONObject("Valid").getString("Name");
      String Mobile= UpdateFarmer.getJSONObject("Valid").getString("Mobile");
      String Email= UpdateFarmer.getJSONObject("Valid").getString("Email");
      String Description= UpdateFarmer.getJSONObject("Valid").getString("Description");
      String PanCard= UpdateFarmer.getJSONObject("Valid").getString("PanCard");
      String PanCard_Image= UpdateFarmer.getJSONObject("Valid").getString("PanCard_Image");
      String Aadhar_Number= UpdateFarmer.getJSONObject("Valid").getString("Aadhar_Number");
      String Aadhar_Image= UpdateFarmer.getJSONObject("Valid").getString("MobAadhar_Imageile");
      String GST_NO= UpdateFarmer.getJSONObject("Valid").getString("GST_NO");
      String StreetName= UpdateFarmer.getJSONObject("Valid").getString("StreetName");
      String Pincode= UpdateFarmer.getJSONObject("Valid").getString("Pincode");
      String State= UpdateFarmer.getJSONObject("Valid").getString("State");
      String District= UpdateFarmer.getJSONObject("Valid").getString("District");
      String Block= UpdateFarmer.getJSONObject("Valid").getString("Block");
      String Village = UpdateFarmer.getJSONObject("Valid").getString("Village");
      String Address= UpdateFarmer.getJSONObject("Valid").getString("Address");
      String Password= UpdateFarmer.getJSONObject("Valid").getString("Password");
      String Status= UpdateFarmer.getJSONObject("Valid").getString("Status");
      ExtentReport.test=ExtentReport.extent.startTest("Update_Farmer_with_all_the_Valid_Data ");
      Update_Farmer_PO Obj = PageFactory.initElements(driver, Update_Farmer_PO.class);
  	  Obj.Update_Farmer_with_ValidData(loginEmail, loginPassword, Select_Type, Profile_Image, Name, Mobile, Email, Description, PanCard, PanCard_Image, Aadhar_Number, Aadhar_Image, GST_NO, StreetName, Pincode, State, District, Block, Village, Address, Password, Status);
  	  
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

