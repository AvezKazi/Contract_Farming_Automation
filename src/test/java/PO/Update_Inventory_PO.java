package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.relevantcodes.extentreports.LogStatus;
import ExtentReport.ExtentReport;

public class Update_Inventory_PO {

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

@FindBy(how= How.XPATH, using="//input[@id='instock_quantity86']")
WebElement Quantity;

@FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[1]")
WebElement Update;

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

public void Quantity (String args)
{
	Quantity.clear();
	Quantity.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Quantity as", args);
}

public void Update()
{
	   Update.click(); 
	  ExtentReport.test.log(LogStatus.INFO, "Clicked on Update Button", "Clicked");
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
public void Update_VendorStock_with_ValidData(String loginEmail, String loginPassword,String Quantity) throws InterruptedException
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
	   Quantity(Quantity);
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

