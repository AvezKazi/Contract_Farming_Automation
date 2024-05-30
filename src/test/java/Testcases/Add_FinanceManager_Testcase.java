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
import PO.Add_financeManager_PO;
import Utility.BrowserManager;

public class Add_FinanceManager_Testcase {

	WebDriver driver;
    JSONObject Finance_Manager;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_Finance_Manager.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Finance_Manager= new JSONObject(tokener);
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
    public void Add_Finance_Manager_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= Finance_Manager.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Finance_Manager.getJSONObject("Valid").getString("loginPassword");
      String Name= Finance_Manager.getJSONObject("Valid").getString("Name");
      String Mobile= Finance_Manager.getJSONObject("Valid").getString("Mobile");
      String Email = Finance_Manager.getJSONObject("Valid").getString("Email");
      String Address= Finance_Manager.getJSONObject("Valid").getString("Address");
      String Password= Finance_Manager.getJSONObject("Valid").getString("Password");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Finance_Manager_with_all_the_Valid_Data ");
      Add_financeManager_PO Obj = PageFactory.initElements(driver, Add_financeManager_PO.class);
  	  Obj.Add_FinanceManager(loginEmail, loginPassword, Name, Mobile, Email, Address, Password);
  	  
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

