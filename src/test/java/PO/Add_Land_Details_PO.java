package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Add_Land_Details_PO {

	WebDriver driver;
    {
      	this.driver = driver;
     }
       @FindBy(how= How.XPATH, using="//input[@name='admin_email']")
	    WebElement txt_AdminEmail;
	
    	@FindBy (how= How.XPATH, using="//input[@name='admin_password']")
   	WebElement txt_AdminPassword;
	
   	@FindBy (how=How.XPATH, using="//button[@type='submit']")
	    WebElement Btn_Login;
	
       @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[2]")
       WebElement Members;
       
       @FindBy(how= How.XPATH, using ="//a[text()='Farmers']")
       WebElement Farmer;
       
       @FindBy(how= How.XPATH, using="(//p[@title='View Land Details !'])[1]")
       WebElement View_Land_Details;
       
       @FindBy(how= How.XPATH, using="//a[@type='submit']")
       WebElement Add_Land;
       
       @FindBy(how= How.XPATH, using="//input[@id='title'] ")
       WebElement Farmer_Title;
       
       @FindBy(how= How.XPATH, using="//input[@id='farm_image1'] ")
       WebElement Farm_Image_1;
       
       @FindBy(how= How.XPATH, using="//input[@id='farm_image2']")
       WebElement Farm_Image_2;
       
       @FindBy (how= How.XPATH, using="//input[@id='farm_document']")
       WebElement Upload_Document;
       
       @FindBy(how= How.XPATH, using="//input[@id='soil_doc']")
       WebElement Soil_Survey_Report;
       
       @FindBy(how= How.XPATH, using="//select[@id='name']")
       WebElement Select_Soil;
       
       @FindBy(how= How.XPATH, using="//input[@id='land']")
       WebElement Total_Land;
       
       @FindBy(how= How.XPATH, using="//select[@id='land_measure'] ")
       WebElement Select_Dimension_Type;
       
       @FindBy(how= How.XPATH, using="//input[@id='gutnumber']")
       WebElement Gat_Number;
       
       @FindBy(how= How.XPATH, using="//input[@id='cult_land']")
       WebElement Land_under_Cultivation;
       
       @FindBy(how= How.XPATH, using="//select[@id='rainfalltype']")
       WebElement Select_Rainfall_Type;
       
       @FindBy(how= How.XPATH, using="//input[@id='latitude']")
       WebElement Latitude;
       
       @FindBy(how= How.XPATH, using="//input[@id='longitude']")
       WebElement Longitude;
       
       @FindBy(how= How.XPATH, using="//input[@id='climate']")
       WebElement Climate_Conditions;
       
       @FindBy(how= How.XPATH, using="//input[@id='address']")
       WebElement Address;
       
       @FindBy(how= How.XPATH, using="//select[@id='crop_type'] ")
       WebElement Select_Previous_Crop;
       
       @FindBy(how= How.XPATH, using="//input[@id='description']")
       WebElement Description;
       
       @FindBy(how= How.XPATH, using="//select[@id='water_source']")
       WebElement Select_Water_Source;
       
       @FindBy(how= How.XPATH, using="//input[@id='status_of_irrigation']")
       WebElement Status_of_irrigation;
       
       @FindBy(how= How.XPATH, using="//input[@id='shednet'] ")
       WebElement Shednet;

       @FindBy(how= How.XPATH, using="//select[@id='crop_1']")
       WebElement Select_Crop;
       
       @FindBy(how= How.XPATH, using="//select[@id='total_field_land_1']")
       WebElement Total_land;
       
       @FindBy(how= How.XPATH, using="//select[@id='verification_status']")
       WebElement Verification_Status;
       
       @FindBy(how= How.XPATH, using="//button[@onclick='return add()']")
       WebElement Add;
       
       @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
       WebElement Click_YES;
       
       @FindBy(how= How.XPATH, using="//button[@class='swal-button swal-button--confirm']")
       WebElement Click_OK;
       
       
       public void EnterEmail (String args)
   	{
   		txt_AdminEmail.sendKeys(args);
   		ExtentReport.test.log(LogStatus.INFO, "Enter the Admin Email id", args);
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
   	public void Members()
       {
   		Members.click();
   		ExtentReport.test.log(LogStatus.INFO, "Click on Member Option", "Clicked");
       }
       public void Farmers()
       {
    	   Farmer.click();
       	ExtentReport.test.log(LogStatus.INFO, "Click on Farmer", "Clicked");
       }
       public void View_Land_Details()
       {
    	   View_Land_Details.click();
       	ExtentReport.test.log(LogStatus.INFO, "Clicked on View_Land_Details Button", "Clicked");
       }
       public void Add_Land()
       {
    	   Add_Land.click();
    	  ExtentReport.test.log(LogStatus.INFO, "Click on Add land", "Clicked");
       }
      public void Farmer_Title(String args)
      {
    	  Farmer_Title.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter Farm Title as ", args);
      }
      public void Farm_Image_1(String args)
      {
    	  Farm_Image_1.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "upload farm image 1 as  ", args);
      }
      public void Farm_Image_2(String args)
      {
    	  Farm_Image_2.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Upload the Farm image 2 as ", args);
      }
      public void Upload_Document (String args)
      {
    	  Upload_Document.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Upload land Document as ", args);
      }
      public void Soil_Survey_Report (String args)
      {
    	  Soil_Survey_Report.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Upload Soil Survery Report as ", args);
      }
      public void Select_Soil (String args)
      {
    	  Select_Soil.sendKeys(args);
      	   Select se = new Select(Select_Soil);
      	   se.selectByVisibleText(args);
      	  ExtentReport.test.log(LogStatus.INFO, " Select_Soil as", args);
      }
      public void Total_Land (String args)
      {
    	  Total_Land.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Total_Land as", args);
      }
      public void Select_Dimension_Type (String args)
      {
    	  Select_Dimension_Type.sendKeys(args);
      	   Select se = new Select(Select_Dimension_Type);
       	   se.selectByVisibleText(args);
       	  ExtentReport.test.log(LogStatus.INFO, "Select_Dimension_Type as", args);
      }
      public void Gat_Number (String args)
      {
    	  Gat_Number.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Gat_Number as", args);
      }
      public void Land_under_Cultivation (String args)
      {
    	  Land_under_Cultivation.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Land_under_Cultivation as", args);
      }
      public void Select_Rainfall_Type (String args)
      {
    	  Select_Rainfall_Type.sendKeys(args);
      	   Select se = new Select(Select_Rainfall_Type);
      	   se.selectByVisibleText(args);
      	  ExtentReport.test.log(LogStatus.INFO, "Select_Rainfall_Type as", args);
      }
      public void Latitude (String args)
      {
    	  Latitude.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Latitude as", args);
      }
      public void Longitude(String args)
      {
    	  Longitude.sendKeys(args);
      	   ExtentReport.test.log(LogStatus.INFO, "Enter the Longitude as", args);
      }
      public void Climate_Conditions(String args)
      {
    	  Climate_Conditions.sendKeys(args);
      	   ExtentReport.test.log(LogStatus.INFO, "Enter the Climate_Conditions as", args);
      }
      public void Address(String args)
      {
    	  Address.sendKeys(args);
      	   ExtentReport.test.log(LogStatus.INFO, "Enter the Address as", args);
      }
      public void Select_Previous_Crop(String args)
      {
    	  Select_Previous_Crop.sendKeys(args);
   	   Select se = new Select(Select_Previous_Crop);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select_Previous_Crop as", args);
      }
      public void Description (String args)
      {
    	  Description.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Description as", args);
      }
      public void Select_Water_Source (String args)
      {
    	  Select_Water_Source.sendKeys(args);
      	   Select se = new Select(Select_Water_Source);
      	   se.selectByVisibleText(args);
      	  ExtentReport.test.log(LogStatus.INFO, "Select_Water_Source as", args);
      }
      public void Status_of_irrigation( )
      {
    	  Status_of_irrigation.click();
   	  ExtentReport.test.log(LogStatus.INFO, "Clicked on Status of irrigation", "Clicked");
      }
      public void Shednet( )
      {
    	  Shednet.click();
   	  ExtentReport.test.log(LogStatus.INFO, "Clicked on Shednet","clicked" );
      }
      public void Select_Crop (String args)
      {
    	  Select_Crop.sendKeys(args);
      	   Select se = new Select(Select_Crop);
      	   se.selectByVisibleText(args);
      	  ExtentReport.test.log(LogStatus.INFO, "Select_Crop as", args);
      }
      public void Total_land(String args)
      {
    	  Total_land.click();
   	  ExtentReport.test.log(LogStatus.INFO, "Enter total land as ", args);
      }
      public void Verification_Status (String args)
      {
    	  Verification_Status.sendKeys(args);
      	   Select se = new Select(Verification_Status);
      	   se.selectByVisibleText(args);
      	  ExtentReport.test.log(LogStatus.INFO, "Verification_Status as", args);
      }
      public void Add()
      {
   	   Add.click(); 
   	   ExtentReport.test.log(LogStatus.INFO, "Cliked on Add Button", "Clicked");
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
      public void Add_FarmerLand_with_ValidData(String loginEmail, String loginPassword,String Farmer_Title,String Farm_Image_1,String Farm_Image_2,String Upload_Document,String Soil_Survey_Report,String Select_Soil,String Total_Land,String Select_Dimension_Type,String Gat_Number,String Land_under_Cultivation,String Select_Rainfall_Type,String Latitude,String Longitude,String Climate_Conditions,String Address,String Select_Previous_Crop,String Description,String Select_Water_Source,String Select_Crop,String Total_land,String Verification_Status) throws InterruptedException
      {
   	   
   	   EnterEmail(loginEmail);
   	   Thread.sleep(2000);
   	   EnterPassword(loginPassword);
   	   Thread.sleep(2000);
   	   ClickLogin();
   	   Thread.sleep(2000);
   	   Members();
   	   Thread.sleep(2000);
   	   Farmers();
   	   Thread.sleep(2000);
   	   View_Land_Details();
   	   Thread.sleep(2000);
   	   Add_Land ( );
       Thread.sleep(2000);
       Farmer_Title(Farmer_Title);
       Thread.sleep(2000);
       Farm_Image_1(Farm_Image_1);
       Thread.sleep(2000);
       Farm_Image_2(Farm_Image_2);
       Thread.sleep(2000);
       Upload_Document(Upload_Document);
       Thread.sleep(2000);
       Soil_Survey_Report(Soil_Survey_Report);
       Thread.sleep(2000);
       Select_Soil(Select_Soil);
       Thread.sleep(2000);
       Total_Land(Total_Land);
       Thread.sleep(2000);
       Select_Dimension_Type(Select_Dimension_Type);
       Thread.sleep(2000);
       Gat_Number(Gat_Number);
       Thread.sleep(2000);
       Land_under_Cultivation(Land_under_Cultivation);
       Thread.sleep(2000);
       Select_Rainfall_Type(Select_Rainfall_Type);
       Thread.sleep(2000);
       Latitude(Latitude);
       Thread.sleep(2000);
       Longitude(Longitude);
       Thread.sleep(2000);
       Climate_Conditions(Climate_Conditions);
       Thread.sleep(2000);
       Address(Address);
       Thread.sleep(2000);
       Select_Previous_Crop(Select_Previous_Crop);
       Thread.sleep(2000);
       Description(Description);
       Thread.sleep(2000);
       Select_Water_Source(Select_Water_Source);
       Thread.sleep(2000);
       Status_of_irrigation();
   	   Thread.sleep(2000);
     	Shednet();
   	   Thread.sleep(2000);
   	   Select_Crop(Select_Crop);
       Thread.sleep(2000);
       Total_land(Total_land);
       Thread.sleep(2000);
       Verification_Status(Verification_Status);
   	   Thread.sleep(2000);
   	   Add();
   	   Thread.sleep(2000);
   	   Yes();
   	   Thread.sleep(2000);
   	   Ok();
   	   Thread.sleep(2000);
   	   driver.close();
   	   	    	   		    	   
}

}
