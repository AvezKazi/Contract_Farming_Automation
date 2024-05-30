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
import PO.Add_Category_PO;
import Utility.BrowserManager;

public class Add_Category_Testcase {

	WebDriver driver;
    JSONObject Ticket_Category;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_Ticket_Category.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Ticket_Category= new JSONObject(tokener);
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
    public void Add_Ticket_Category_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Ticket_Category.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Ticket_Category.getJSONObject("Valid").getString("loginPassword");
      String Category_Name = Ticket_Category.getJSONObject("Valid").getString("Category_Name");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Ticket_Category_with_all_the_valid_data");
      Add_Category_PO Obj = PageFactory.initElements(driver, Add_Category_PO.class);
  	  Obj.Add_with_ValidData(loginEmail, loginPassword, Category_Name);
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

