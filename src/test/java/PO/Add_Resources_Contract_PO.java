package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Add_Resources_Contract_PO {

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

@FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[3]")
WebElement Contract;

@FindBy(how= How.XPATH, using ="//a[text()='Contract Details']")
WebElement Contract_Details;

@FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[2]")
WebElement View_Resources;

@FindBy(how= How.XPATH, using="//a[@type='submit']")
WebElement Add_Resources;

@FindBy(how= How.XPATH, using="//select[@id='resource_type']")
WebElement Select_Resource_Type;

@FindBy(how= How.XPATH, using="//select[@id='resource_id']")
WebElement Resource_Name;

@FindBy(how= How.XPATH, using="//input[@id='quantity_1']")
WebElement Quantity;

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
	public void Contract()
{
		Contract.click();
		 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Contract Option", "Clicked");
}
public void Contract_Details()
{
	 Contract_Details.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Contract Details Option", "Clicked");
}
public void View_Resources()
{
	View_Resources.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the View Resources", "Clicked");
}
public void Add_Resources()
{
	Add_Resources.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Add Resources", "Clicked");
}

public void Select_Resource_Type (String args)
{
	Select_Resource_Type.sendKeys(args);
	   Select se = new Select(Select_Resource_Type);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Resources Type as", args);
}
public void Resource_Name (String args)
{
	Resource_Name.sendKeys(args);
	   Select se = new Select(Resource_Name);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Resource Name as", args);
}
public void Quantity (String args)
{
	Quantity.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Enter the Quantity as ", args);
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
public void Add_Resources_with_ValidData(String loginEmail, String loginPassword,String Select_Resource_Type,String Resource_Name,String Quantity) throws InterruptedException
{
	   
	   EnterEmail(loginEmail);
	   Thread.sleep(2000);
	   EnterPassword(loginPassword);
	   Thread.sleep(2000);
	   ClickLogin();
	   Thread.sleep(2000);
	   Contract();
	   Thread.sleep(2000);
	   Contract_Details();
	   Thread.sleep(2000);
	   View_Resources();
	   Thread.sleep(2000);
	   Add_Resources();
	   Thread.sleep(2000);
	   Select_Resource_Type(Select_Resource_Type);
	   Thread.sleep(2000);
	   Resource_Name(Resource_Name);
	   Thread.sleep(2000);
	   Quantity(Quantity);
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


