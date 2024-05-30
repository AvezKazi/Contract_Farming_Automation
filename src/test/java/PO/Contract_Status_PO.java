package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.relevantcodes.extentreports.LogStatus;
import ExtentReport.ExtentReport;

public class Contract_Status_PO {
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
   
   @FindBy(how= How.XPATH, using="(//a[@class='btn btn-outline-danger text-white'])[1]")
   WebElement Contract_Status;
   
   @FindBy(how= How.XPATH, using=" //button[@id='started']")
   WebElement Change_Status;
  
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
      public void Contract_Status()
      {
    	  Contract_Status.click();
      	ExtentReport.test.log(LogStatus.INFO, "Clicked on Contract_Status Button", "Clicked");
      }
      public void Change_Status()
      {
    	  Contract_Status.click();
      	ExtentReport.test.log(LogStatus.INFO, "Select the status ","Clicked");
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
   public void Change_Contract_Status(String txt_AdminEmail,String EnterPassword) throws InterruptedException
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
	   Contract_Status();
	   Thread.sleep(2000);
	   Change_Status();
	   Thread.sleep(2000);
	   Yes();
	   Thread.sleep(2000);
	   Ok();
	   Thread.sleep(2000);
	   driver.close();	   	   
   }
}

