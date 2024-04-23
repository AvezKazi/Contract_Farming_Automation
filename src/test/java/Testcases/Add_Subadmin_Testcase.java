package Testcases;

import java.io.InputStream;
import java.time.Duration;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.Add_Subadmin;
import Utility.BrowserManager;

public class Add_Subadmin_Testcase {
	WebDriver driver;
    JSONObject Subadmin;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Add_Subadmin.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Subadmin= new JSONObject(tokener);
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
    public void Add_Subadmins () throws Throwable {
  	  String loginEmail= Subadmin.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Subadmin.getJSONObject("Valid").getString("loginPassword");
      String Name= Subadmin.getJSONObject("Valid").getString("Name");
      String Mobile= Subadmin.getJSONObject("Valid").getString("Mobile");
      String Email = Subadmin.getJSONObject("Valid").getString("Email");
      String Address= Subadmin.getJSONObject("Valid").getString("Address");
      String Password= Subadmin.getJSONObject("Valid").getString("Password");
      Add_Subadmin Obj = PageFactory.initElements(driver, Add_Subadmin.class);
  	  Obj.Add_Subadmins(loginEmail, loginPassword, Name, Mobile, Email, Address, Password);
  	  
    }
}
