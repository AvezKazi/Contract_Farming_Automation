package Testcases;
import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ExtentReport.ExtentReport;
import PO.Add_Buyer_PO;
import Utility.BrowserManager;

public class Add_Buyer_Testcase {
	WebDriver driver;
    JSONObject Buyer;
    @BeforeClass
	public void beforeclass()throws Exception  
	{
	  ExtentReport.startreport();
		InputStream Datais = null;
		try
		{
			String DataFileName = "data/Add_Buyer.json"; 
			Datais = getClass().getClassLoader().getResourceAsStream(DataFileName);
			JSONTokener tokener = new JSONTokener(Datais);
			Buyer = new JSONObject(tokener); 
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
	
    public void Add_Buyer_With_all_Valid_Data () throws Throwable {
  	  String loginEmail= Buyer.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Buyer.getJSONObject("Valid").getString("loginPassword");
      String Name= Buyer.getJSONObject("Valid").getString("Name");
      String Mobile= Buyer.getJSONObject("Valid").getString("Mobile");
      String Email = Buyer.getJSONObject("Valid").getString("Email");
      String Address= Buyer.getJSONObject("Valid").getString("Address");
      String GST_Number= Buyer.getJSONObject("Valid").getString("GST_Number");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Buyer_With_all_Valid_Data");
      Add_Buyer_PO Obj = PageFactory.initElements(driver, Add_Buyer_PO.class);
      boolean isDataAddedSuccessfully = Obj.Add_Buyer_with_all_ValidData(loginEmail, loginPassword, Name, Mobile, Email, Address, GST_Number);
      
      // Assert based on the result of the data addition operation
      Assert.assertTrue(isDataAddedSuccessfully, "Data was not added successfully");
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
