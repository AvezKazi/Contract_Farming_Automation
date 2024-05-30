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
import PO.Update_Contract_PO;
import Utility.BrowserManager;

public class Update_Contract_Testcase {

	WebDriver driver;
    JSONObject Update_Contract;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Update_Contract.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Update_Contract= new JSONObject(tokener);
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
    public void Update_Contract_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= Update_Contract.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Update_Contract.getJSONObject("Valid").getString("loginPassword");
      String Contract_Title= Update_Contract.getJSONObject("Valid").getString("Contract_Title");
      String Select_typeofFarmer= Update_Contract.getJSONObject("Valid").getString("Select_typeofFarmer");
      String Select_Farmer= Update_Contract.getJSONObject("Valid").getString("Select_Farmer");
      String Select_Buyer= Update_Contract.getJSONObject("Valid").getString("Select_Buyer");
      String Select_Land= Update_Contract.getJSONObject("Valid").getString("Select_Land");
      String Select_Crop= Update_Contract.getJSONObject("Valid").getString("Select_Crop");
      String Farm_Image= Update_Contract.getJSONObject("Valid").getString("Farm_Image");
      String Farm_Document= Update_Contract.getJSONObject("Valid").getString("Farm_Document");
      String Contract_StartDate= Update_Contract.getJSONObject("Valid").getString("Contract_StartDate");
      String Contract_EndDate= Update_Contract.getJSONObject("Valid").getString("Contract_EndDate");
      String Date_Of_Sowing= Update_Contract.getJSONObject("Valid").getString("Date_Of_Sowing");
      String Price_Per_Kg= Update_Contract.getJSONObject("Valid").getString("Price_Per_Kg");
      String Proposed_Yield= Update_Contract.getJSONObject("Valid").getString("Proposed_Yield");
      String Company_Clause= Update_Contract.getJSONObject("Valid").getString("Company_Clause");
      String Select_Resource_Type= Update_Contract.getJSONObject("Valid").getString("Select_Resource_Type");
      String Select_Resource_Name= Update_Contract.getJSONObject("Valid").getString("Select_Resource_Name");
      String Resource_Quantity = Update_Contract.getJSONObject("Valid").getString("Resource_Quantity");
      ExtentReport.test=ExtentReport.extent.startTest("Update_Contract_with_all_the_Valid_Data ");
      Update_Contract_PO Obj = PageFactory.initElements(driver, Update_Contract_PO.class);
  	  Obj.Update_Contract_with_ValidData(loginEmail, loginPassword, Contract_Title, Select_typeofFarmer, Select_Farmer, Select_Buyer, Select_Land, Select_Crop, Farm_Image, Farm_Document, Contract_StartDate, Contract_EndDate, Date_Of_Sowing, Price_Per_Kg, Proposed_Yield, Company_Clause, Select_Resource_Type, Select_Resource_Name, Resource_Quantity);
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
