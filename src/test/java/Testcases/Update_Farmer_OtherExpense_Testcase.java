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
import PO.Update_Farmer_OtherExpense_PO;
import Utility.BrowserManager;

public class Update_Farmer_OtherExpense_Testcase {

	WebDriver driver;
    JSONObject Other_Expense;
    
    @BeforeClass
    public void loca ( ) throws Throwable {
    	ExtentReport.startreport();
  	  InputStream data= null;
  	  try {
  		  String FileName= "data/Farmer_OtherExpense_Update.json";
  		 data= getClass().getClassLoader().getResourceAsStream(FileName);
  		 JSONTokener tokener = new JSONTokener(data);
  		Other_Expense= new JSONObject(tokener);
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
    public void Update_Farmer_Other_Expenses_with_all_the_valid_data () throws Throwable {
  	  String loginEmail= Other_Expense.getJSONObject("Valid").getString("loginEmail");
	  String loginPassword = Other_Expense.getJSONObject("Valid").getString("loginPassword");
      String Date= Other_Expense.getJSONObject("Valid").getString("Date");
      String Select_Category= Other_Expense.getJSONObject("Valid").getString("Select_Category");
      String Expense_Name = Other_Expense.getJSONObject("Valid").getString("Expense_Name");
      String Quantity= Other_Expense.getJSONObject("Valid").getString("Quantity");
      String Total_Amount= Other_Expense.getJSONObject("Valid").getString("Total_Amount");
      String Remark= Other_Expense.getJSONObject("Valid").getString("Remark");
      String Bill_Image= Other_Expense.getJSONObject("Valid").getString("Bill_Image");
      String Verification_Status= Other_Expense.getJSONObject("Valid").getString("Verification_Status");
      ExtentReport.test=ExtentReport.extent.startTest("Add_Farmer_Other_Expenses_with_all_the_valid_data");
      Update_Farmer_OtherExpense_PO Obj = PageFactory.initElements(driver, Update_Farmer_OtherExpense_PO.class);
  	  Obj.Update_Farmers_OtherExpense_with_ValidData(loginEmail, loginPassword, Date, Select_Category, Expense_Name, Quantity, Total_Amount, Remark, Bill_Image, Verification_Status);
  	  
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
