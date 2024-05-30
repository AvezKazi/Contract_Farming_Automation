package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Update_Farmer_PO {

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
       
       @FindBy(how= How.XPATH, using="(//a[@title='Edit Farmer !'])[1]")
       WebElement Update_Farmer;
       
       @FindBy(how= How.XPATH, using="//select[@id='type_of_farmer']")
       WebElement Select_Type;
       
       @FindBy(how= How.XPATH, using="//input[@name='profile_image'] ")
       WebElement Profile_Image;
       
       @FindBy(how= How.XPATH, using="//input[@name='name']")
       WebElement Name;
       
       @FindBy (how= How.XPATH, using="//input[@id='mobile']")
       WebElement Mobile;
       
       @FindBy(how= How.XPATH, using="//input[@id='email']")
       WebElement Email;
       
       @FindBy(how= How.XPATH, using="//textarea[@id='description']")
       WebElement Description;
       
       @FindBy(how= How.XPATH, using="//input[@id='panno']")
       WebElement PanCard;
       
       @FindBy(how= How.XPATH, using="//input[@id='panAdhar_image'] ")
       WebElement PanCard_Image;
       
       @FindBy(how= How.XPATH, using="//input[@id='adharno']")
       WebElement Aadhar_Number;
       
       @FindBy(how= How.XPATH, using="//input[@id='Adhar_image']")
       WebElement Aadhar_Image;
       
       @FindBy(how= How.XPATH, using="//input[@id='gst_no']")
       WebElement GST_NO;
       
       @FindBy(how= How.XPATH, using="//input[@id='streetname']")
       WebElement StreetName;
       
       @FindBy(how= How.XPATH, using="//input[@id='pincode']")
       WebElement Pincode;
       
       @FindBy(how= How.XPATH, using="//select[@id='state_id']")
       WebElement State;
       
       @FindBy(how= How.XPATH, using="//select[@id='district']")
       WebElement District;
       
       @FindBy(how= How.XPATH, using="//select[@id='block'] ")
       WebElement Block;
       
       @FindBy(how= How.XPATH, using="//select[@id='village']")
       WebElement Village;
       
       @FindBy(how= How.XPATH, using="//textarea[@id='location']")
       WebElement Address;
       
       @FindBy(how= How.XPATH, using="//select[@id='status'] ")
       WebElement status;
       
       @FindBy(how= How.XPATH, using="//button[@onclick='return edit()']")
       WebElement Update;
       
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
       public void Update_Farmer()
       {
    	   Update_Farmer.click();
       	ExtentReport.test.log(LogStatus.INFO, "Clicked on Update Farmer Button", "Clicked");
       }
       public void Select_Type(String args)
       {
    	   Select_Type.sendKeys(args);
    	   Select se = new Select(Select_Type);
    	   se.selectByVisibleText(args);
    	  ExtentReport.test.log(LogStatus.INFO, "Select the Farmer Type as", args);
       }
      public void Profile_Image(String args)
      {
    	  Profile_Image.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Upload the farmer Image as ", args);
      }
      public void Name(String args)
      {
    	  Name.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Farmer Name as ", args);
      }
      public void Mobile(String args)
      {
   	   Mobile.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Mobile Number as ", args);
      }
      public void Email (String args)
      {
   	   Email.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Email Id as", args);
      }
      public void Description (String args)
      {
    	  Description.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Description as", args);
      }
      public void PanCard (String args)
      {
    	  PanCard.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the PanCard Number as", args);
      }
      public void PanCard_Image (String args)
      {
    	  PanCard_Image.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the PanCard_Image as", args);
      }
      public void Aadhar_Number (String args)
      {
    	  Aadhar_Number.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Aadhar_Number as", args);
      }
      public void Aadhar_Image (String args)
      {
    	  Aadhar_Image.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Aadhar_Image Number as", args);
      }
      public void GST_NO (String args)
      {
    	  GST_NO.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the GST_NO as", args);
      }
      public void StreetName (String args)
      {
    	  StreetName.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the StreetName as", args);
      }
      public void Pincode (String args)
      {
    	  Pincode.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Pincode as", args);
      }
      public void State(String args)
      {
    	  State.sendKeys(args);
   	   Select se = new Select(State);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the State as", args);
      }
      public void District(String args)
      {
   	   District.sendKeys(args);
   	   Select se = new Select(District);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the District as", args);
      }
      public void Block(String args)
      {
   	   Block.sendKeys(args);
   	   Select se = new Select(Block);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the Farmer Type as", args);
      }
      public void Village(String args)
      {
   	   Village.sendKeys(args);
   	   Select se = new Select(Village);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the Village as", args);
      }
      public void Address (String args)
      {
    	  Address.sendKeys(args);
   	   ExtentReport.test.log(LogStatus.INFO, "Enter the Address as", args);
      }
      
      public void Status(String args)
      {
   	   status.sendKeys(args);
   	   Select se = new Select(status);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select the status as", args);
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
      public void Update_Farmer_with_ValidData(String loginEmail, String loginPassword,String Select_Type,String Profile_Image,String Name,String Mobile,String Email,String Description,String PanCard,String PanCard_Image,String Aadhar_Number,String Aadhar_Image,String GST_NO,String StreetName,String Pincode,String State,String District,String Block,String Village,String Address,String Password,String Status) throws InterruptedException
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
   	   Update_Farmer();
   	   Thread.sleep(2000);
       Select_Type (Select_Type );
       Thread.sleep(2000);
       Profile_Image(Profile_Image);
       Thread.sleep(2000);
       Name(Name);
       Thread.sleep(2000);
       Mobile(Name);
       Thread.sleep(2000);
       Mobile(Mobile);
       Thread.sleep(2000);
       Email(Email);
       Thread.sleep(2000);
       Description(Description);
       Thread.sleep(2000);
       PanCard(PanCard);
       Thread.sleep(2000);
       PanCard_Image(PanCard_Image);
       Thread.sleep(2000);
       Aadhar_Number(Aadhar_Number);
       Thread.sleep(2000);
       Aadhar_Image(Aadhar_Image);
       Thread.sleep(2000);
       GST_NO(GST_NO);
       Thread.sleep(2000);
       StreetName(StreetName);
       Thread.sleep(2000);
       Pincode(Pincode);
       Thread.sleep(2000);
       State(State);
       Thread.sleep(2000);
       District(District);
       Thread.sleep(2000);
       Block(Block);
       Thread.sleep(2000);
       Village(Village);
       Thread.sleep(2000);
   	   Address(Address);
   	   Thread.sleep(2000);
   	    Status(Status);
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


