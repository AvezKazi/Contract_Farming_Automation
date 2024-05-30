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
import PO.Add_Farmer_BankDetails_PO;
import Utility.BrowserManager;

public class Add_Farmer_BankDetails_Testcase {

	WebDriver driver;
    JSONObject Bank_Details;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Farmer_BankDetails.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Bank_Details= new JSONObject(tokener);
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
    public void Add_Farmer_BankDetails_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Bank_Details.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Bank_Details.getJSONObject("Valid").getString("loginPassword");
      String Account_Holder_Name= Bank_Details.getJSONObject("Valid").getString("Account_Holder_Name");
      String Account_Number= Bank_Details.getJSONObject("Valid").getString("Account_Number");
      String Re_Enter_AccountNUmber = Bank_Details.getJSONObject("Valid").getString("Re_Enter_AccountNUmber");
      String Bank_Name= Bank_Details.getJSONObject("Valid").getString("Bank_Name");
      String Bank_Branch= Bank_Details.getJSONObject("Valid").getString("Bank_Branch");
      String Branch_Address= Bank_Details.getJSONObject("Valid").getString("Branch_Address");
      String IFSC_Code= Bank_Details.getJSONObject("Valid").getString("IFSC_Code");
      String Cheque_Image= Bank_Details.getJSONObject("Valid").getString("Cheque_Image");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Farmer_BankDetails_with_all_the_valid_data");
      Add_Farmer_BankDetails_PO Obj = PageFactory.initElements(driver, Add_Farmer_BankDetails_PO.class);
  	  Obj.Add_Farmers_BankDetails_with_ValidData(loginEmail, loginPassword, Account_Holder_Name, Account_Number, Re_Enter_AccountNUmber, Bank_Name, Bank_Branch, Branch_Address, IFSC_Code, Cheque_Image);
  	  
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
