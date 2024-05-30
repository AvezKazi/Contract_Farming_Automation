package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Add_Customize_Condition_For_Contract_PO {

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
   
   @FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[3]")
   WebElement View_Condition;
   
   @FindBy(how= How.XPATH, using="//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")
   WebElement Add_Customize_Condition;
   
   @FindBy(how= How.XPATH, using="//select[@id='category']")
   WebElement Select_Contract_Category;
   
   @FindBy(how= How.XPATH, using="//textarea[@id='name']")
   WebElement Enter_Points;
   
   @FindBy (how= How.XPATH, using="//input[@id='image']")
   WebElement Image;
   
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
      public void View_Condition()
      {
    	  View_Condition.click();
      	ExtentReport.test.log(LogStatus.INFO, "Clicked on View_Condition Button", "Clicked");
      }
      public void Add_Customize_Condition()
      {
    	  Add_Customize_Condition.click();
      	ExtentReport.test.log(LogStatus.INFO, "Clicked on Add Customize Condition Button", "Clicked");
      }
      public void Select_Contract_Category(String args)
      {
    	  Select_Contract_Category.sendKeys(args);
   	   Select se = new Select(Select_Contract_Category);
   	   se.selectByVisibleText(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Select_Contract_Category as", args);
      }
      public void Enter_Points(String args)
      {
    	  Enter_Points.sendKeys(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Enter the condition point as", args);
      }
      public void Image(String args)
      {
    	  Image.sendKeys(args);
   	  ExtentReport.test.log(LogStatus.INFO, "Upload the Image", args);
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
   public void Add_Customize_Condition_with_ValidData(String txt_AdminEmail,String EnterPassword,String Select_Contract_Category,String Enter_Points,String Image) throws InterruptedException
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
	   View_Condition();
	   Thread.sleep(2000);
	   Add_Customize_Condition();
	   Thread.sleep(2000);
	   Select_Contract_Category(Select_Contract_Category);
	   Thread.sleep(2000);
	   Enter_Points(Enter_Points);
	   Thread.sleep(2000);
	   Image(Image);
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
	



