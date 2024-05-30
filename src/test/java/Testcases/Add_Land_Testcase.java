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
import PO.Add_Land_Details_PO;
import Utility.BrowserManager;

public class Add_Land_Testcase {

	WebDriver driver;
    JSONObject Land;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_land.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Land= new JSONObject(tokener);
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
    public void Add_FarmerLand_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= Land.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Land.getJSONObject("Valid").getString("loginPassword");
      String Farmer_Title= Land.getJSONObject("Valid").getString("Farmer_Title");
      String Farm_Image_1= Land.getJSONObject("Valid").getString("Farm_Image_1");
      String Farm_Image_2= Land.getJSONObject("Valid").getString("Farm_Image_2");
      String Upload_Document= Land.getJSONObject("Valid").getString("Upload_Document");
      String Soil_Survey_Report= Land.getJSONObject("Valid").getString("Soil_Survey_Report");
      String Select_Soil= Land.getJSONObject("Valid").getString("Select_Soil");
      String Total_Land= Land.getJSONObject("Valid").getString("Total_Land");
      String Select_Dimension_Type= Land.getJSONObject("Valid").getString("Select_Dimension_Type");
      String Gat_Number= Land.getJSONObject("Valid").getString("Gat_Number");
      String Land_under_Cultivation= Land.getJSONObject("Valid").getString("Land_under_Cultivation");
      String Select_Rainfall_Type= Land.getJSONObject("Valid").getString("Select_Rainfall_Type");
      String Latitude= Land.getJSONObject("Valid").getString("Latitude");
      String Longitude= Land.getJSONObject("Valid").getString("Longitude");
      String Climate_Conditions= Land.getJSONObject("Valid").getString("Climate_Conditions");
      String Address= Land.getJSONObject("Valid").getString("Address");
      String Select_Previous_Crop= Land.getJSONObject("Valid").getString("Select_Previous_Crop");
      String Description = Land.getJSONObject("Valid").getString("Description");
      String Select_Water_Source= Land.getJSONObject("Valid").getString("Select_Water_Source");
      String Select_Crop= Land.getJSONObject("Valid").getString("Select_Crop");
      String Total_land= Land.getJSONObject("Valid").getString("Total_land");
      String Verification_Status= Land.getJSONObject("Valid").getString("Verification_Status");
      ExtentReport.test=ExtentReport.extent.startTest("Add_FarmerLand_with_all_the_Valid_Data ");
      Add_Land_Details_PO Obj = PageFactory.initElements(driver, Add_Land_Details_PO.class);
  	  Obj.Add_FarmerLand_with_ValidData(loginEmail, loginPassword, Farmer_Title, Farm_Image_1, Farm_Image_2, Upload_Document, Soil_Survey_Report, Select_Soil, Total_Land, Select_Dimension_Type, Gat_Number, Land_under_Cultivation, Select_Rainfall_Type, Latitude, Longitude, Climate_Conditions, Address, Select_Previous_Crop, Description, Select_Water_Source, Select_Crop, Total_land, Verification_Status);
  	  
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

