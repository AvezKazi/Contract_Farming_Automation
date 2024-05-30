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
import PO.Add_Customize_Condition_For_Contract_PO;
import Utility.BrowserManager;

public class Add_Customize_Condition_for_Contract_Testcase {

	WebDriver driver;
    JSONObject Customize_Condition;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_Customize_Condition.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Customize_Condition= new JSONObject(tokener);
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
    public void Add_Customize_Contract_Condition_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Customize_Condition.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Customize_Condition.getJSONObject("Valid").getString("loginPassword");
      String Select_Contract_Category= Customize_Condition.getJSONObject("Valid").getString("Select_Contract_Category");
      String Enter_Points= Customize_Condition.getJSONObject("Valid").getString("Enter_Points");
      String Image = Customize_Condition.getJSONObject("Valid").getString("Image");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Customize_Contract_Condition_with_all_the_valid_data");
      Add_Customize_Condition_For_Contract_PO Obj = PageFactory.initElements(driver, Add_Customize_Condition_For_Contract_PO.class);
  	  Obj.Add_Customize_Condition_with_ValidData(loginEmail, loginPassword, Select_Contract_Category, Enter_Points, Image);
  	  
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

