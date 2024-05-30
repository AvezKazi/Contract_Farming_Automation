package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Update_Subadmin_PO {
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
	        
	        @FindBy(how= How.XPATH, using ="//a[text()='Subadmins']")
	        WebElement Subadmin;
	        
	        @FindBy(how= How.XPATH, using="(//a[@class='fa-solid fa-pen-to-square fa-2xl text-blue'])[2]")
	        WebElement Update_button;
	        
	        @FindBy(how= How.XPATH, using="//input[@id='name']")
	        WebElement Name;
	        
	        @FindBy (how= How.XPATH, using="//input[@id='mobile']")
	        WebElement Mobile;
	        
	        @FindBy(how= How.XPATH, using="//input[@id='email']")
	        WebElement Email;
	        
	        @FindBy(how= How.XPATH, using="//textarea[@id='subadmin_address']")
	        WebElement Address;
	        
	        @FindBy(how= How.XPATH, using="//button[@onclick='return edit()']")
	        WebElement Add;
	        
	        @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
	        WebElement Click_YES;
	        
	        @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
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
	    		ExtentReport.test.log(LogStatus.INFO, "Clicked on Login Button", "Clicked");
	    	}
	    	public void Members()
	        {
	    		Members.click();
	    		ExtentReport.test.log(LogStatus.INFO, "Clicked on Members Option", "Clicked");
	        }
	        public void Subadmin()
	        {
	        	Subadmin.click();
	        	ExtentReport.test.log(LogStatus.INFO, "Clicked on Subadmin", "Clicked");
	        }
	        public void Update_button()
	        {
	        	Update_button.click();
	        	ExtentReport.test.log(LogStatus.INFO, "Clicked on Update button", "Clicked");
	        }
	       public void Name(String args)
	       {
	    	   Name.clear();
	    	   Name.sendKeys(args);
	    	   ExtentReport.test.log(LogStatus.INFO, "Enter the Name as ", args);
	       }
	       public void Mobile(String args)
	       {
	    	   Mobile.clear();
	    	   Mobile.sendKeys(args);
	    	   ExtentReport.test.log(LogStatus.INFO, "Enter the Mobile Number as ", args);
	       }
	       public void Email (String args)
	       {
	    	   Email.clear();
	    	   Email.sendKeys(args);
	    	   ExtentReport.test.log(LogStatus.INFO, "Enter the Email Id as", args);
	       }
	       public void Address (String args)
	       {
	    	   Address.clear();
	    	   Address.sendKeys(args);
	    	   ExtentReport.test.log(LogStatus.INFO, "Enter the Address as", args);
	       }

	       public void Add()
	       {
	    	   Add.click(); 
	    	   ExtentReport.test.log(LogStatus.INFO, "Clicked on Add Button", "Clicked");
	       }
	       public void Yes()
	       {
	    	   Click_YES.click(); 
	    	   ExtentReport.test.log(LogStatus.INFO, "Clicked on YES Button", "Clicked");
	       }
	       public void Ok()
	       {
	    	   Click_OK.click(); 
	    	   ExtentReport.test.log(LogStatus.INFO, "Clicked on OK button", "Clicked");
	       }
	       public void Update_Subadmins_with_ValidData(String loginEmail, String loginPassword,String Name,String Mobile,String Email,String Address) throws InterruptedException
	       {
	    	   
	    	   EnterEmail(loginEmail);
	    	   Thread.sleep(2000);
	    	   EnterPassword(loginPassword);
	    	   Thread.sleep(2000);
	    	   ClickLogin();
	    	   Thread.sleep(2000);
	    	   Members();
	    	   Thread.sleep(2000);
	    	   Subadmin();
	    	   Thread.sleep(2000);
	    	   Update_button();
	    	   Thread.sleep(2000);
	    	   Name(Name);
	    	   Thread.sleep(2000);
	    	   Mobile(Mobile);
	    	   Thread.sleep(2000);
	    	   Email(Email);
	    	   Thread.sleep(2000);
	    	   Address(Address);
	    	   Thread.sleep(2000);
	    	   Add();
	    	   Thread.sleep(2000);
	    	   Yes();
	    	   Thread.sleep(2000);
	    	   Ok();
	    	   Thread.sleep(2000);
	    	   driver.close();
}}
