package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Add_Package_of_Practice_PO {
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

   @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[4]")
   WebElement Crops_Details;
   
   @FindBy(how= How.XPATH, using ="//a[text()='Package of Practices']")
   WebElement Package_of_Pratice;
   
   @FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[1]")
   WebElement Show_Details;
   
   @FindBy(how= How.XPATH, using="//a[@type='submit']")
   WebElement Add_Package;
   
   @FindBy(how= How.XPATH, using="//input[@id='pop_name'] ")
   WebElement Package_Name;
   
   @FindBy(how= How.XPATH, using="//textarea[@id='description']")
   WebElement Description;
   
   @FindBy (how= How.XPATH, using="//i[@type='button']")
   WebElement Add_Steps;
   
   @FindBy(how= How.XPATH, using="//input[@id='popStep_name_1']")
   WebElement Step_Name;
   
   @FindBy(how= How.XPATH, using="//input[@id='durationofStep_1']")
   WebElement Duration;
   
   @FindBy(how= How.XPATH, using="//textarea[@id='descriptionofStep_1']")
   WebElement Step_Description;
   
   @FindBy(how= How.XPATH, using="//button[@onclick='return add()']")
   WebElement Add;
   
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
  	public void Crops_Details()
      {
  		Crops_Details.click();
  		ExtentReport.test.log(LogStatus.INFO, "Click on Crops Option", "Clicked");
      }
      public void Package_of_Pratice()
      {
    	  Package_of_Pratice.click();
      	ExtentReport.test.log(LogStatus.INFO, "Click on Package_of_Pratice", "Clicked");
      }
      public void Show_Details()
      {
    	  Show_Details.click();
      	ExtentReport.test.log(LogStatus.INFO, "Clicked on Show_Details Button", "Clicked");
      }
      public void Add_package()
      {
    	  Add_Package.click();
    	  ExtentReport.test.log(LogStatus.INFO,"Clicked on Add Package","Clicked");
      }
     public void Package_Name(String args)
     {
    	 Package_Name.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter package Name as ", args);
     }
     public void Description(String args)
     {
    	 Description.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Description as ", args);
     }
     public void Add_Steps( )
     {
    	 Add_Steps.click();
  	   ExtentReport.test.log(LogStatus.INFO, "Clicked on Add Steps ", "Clicked");
     }
     public void Step_Name (String args)
     {
    	 Step_Name.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Step_Name as", args);
     }
     public void Duration (String args)
     {
    	 Duration.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Duration as", args);
     }
     public void Step_Description (String args)
     {
    	 Step_Description.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Step_Description as", args);
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
   public void Add_POP_with_ValidData(String txt_AdminEmail,String EnterPassword,String Package_Name,String Description,String Step_Name,String Duration,String Step_Description) throws InterruptedException
   {
	   txt_AdminEmail(txt_AdminEmail);
	   Thread.sleep(2000);
	   EnterPassword(EnterPassword);
	   Thread.sleep(2000);
	   ClickLogin();
	   Thread.sleep(2000);
	   Crops_Details();
	   Thread.sleep(2000);
	   Package_of_Pratice();
	   Thread.sleep(2000);
	   Show_Details();
	   Thread.sleep(2000);
	   Add_package();
	   Thread.sleep(2000);
	   Package_Name(Package_Name);
	   Thread.sleep(2000);
	   Description(Description);
	   Thread.sleep(2000);
	   Add_Steps();
	   Thread.sleep(2000);
	   Step_Name(Step_Name);
	   Thread.sleep(2000);
	   Duration(Duration);
	   Thread.sleep(2000);
	   Step_Description(Step_Description);
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
