package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.relevantcodes.extentreports.LogStatus;
import ExtentReport.ExtentReport;

public class Add_SubSteps_POP_PO {

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
   
   @FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[1]")
   WebElement Show_Steps;
   
   @FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[1] ")
   WebElement View_Sub_Step;
   
   @FindBy(how= How.XPATH, using="//textarea[@id='popname_0']")
   WebElement Name;
    
   @FindBy(how= How.XPATH, using="//textarea[@id='popDetails_0']")
   WebElement Details;
   
   @FindBy(how= How.XPATH, using="//input[@id='subStep_sequence_0']")
   WebElement Sequence;
   
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
      public void Show_Steps()
      {
    	  Show_Steps.click();
    	  ExtentReport.test.log(LogStatus.INFO,"Clicked on Show_Steps","Clicked");
      }
     public void View_Sub_Step()
     {
    	 View_Sub_Step.click();
  	   ExtentReport.test.log(LogStatus.INFO, "Clicked on View Sub Steps ", "Clicked");
     }
     public void Name(String args)
     {
    	 Name.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Name as ", args);
     }
     public void Details(String args )
     {
    	 Details.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Details as ", "Clicked");
     }
     public void Sequence (String args)
     {
    	 Sequence.sendKeys(args);
  	   ExtentReport.test.log(LogStatus.INFO, "Enter the Sequence as", args);
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
   public void Add_SubStep_with_ValidData(String txt_AdminEmail,String EnterPassword,String Name,String Details,String Sequence) throws InterruptedException
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
	   Show_Steps();
	   Thread.sleep(2000);
	   View_Sub_Step();
	   Thread.sleep(2000);
	   Name(Name);
	   Thread.sleep(2000);
	   Details(Details);
	   Thread.sleep(2000);
	   Sequence(Sequence);
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
