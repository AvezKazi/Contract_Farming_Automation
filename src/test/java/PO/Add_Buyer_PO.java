package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import com.relevantcodes.extentreports.LogStatus;
import ExtentReport.ExtentReport;

public class Add_Buyer_PO {
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
  
  @FindBy(how= How.XPATH, using ="//a[text()='Buyers']")
  WebElement Buyer;
  
  @FindBy(how= How.XPATH, using="(//a[@type='submit'])[2]")
  WebElement Add_Buyer;
  
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

  @FindBy(how= How.XPATH, using="//button[@onclick='return add()']")
  WebElement Add;
  
  @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
  WebElement Click_YES;
  
  @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
  WebElement Click_OK;
  
  public String verifytitle()
  {
  String MyTitle = driver.getTitle();
  System.out.println("My Page Title  = "+MyTitle);
  return MyTitle;
  }
 
  public void EnterEmail (String args)
	{
		txt_AdminEmail.sendKeys(args);
		ExtentReport.test.log(LogStatus.INFO, "Enter the Email id", args);
	}
	public void EnterPassword (String args)
	{
		txt_AdminPassword.sendKeys(args);
		ExtentReport.test.log(LogStatus.INFO, "Enter the Password", args);
	}
	public void ClickLogin ()
	{
		Btn_Login.click();
		ExtentReport.test.log(LogStatus.INFO, "Clicked on Login Button", "Btn_Login");
	}
	public void Members()
  {
		Members.click();
		ExtentReport.test.log(LogStatus.INFO, "Clicked on Members", "Cliked");
  }
  public void Buyer()
  {
 	 Buyer.click();
 	ExtentReport.test.log(LogStatus.INFO, "Cliked on Buyers", "Cliked");
  }
  public void Add_Buyer()
  {
 	 Add_Buyer.click();
 	ExtentReport.test.log(LogStatus.INFO, "Cliked on Add Buyer", "Cliked");
  }
 public void Name(String args)
 {
	   Name.sendKeys(args);
	   ExtentReport.test.log(LogStatus.INFO, "Enter the Name", args);
 }
 public void Mobile(String args)
 {
	   Mobile.sendKeys(args);
	   ExtentReport.test.log(LogStatus.INFO, "Enter the Mobile Number", args);
 }
 public void Email (String args)
 {
	   Email.sendKeys(args);
	   ExtentReport.test.log(LogStatus.INFO, "Enter the Email id", args);
 }
 public void Address (String args)
 {
	   Address.sendKeys(args);
	   ExtentReport.test.log(LogStatus.INFO, "Enter the Address", args);
 }
 public void GST_Number (String args)
 {
 	GST_Number.sendKeys(args);
 	ExtentReport.test.log(LogStatus.INFO, "Enter the GST Number", args);
 }
 
 public void Add()
 {
	   Add.click(); 
	   ExtentReport.test.log(LogStatus.INFO, "Clicked on Add Button", "Clicked");
 }
 public void Yes()
 {
	   Click_YES.click(); 
	   ExtentReport.test.log(LogStatus.INFO, "Cliked on YES Button", "Click_YES");
 }
 public void Ok()
 {
	   Click_OK.click(); 
	   ExtentReport.test.log(LogStatus.INFO, "Cliked on OK Button", "Click_OK");
 }
 public void Add_Buyer(String loginEmail, String loginPassword,String Name,String Mobile,String Email,String Address,String GST_Number) throws InterruptedException
 {
	 try {
		 
	 
	   EnterEmail(loginEmail);
	   Thread.sleep(2000);
	   EnterPassword(loginPassword);
	   Thread.sleep(2000);
	   ClickLogin();
	   Thread.sleep(2000);
	   Members();
	   Thread.sleep(2000);
	   Buyer();
	   Thread.sleep(2000);
	   Add_Buyer();
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
	   Add();
	   Thread.sleep(2000);
	   Yes();
	   Thread.sleep(2000);
	   Ok();
	   Thread.sleep(2000);
	   verifytitle();
	   Assert.assertEquals("verifytitle", true);
	   System.out.print("MyTitle");
		}
	catch(Exception e) {
		e.printStackTrace();	
		   driver.close();
	}
	 driver.close();
   }
	     	   		    	   
}



