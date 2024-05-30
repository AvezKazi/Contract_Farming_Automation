package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Add_Vendor_Stock_PO {

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

@FindBy(how= How.XPATH, using ="//a[text()='Inventory']")
WebElement Inventory;

@FindBy(how= How.XPATH, using="//a[@class='btn btn-success float-right']")
WebElement Vendor_Inventory;

@FindBy(how= How.XPATH, using="//a[@data-toggle='modal']")
WebElement Add_Vendor_Stock;

@FindBy(how= How.XPATH, using="//select[@id='vendor']")
WebElement Select_Vendor;

@FindBy (how= How.XPATH, using="//select[@id='resource_type']")
WebElement Select_Resource_Type;

@FindBy (how= How.XPATH, using="//select[@id='resource']")
WebElement Resource;

@FindBy(how= How.XPATH, using="//input[@id='quantity']")
WebElement Quantity;

@FindBy(how= How.XPATH, using="//input[@id='price']")
WebElement price;

@FindBy(how= How.XPATH, using="//button[@onclick='saveInventory()']")
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
public void Inventory()
{
	Inventory.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Inventory Option", "Clicked");
}
public void Vendor_Inventory()
{
	Vendor_Inventory.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on Vendor Inventory", "Clicked");
}
public void Add_Vendor_Stock()
{
	Add_Vendor_Stock.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Add Vendor stock as ", "Clicked");
}
public void Select_Vendor(String args)
{
	Select_Vendor.sendKeys(args);
	   Select se = new Select(Select_Vendor);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Vendor as", args);
}
public void Select_Resource_Type(String args)
{
	Select_Resource_Type.sendKeys(args);
	   Select se = new Select(Select_Resource_Type);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Resource Type as", args);
}
public void Resource(String args)
{
	Resource.sendKeys(args);
	   Select se = new Select(Resource);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Resource as", args);
}
public void Quantity (String args)
{
	Quantity.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Quantity as", args);
}
public void price (String args)
{
	price.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Price as", args);
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
public void Add_VendorStock_with_ValidData(String loginEmail, String loginPassword,String Select_Vendor,String Select_Resource_Type,String Resource,String Quantity,String price) throws InterruptedException
{
	   
	   EnterEmail(loginEmail);
	   Thread.sleep(2000);
	   EnterPassword(loginPassword);
	   Thread.sleep(2000);
	   ClickLogin();
	   Thread.sleep(2000);
	   Contract();
	   Thread.sleep(2000);
	   Inventory();
	   Thread.sleep(2000);
	   Vendor_Inventory();
	   Thread.sleep(2000);
	   Add_Vendor_Stock();
	   Thread.sleep(2000);
	   Select_Vendor(Select_Vendor);
	   Thread.sleep(2000);
	   Select_Resource_Type(Select_Resource_Type);
	   Thread.sleep(2000);
	   Resource(Resource);
	   Thread.sleep(2000);
	   Quantity(Quantity);
	   Thread.sleep(2000);
	   price(price);
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
