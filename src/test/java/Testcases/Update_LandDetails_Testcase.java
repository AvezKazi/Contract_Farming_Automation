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
import PO.Update_LandDetails_PO;
import Utility.BrowserManager;

public class Update_LandDetails_Testcase {

	WebDriver driver;
    JSONObject UpdateLand;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Update_land.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		UpdateLand= new JSONObject(tokener);
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
    public void Update_FarmerLand_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= UpdateLand.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = UpdateLand.getJSONObject("Valid").getString("loginPassword");
      String Farmer_Title= UpdateLand.getJSONObject("Valid").getString("Farmer_Title");
      String Farm_Image_1= UpdateLand.getJSONObject("Valid").getString("Farm_Image_1");
      String Farm_Image_2= UpdateLand.getJSONObject("Valid").getString("Farm_Image_2");
      String Upload_Document= UpdateLand.getJSONObject("Valid").getString("Upload_Document");
      String Soil_Survey_Report= UpdateLand.getJSONObject("Valid").getString("Soil_Survey_Report");
      String Select_Soil= UpdateLand.getJSONObject("Valid").getString("Select_Soil");
      String Total_Land= UpdateLand.getJSONObject("Valid").getString("Total_Land");
      String Select_Dimension_Type= UpdateLand.getJSONObject("Valid").getString("Select_Dimension_Type");
      String Gat_Number= UpdateLand.getJSONObject("Valid").getString("Gat_Number");
      String Land_under_Cultivation= UpdateLand.getJSONObject("Valid").getString("Land_under_Cultivation");
      String Select_Rainfall_Type= UpdateLand.getJSONObject("Valid").getString("Select_Rainfall_Type");
      String Latitude= UpdateLand.getJSONObject("Valid").getString("Latitude");
      String Longitude= UpdateLand.getJSONObject("Valid").getString("Longitude");
      String Climate_Conditions= UpdateLand.getJSONObject("Valid").getString("Climate_Conditions");
      String Address= UpdateLand.getJSONObject("Valid").getString("Address");
      String Select_Previous_Crop= UpdateLand.getJSONObject("Valid").getString("Select_Previous_Crop");
      String Description = UpdateLand.getJSONObject("Valid").getString("Description");
      String Select_Water_Source= UpdateLand.getJSONObject("Valid").getString("Select_Water_Source");
      String Select_Crop= UpdateLand.getJSONObject("Valid").getString("Select_Crop");
      String Total_land= UpdateLand.getJSONObject("Valid").getString("Total_land");
      String Verification_Status= UpdateLand.getJSONObject("Valid").getString("Verification_Status");
      ExtentReport.test=ExtentReport.extent.startTest("Update_FarmerLand_with_all_the_Valid_Data ");
      Update_LandDetails_PO Obj = PageFactory.initElements(driver, Update_LandDetails_PO.class);
  	  Obj.Updates_FarmerLand_with_ValidData(loginEmail, loginPassword, Farmer_Title, Farm_Image_1, Farm_Image_2, Upload_Document, Soil_Survey_Report, Select_Soil, Total_Land, Select_Dimension_Type, Gat_Number, Land_under_Cultivation, Select_Rainfall_Type, Latitude, Longitude, Climate_Conditions, Address, Select_Previous_Crop, Description, Select_Water_Source, Select_Crop, Total_land, Verification_Status);
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


