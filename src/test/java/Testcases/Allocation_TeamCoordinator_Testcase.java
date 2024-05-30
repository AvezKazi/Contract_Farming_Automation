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
import PO.Allocation_of_teamcoordinator_PO;
import Utility.BrowserManager;

public class Allocation_TeamCoordinator_Testcase {

	WebDriver driver;
    JSONObject TeamCoordinator_Allocate;
    @BeforeClass
	public void beforeclass()throws Exception  
	{
	  ExtentReport.startreport();
		InputStream Datais = null;
		try
		{
			String DataFileName = "data/Allocate_Teamcoordinator.json"; 
			Datais = getClass().getClassLoader().getResourceAsStream(DataFileName);
			JSONTokener tokener = new JSONTokener(Datais);
			TeamCoordinator_Allocate = new JSONObject(tokener); 
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
    public void Allocate_teamCoordinator_With_all_Valid_Data () throws Throwable {
  	  String loginEmail= TeamCoordinator_Allocate.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = TeamCoordinator_Allocate.getJSONObject("Valid").getString("loginPassword");
      String Select_Coordinator= TeamCoordinator_Allocate.getJSONObject("Valid").getString("Select_Coordinator");
      ExtentReport.test=ExtentReport.extent.startTest("Allocate_teamCoordinator_With_all_Valid_Data");
      Allocation_of_teamcoordinator_PO Obj = PageFactory.initElements(driver, Allocation_of_teamcoordinator_PO.class);
  	  Obj.Allocate_TeamCoordinator_with_ValidData(loginEmail, loginPassword, Select_Coordinator);
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
