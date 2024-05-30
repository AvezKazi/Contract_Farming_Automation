package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Add_Vendor_PO {
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
     
     @FindBy(how= How.XPATH, using ="//a[text()='Vendors']")
     WebElement Vendor;
     
     @FindBy(how= How.XPATH, using="//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")
     WebElement Add_Vendor;
     
     @FindBy(how= How.XPATH, using="//input[@id='name']")
     WebElement Name;
     
     @FindBy (how= How.XPATH, using="//input[@id='mobile']")
     WebElement Mobile;
     
     @FindBy(how= How.XPATH, using="//input[@id='email']")
     WebElement Email;
     
     @FindBy(how= How.XPATH, using="//input[@id='address']")
     WebElement Address;
     
     @FindBy(how= How.XPATH, using="//input[@id='gst_number']")
     WebElement GST_Number;

     @FindBy(how= How.XPATH, using="//input[@id='pan_no']")
     WebElement Pan_Number;
     
     @FindBy(how= How.XPATH, using="//input[@id='pan_image']")
     WebElement Pan_Image;
     
     @FindBy(how= How.XPATH, using="//input[@id='adharno']")
     WebElement Aadhar_Number;
     
     @FindBy(how= How.XPATH, using="//input[@id='aadhar_image']")
     WebElement aadhar_image;
     
     @FindBy(how= How.XPATH, using="//button[@onclick='return add()']")
     WebElement Add;
     
     @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
     WebElement Click_YES;
     
     @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
     WebElement Click_OK;
     
     
     public void EnterEmail (String args)
 	{
 		txt_AdminEmail.sendKeys(args);
 		 ExtentReport.test.log(LogStatus.INFO, "Enter the Admin Email Id as", args);
 	}
 	public void EnterPassword (String args)
 	{
 		txt_AdminPassword.sendKeys(args);
 		 ExtentReport.test.log(LogStatus.INFO, "Enter the Admin Password Id as", args);
 	}
 	public void ClickLogin ()
 	{
 		Btn_Login.click();
 		 ExtentReport.test.log(LogStatus.INFO, "Cliked on the Login Button", "Clicked");
 	}
 	public void Members()
     {
 		Members.click();
 		 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Members Option", "Clicked");
     }
     public void Vendor()
     {
    	 Vendor.click();
    	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Vendor Option", "Clicked");
     }
     public void Add_Vendor()
     {
    	 Add_Vendor.click();
    	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Add Vendor", "Clicked");
     }
    public void Name(String args)
    {
 	   Name.sendKeys(args);
 	  ExtentReport.test.log(LogStatus.INFO, "Enter the Vendor Name as", args);
    }
    public void Mobile(String args)
    {
 	   Mobile.sendKeys(args);
 	  ExtentReport.test.log(LogStatus.INFO, "Enter the Mobile Number as", args);
    }
    public void Email (String args)
    {
 	   Email.sendKeys(args);
 	  ExtentReport.test.log(LogStatus.INFO, "Enter the Email Id as", args);
    }
    public void Address (String args)
    {
 	   Address.sendKeys(args);
 	  ExtentReport.test.log(LogStatus.INFO, "Enter the Vendor Address as", args);
    }
    public void GST_Number (String args)
    {
    	GST_Number.sendKeys(args);
    	 ExtentReport.test.log(LogStatus.INFO, "Enter the Vendor GST Number as", args);
    }
    public void Pan_Number (String args)
    {
    	Pan_Number.sendKeys(args);
    	 ExtentReport.test.log(LogStatus.INFO, "Enter the Vendor Pan Number as", args);
    }
    public void Pan_Image (String args)
    {
    	Pan_Image.sendKeys(args);
    	 ExtentReport.test.log(LogStatus.INFO, "Upload the Pan Image as ", args);
    }
    public void Aadhar_Number (String args)
    {
    	Aadhar_Number.sendKeys(args);
    	 ExtentReport.test.log(LogStatus.INFO, "Enter the Vendor Aadhar Number as", args);
    }
    public void aadhar_image (String args)
    {
    	aadhar_image.sendKeys(args);
    	 ExtentReport.test.log(LogStatus.INFO, "Uploaded the Aadhar Image as ", args);
    }

    public void Add()
    {
 	   Add.click(); 
 	  ExtentReport.test.log(LogStatus.INFO, "Clicked on Add Button", "Clicked");
    }
    public void Yes()
    {
 	   Click_YES.click(); 
 	  ExtentReport.test.log(LogStatus.INFO, "Clicked on the YES Button","Clicked");
    }
    public void Ok()
    {
 	   Click_OK.click(); 
 	  ExtentReport.test.log(LogStatus.INFO, "Clicked on OK Button", "Clicked");
    }
    public void Add_Vendors_with_ValidData(String loginEmail, String loginPassword,String Name,String Mobile,String Email,String Address,String GST_Number,String Pan_Number,String Pan_Image,String Aadhar_Number,String Aadhar_Image) throws InterruptedException
    {
 	   
 	   EnterEmail(loginEmail);
 	   Thread.sleep(2000);
 	   EnterPassword(loginPassword);
 	   Thread.sleep(2000);
 	   ClickLogin();
 	   Thread.sleep(2000);
 	   Members();
 	   Thread.sleep(2000);
 	   Vendor();
 	   Thread.sleep(2000);
 	   Add_Vendor();
 	   Thread.sleep(2000);
 	   Name(Name);
 	   Thread.sleep(2000);
 	   Mobile(Mobile);
 	   Thread.sleep(2000);
 	   Email(Email);
 	   Thread.sleep(2000);
 	   Address(Address);
 	   Thread.sleep(2000);
 	   GST_Number(GST_Number);
 	   Thread.sleep(2000);
 	   Pan_Number(Pan_Number);
 	   Thread.sleep(2000);
 	   Pan_Image(Pan_Image);
 	   Thread.sleep(2000);
 	   Aadhar_Number(Aadhar_Number);
 	   Thread.sleep(2000);
 	   aadhar_image(Aadhar_Image);
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
