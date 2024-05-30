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
import PO.Add_YeildDeliveryDetails_PO;
import Utility.BrowserManager;

public class Add_YeildDeliveryDetails_Testcase {

	WebDriver driver;
    JSONObject Yeild_Details;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_YeildDetails.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Yeild_Details= new JSONObject(tokener);
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
    public void Add_YeildDeliveryDetails_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Yeild_Details.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Yeild_Details.getJSONObject("Valid").getString("loginPassword");
      String Select_Crop= Yeild_Details.getJSONObject("Valid").getString("Select_Crop");
      String Gross_Weight= Yeild_Details.getJSONObject("Valid").getString("Gross_Weight");
      String Tare_Weight = Yeild_Details.getJSONObject("Valid").getString("Tare_Weight");
      String Image= Yeild_Details.getJSONObject("Valid").getString("Image");
      String Driver_Name= Yeild_Details.getJSONObject("Valid").getString("Driver_Name");
      String Vehicle_Number= Yeild_Details.getJSONObject("Valid").getString("Vehicle_Number");
      String Date_Pickup= Yeild_Details.getJSONObject("Valid").getString("Date_Pickup");
      String Charge1= Yeild_Details.getJSONObject("Valid").getString("Charge1");
      String Charge2= Yeild_Details.getJSONObject("Valid").getString("Charge2");
      ExtentReport.test=ExtentReport.extent.startTest("Add_YeildDeliveryDetails_with_all_the_valid_data");
      Add_YeildDeliveryDetails_PO Obj = PageFactory.initElements(driver, Add_YeildDeliveryDetails_PO.class);
  	  Obj.Add_YeildDeliveryDetails_with_ValidData(loginEmail, loginPassword, Select_Crop, Gross_Weight, Tare_Weight, Image, Driver_Name, Vehicle_Number, Date_Pickup, Charge1, Charge2);
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
