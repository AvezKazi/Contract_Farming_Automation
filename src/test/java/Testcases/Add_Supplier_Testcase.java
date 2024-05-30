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
import PO.Add_Supplier_PO;
import Utility.BrowserManager;

public class Add_Supplier_Testcase {

	WebDriver driver;
    JSONObject Supplier;
    @BeforeClass
	public void beforeclass()throws Exception  
	{
	  ExtentReport.startreport();
		InputStream Datais = null;
		try
		{
			String DataFileName = "data/Add_Suppliers.json"; 
			Datais = getClass().getClassLoader().getResourceAsStream(DataFileName);
			JSONTokener tokener = new JSONTokener(Datais);
			Supplier = new JSONObject(tokener); 
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
    public void Add_Supplier_With_all_Valid_Data () throws Throwable {
  	  String loginEmail= Supplier.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Supplier.getJSONObject("Valid").getString("loginPassword");
      String Name= Supplier.getJSONObject("Valid").getString("Name");
      String Mobile= Supplier.getJSONObject("Valid").getString("Mobile");
      String Email = Supplier.getJSONObject("Valid").getString("Email");
      String Address= Supplier.getJSONObject("Valid").getString("Address");
      String GST_Number= Supplier.getJSONObject("Valid").getString("GST_Number");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Supplier_With_all_Valid_Data");
      Add_Supplier_PO Obj = PageFactory.initElements(driver, Add_Supplier_PO.class);
  	  Obj.Add_Supplier_with_all_ValidData(loginEmail, loginPassword, Name, Mobile, Email, Address, GST_Number);
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
