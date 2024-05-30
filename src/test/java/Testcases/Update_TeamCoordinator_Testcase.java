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
import PO.Update_TeamCoordinator_PO;
import Utility.BrowserManager;

public class Update_TeamCoordinator_Testcase {
	WebDriver driver;
    JSONObject UpdateTeam_Coordinator;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Update_TeamCoordinator.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		UpdateTeam_Coordinator= new JSONObject(tokener);
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
    public void Update_TeamCoordiantor_with_all_the_Valid_Data () throws Throwable {
  	  String loginEmail= UpdateTeam_Coordinator.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = UpdateTeam_Coordinator.getJSONObject("Valid").getString("loginPassword");
      String Name= UpdateTeam_Coordinator.getJSONObject("Valid").getString("Name");
      String Mobile= UpdateTeam_Coordinator.getJSONObject("Valid").getString("Mobile");
      String Email = UpdateTeam_Coordinator.getJSONObject("Valid").getString("Email");
      String Address= UpdateTeam_Coordinator.getJSONObject("Valid").getString("Address");
      ExtentReport.test=ExtentReport.extent.startTest("Update_TeamCoordiantor_with_all_the_Valid_Data ");
      Update_TeamCoordinator_PO Obj = PageFactory.initElements(driver, Update_TeamCoordinator_PO.class);
  	  Obj.Update_TeamCoordinator(loginEmail, loginPassword, Name, Mobile, Email, Address);
  	  
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
