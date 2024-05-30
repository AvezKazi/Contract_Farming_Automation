package Testcases;

import java.io.InputStream;

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
import PO.Allocate_Subadmin_to_TeamCoordinator_PO;
import Utility.BrowserManager;

public class Allocate_Subadmin_to_TeamCoordinator_Testcase {

	WebDriver driver;
    JSONObject Subadmin_Allocate;
    @BeforeClass
	public void beforeclass()throws Exception  
	{
	  ExtentReport.startreport();
		InputStream Datais = null;
		try
		{
			String DataFileName = "data/Allocate_Subadmin.json"; 
			Datais = getClass().getClassLoader().getResourceAsStream(DataFileName);
			JSONTokener tokener = new JSONTokener(Datais);
			Subadmin_Allocate = new JSONObject(tokener); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally
		{ 
			
			if(Datais != null)
			{
				Datais.close();
			}
		}
		}
	
	@BeforeMethod
	@Parameters({"Browser","Url"})
    public void setup(String Browser, String Url) throws Throwable
    {
  	driver = BrowserManager.getDriver(Browser);
  	Thread.sleep(2000);
  	driver.get(Url);
  	Thread.sleep(2000);
  	driver.manage().window().maximize();	
    }
	@Test
    public void Allocate_Subadmin_With_all_Valid_Data () throws Throwable {
  	  String loginEmail= Subadmin_Allocate.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Subadmin_Allocate.getJSONObject("Valid").getString("loginPassword");
      String Select_Subadmin= Subadmin_Allocate.getJSONObject("Valid").getString("Select_Subadmin");
      ExtentReport.test=ExtentReport.extent.startTest("Allocate_Subadmin_With_all_Valid_Data");
      Allocate_Subadmin_to_TeamCoordinator_PO Obj = PageFactory.initElements(driver, Allocate_Subadmin_to_TeamCoordinator_PO.class);
  	  Obj.Allocate_Subadmin_with_ValidData(loginEmail, loginPassword, Select_Subadmin);
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

