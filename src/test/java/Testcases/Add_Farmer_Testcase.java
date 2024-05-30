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
import PO.Add_Farmer_PO;
import Utility.BrowserManager;

public class Add_Farmer_Testcase {

	WebDriver driver;
    JSONObject Farmer;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_Farmer.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Farmer= new JSONObject(tokener);
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
    public void Add_Farmer_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= Farmer.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Farmer.getJSONObject("Valid").getString("loginPassword");
      String Select_Type= Farmer.getJSONObject("Valid").getString("Select_Type");
      String Profile_Image= Farmer.getJSONObject("Valid").getString("Profile_Image");
      String Name= Farmer.getJSONObject("Valid").getString("Name");
      String Mobile= Farmer.getJSONObject("Valid").getString("Mobile");
      String Email= Farmer.getJSONObject("Valid").getString("Email");
      String Description= Farmer.getJSONObject("Valid").getString("Description");
      String PanCard= Farmer.getJSONObject("Valid").getString("PanCard");
      String PanCard_Image= Farmer.getJSONObject("Valid").getString("PanCard_Image");
      String Aadhar_Number= Farmer.getJSONObject("Valid").getString("Aadhar_Number");
      String Aadhar_Image= Farmer.getJSONObject("Valid").getString("MobAadhar_Imageile");
      String GST_NO= Farmer.getJSONObject("Valid").getString("GST_NO");
      String StreetName= Farmer.getJSONObject("Valid").getString("StreetName");
      String Pincode= Farmer.getJSONObject("Valid").getString("Pincode");
      String State= Farmer.getJSONObject("Valid").getString("State");
      String District= Farmer.getJSONObject("Valid").getString("District");
      String Block= Farmer.getJSONObject("Valid").getString("Block");
      String Village = Farmer.getJSONObject("Valid").getString("Village");
      String Address= Farmer.getJSONObject("Valid").getString("Address");
      String Password= Farmer.getJSONObject("Valid").getString("Password");
      String Status= Farmer.getJSONObject("Valid").getString("Status");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Farmer_with_all_the_Valid_Data ");
      Add_Farmer_PO Obj = PageFactory.initElements(driver, Add_Farmer_PO.class);
  	  Obj.Add_Farmer_with_ValidData(loginEmail, loginPassword, Select_Type, Profile_Image, Name, Mobile, Email, Description, PanCard, PanCard_Image, Aadhar_Number, Aadhar_Image, GST_NO, StreetName, Pincode, State, District, Block, Village, Address, Password, Status);
  	  
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


