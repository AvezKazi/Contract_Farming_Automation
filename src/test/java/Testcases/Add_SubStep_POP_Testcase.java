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
import PO.Add_SubSteps_POP_PO;
import Utility.BrowserManager;

public class Add_SubStep_POP_Testcase {

	WebDriver driver;
    JSONObject Add_SubSteps;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_SubSteps.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Add_SubSteps= new JSONObject(tokener);
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
    public void Add_SubStep_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= Add_SubSteps.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Add_SubSteps.getJSONObject("Valid").getString("loginPassword");
      String Name= Add_SubSteps.getJSONObject("Valid").getString("Name");
      String Details= Add_SubSteps.getJSONObject("Valid").getString("Details");
      String Sequence= Add_SubSteps.getJSONObject("Valid").getString("Sequence");
      ExtentReport.test=ExtentReport.extent.startTest("Add_SubStep_with_all_the_Valid_Data ");
      Add_SubSteps_POP_PO Obj = PageFactory.initElements(driver, Add_SubSteps_POP_PO.class);
  	  Obj.Add_SubStep_with_ValidData(loginEmail, loginPassword, Name, Details, Sequence);
  	  
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
