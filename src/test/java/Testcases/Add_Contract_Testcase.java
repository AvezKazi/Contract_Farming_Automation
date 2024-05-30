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
import PO.Add_Contract_PO;
import Utility.BrowserManager;

public class Add_Contract_Testcase {

	WebDriver driver;
    JSONObject Add_Contract;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_Contract.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Add_Contract= new JSONObject(tokener);
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
    public void Add_Contract_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= Add_Contract.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Add_Contract.getJSONObject("Valid").getString("loginPassword");
      String Contract_Title= Add_Contract.getJSONObject("Valid").getString("Contract_Title");
      String Select_typeofFarmer= Add_Contract.getJSONObject("Valid").getString("Select_typeofFarmer");
      String Select_Farmer= Add_Contract.getJSONObject("Valid").getString("Select_Farmer");
      String Select_Buyer= Add_Contract.getJSONObject("Valid").getString("Select_Buyer");
      String Select_Land= Add_Contract.getJSONObject("Valid").getString("Select_Land");
      String Select_Crop= Add_Contract.getJSONObject("Valid").getString("Select_Crop");
      String Farm_Image= Add_Contract.getJSONObject("Valid").getString("Farm_Image");
      String Farm_Document= Add_Contract.getJSONObject("Valid").getString("Farm_Document");
      String Contract_StartDate= Add_Contract.getJSONObject("Valid").getString("Contract_StartDate");
      String Contract_EndDate= Add_Contract.getJSONObject("Valid").getString("Contract_EndDate");
      String Date_Of_Sowing= Add_Contract.getJSONObject("Valid").getString("Date_Of_Sowing");
      String Price_Per_Kg= Add_Contract.getJSONObject("Valid").getString("Price_Per_Kg");
      String Proposed_Yield= Add_Contract.getJSONObject("Valid").getString("Proposed_Yield");
      String Company_Clause= Add_Contract.getJSONObject("Valid").getString("Company_Clause");
      String Select_Resource_Type= Add_Contract.getJSONObject("Valid").getString("Select_Resource_Type");
      String Select_Resource_Name= Add_Contract.getJSONObject("Valid").getString("Select_Resource_Name");
      String Resource_Quantity = Add_Contract.getJSONObject("Valid").getString("Resource_Quantity");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Contract_with_all_the_Valid_Data ");
      Add_Contract_PO Obj = PageFactory.initElements(driver, Add_Contract_PO.class);
  	  Obj.Add_Contract_with_ValidData(loginEmail, loginPassword, Contract_Title, Select_typeofFarmer, Select_Farmer, Select_Buyer, Select_Land, Select_Crop, Farm_Image, Farm_Document, Contract_StartDate, Contract_EndDate, Date_Of_Sowing, Price_Per_Kg, Proposed_Yield, Company_Clause, Select_Resource_Type, Select_Resource_Name, Resource_Quantity);
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

