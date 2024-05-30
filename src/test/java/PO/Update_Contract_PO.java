package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Update_Contract_PO {

	WebDriver driver;
	{
		this.driver = driver;
	}
	@FindBy(how = How.XPATH,using="//input[@name='admin_email']")
	WebElement txt_AdminEmail;
	
	@FindBy(how = How.XPATH,using="//input[@name='admin_password']")
	WebElement txt_AdminPassword;
	
	@FindBy (how=How.XPATH, using="//button[@type='submit']")
    WebElement Btn_Login;

   @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[3]")
   WebElement Contract;
   
   @FindBy(how= How.XPATH, using ="//a[text()='Contract Details']")
   WebElement Contract_Details;
   
   @FindBy(how= How.XPATH, using="(//a[@title='Edit Contract !'])[1]")
   WebElement Update_Contract;
   
   @FindBy(how= How.XPATH, using="//input[@id='title']")
   WebElement Contract_Title;
   
   @FindBy(how= How.XPATH, using="//select[@id='type_of_farmer']")
   WebElement Select_typeofFarmer;
   
   @FindBy(how= How.XPATH, using="//select[@id='farmer']")
   WebElement Select_Farmer;
   
   @FindBy (how= How.XPATH, using="//select[@id='buyer']")
   WebElement Select_Buyer;
   
   @FindBy(how= How.XPATH, using="//select[@id='land']")
   WebElement Select_Land;
   
   @FindBy(how= How.XPATH, using="//select[@id='crops'] ")
   WebElement Select_Crop;
   
   @FindBy(how= How.XPATH, using="//input[@id='farm_image1'] ")
   WebElement Farm_Image;
   
   @FindBy(how= How.XPATH, using="//input[@id='farm_doc']")
   WebElement Farm_Document ;
   
   @FindBy(how= How.XPATH, using="//input[@id='startdate'] ")
   WebElement Contract_StartDate;
   
   @FindBy(how= How.XPATH, using="//input[@id='enddate']  ")
   WebElement Contract_EndDate ;
   
   @FindBy(how= How.XPATH, using="//input[@id='date_of_sowing']")
   WebElement Date_Of_Sowing;
   
   @FindBy(how= How.XPATH, using="//input[@id='price_per_kg']")
   WebElement Price_Per_Kg;
   
   @FindBy(how= How.XPATH, using="//input[@id='proposed_yield']")
   WebElement Proposed_Yield ;
   
   @FindBy(how= How.XPATH, using="//textarea[@id='company_clause']")
   WebElement Company_Clause;
   
   @FindBy(how= How.XPATH, using="//i[@id='addDiv']")
   WebElement Add_Resource ;
   
   @FindBy(how= How.XPATH, using="//select[@id='r1']")
   WebElement Select_Resource_Type;
   
   @FindBy(how= How.XPATH, using="//select[@id='1']")
   WebElement Select_Resource_Name ;
   
   @FindBy(how= How.XPATH, using="//input[@id='quantity_1']")
   WebElement Resource_Quantity;
   
   @FindBy(how= How.XPATH, using="//button[@onclick='return edit()']")
   WebElement Update;
   
   @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
   WebElement Click_YES;
   
   @FindBy(how= How.XPATH, using="//button[@class='swal-button swal-button--confirm']")
   WebElement Click_OK;
   
   public void txt_AdminEmail(String args) {
	   txt_AdminEmail.sendKeys(args);
	   ExtentReport.test.log(LogStatus.INFO,"Enter Admin Email id as" ,args);
   }
   public void EnterPassword (String args)
  	{
  		txt_AdminPassword.sendKeys(args);
  		ExtentReport.test.log(LogStatus.INFO, "Enter the Admin Password", args);
  	}
  	public void ClickLogin ()
  	{
  		Btn_Login.click();
  		ExtentReport.test.log(LogStatus.INFO, "Cliked on Login Button", "Clicked");
  	}
  	public void Contract()
      {
  		Contract.click();
  		ExtentReport.test.log(LogStatus.INFO, "Click on Contract Option", "Clicked");
      }
      public void Contract_Details()
      {
    	  Contract_Details.click();
      	ExtentReport.test.log(LogStatus.INFO, "Click on Contract_Details", "Clicked");
      }
      public void Update_Contract()
      {
    	  Update_Contract.click();
      	ExtentReport.test.log(LogStatus.INFO, "Clicked on Add_Contract Button", "Clicked");
      }
      public void Contract_Title(String args)
      {
    	  Contract_Title.clear();
    	  Contract_Title.sendKeys(args);
      	ExtentReport.test.log(LogStatus.INFO, "Entered the Contract Title", args);
      }
      public void Select_typeofFarmer(String args)
      {
    	  Select_typeofFarmer.sendKeys(args);
   	   Select se = new Select(Select_typeofFarmer);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the Farmer Type as", args);
      }
      public void Select_Farmer(String args)
      {
    	  Select_Farmer.clear();
    	  Select_Farmer.sendKeys(args);
   	   Select se = new Select(Select_Farmer);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the Farmer as", args);
      }
      public void Select_Buyer(String args)
      {
    	  Select_Buyer.clear();
    	  Select_Buyer.sendKeys(args);
   	   Select se = new Select(Select_Buyer);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the Farmer as", args);
      }
      public void Select_Land(String args)
      {
    	  Select_Land.clear();
    	  Select_Land.sendKeys(args);
   	   Select se = new Select(Select_Land);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the land as", args);
      }
      public void Select_Crop(String args)
      {
    	  Select_Crop.clear();
    	  Select_Crop.sendKeys(args);
   	   Select se = new Select(Select_Crop);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the Crop and Season as", args);
      }
     public void Farm_Image(String args)
     {
    	 Farm_Image.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Upload the Farm Image as  ", args);
     }
     public void Farm_Document(String args)
     {
    	 Farm_Document.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Upload the Farm Document", args);
     }
     public void Contract_StartDate( String args)
     {
    	 Contract_StartDate.clear();
    	 Contract_StartDate.sendKeys(args);;
  	   ExtentReport.test.log(LogStatus.INFO, "Entered the Contract Start Date as  ", args);
     }
     public void Contract_EndDate (String args)
     {
    	 Contract_EndDate.clear();
    	 Contract_EndDate.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Contract End Date as", args);
     }
     public void Date_Of_Sowing (String args)
     {
    	 Date_Of_Sowing.clear();
    	 Date_Of_Sowing.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Date Of Sowing as", args);
     }
     public void Price_Per_Kg (String args)
     {
    	 Price_Per_Kg.clear();
    	 Price_Per_Kg.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the price per kg  as", args);
     }
     public void Proposed_Yield (String args)
     {
    	 Proposed_Yield.clear();
    	 Proposed_Yield.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Proposed Yield as", args);
     }
     public void Company_Clause (String args)
     {
    	 Company_Clause.clear();
    	 Company_Clause.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Company Clause as", args);
     }
     public void Add_Resource()
     {
    	 Add_Resource.click();
  	   ExtentReport.test.log(LogStatus.INFO, "Click on Add Resource Button", "Clicked");
     }
     public void Select_Resource_Type(String args)
     {
    	 Select_Resource_Type.clear();
    	 Select_Resource_Type.sendKeys(args);
  	   Select se = new Select(Select_Resource_Type);
  	   se.selectByVisibleText(args);
  	  ExtentReport.test.log(LogStatus.INFO, "Select Resource Type as", args);
     }
     public void Select_Resource_Name(String args)
     {
    	 Select_Resource_Name.clear();
    	 Select_Resource_Name.sendKeys(args);
  	   Select se = new Select(Select_Resource_Name);
  	   se.selectByVisibleText(args);
  	  ExtentReport.test.log(LogStatus.INFO, "Select_Resource_Name as", args);
     }
     public void Resource_Quantity (String args)
     {
    	 Resource_Quantity.clear();
    	 Resource_Quantity.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Resource Quantity as", args);
     }
     public void Update()
     {
  	   Update.click(); 
  	   ExtentReport.test.log(LogStatus.INFO, "Cliked on Update Button", "Clicked");
     }
     public void Yes()
     {
  	   Click_YES.click(); 
  	   ExtentReport.test.log(LogStatus.INFO, "Cliked On YES Button To confirm", "Clicked");
     }
     public void Ok()
     {
  	   Click_OK.click(); 
  	   ExtentReport.test.log(LogStatus.INFO, "Cliked on OK Button", "Clicked");
     }
   public void Update_Contract_with_ValidData(String txt_AdminEmail,String EnterPassword,String Contract_Title,String Select_typeofFarmer,String Select_Farmer,String Select_Buyer,String Select_Land, String Select_Crop,String Farm_Image,String Farm_Document,String Contract_StartDate,String Contract_EndDate,String Date_Of_Sowing,String Price_Per_Kg,String Proposed_Yield,String Company_Clause,String Select_Resource_Type,String Select_Resource_Name,String Resource_Quantity) throws InterruptedException
   {
	   txt_AdminEmail(txt_AdminEmail);
	   Thread.sleep(2000);
	   EnterPassword(EnterPassword);
	   Thread.sleep(2000);
	   ClickLogin();
	   Thread.sleep(2000);
	   Contract();
	   Thread.sleep(2000);
	   Contract_Details();
	   Thread.sleep(2000);
	   Update_Contract();
	   Thread.sleep(2000);
	   Contract_Title(Contract_Title);
	   Thread.sleep(2000);
	   Select_typeofFarmer(Select_typeofFarmer);
	   Thread.sleep(2000);
	   Select_Farmer(Select_Farmer);
	   Thread.sleep(2000);
	   Select_Buyer(Select_Buyer);
	   Thread.sleep(2000);
	   Select_Land(Select_Land);
	   Thread.sleep(2000);
	   Select_Crop(Select_Crop);
	   Thread.sleep(2000);
	   Farm_Image(Farm_Image);
	   Thread.sleep(2000);
	   Farm_Document(Farm_Document);
	   Thread.sleep(2000);
	   Contract_StartDate(Contract_StartDate);
	   Thread.sleep(2000);
	   Contract_EndDate(Contract_EndDate);
	   Thread.sleep(2000);				
	   Date_Of_Sowing(Date_Of_Sowing);
	   Thread.sleep(2000);
	   Price_Per_Kg(Price_Per_Kg);
	   Thread.sleep(2000);
	   Proposed_Yield(Proposed_Yield);
	   Thread.sleep(2000);
	   Company_Clause(Company_Clause);
	   Thread.sleep(2000);
	   Select_Resource_Type(Select_Resource_Type);
	   Thread.sleep(2000);
	   Select_Resource_Name(Select_Resource_Name);
	   Thread.sleep(2000);
	   Resource_Quantity(Resource_Quantity);
	   Thread.sleep(2000);
	   Update();
	   Thread.sleep(2000);
	   Yes();
	   Thread.sleep(2000);
	   Ok();
	   Thread.sleep(2000);
	   driver.close();	   	   
   }
}
	

