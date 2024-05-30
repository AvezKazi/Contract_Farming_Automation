package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Add_Farmer_BankDetails_PO {

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

@FindBy(how= How.XPATH, using ="//a[text()='Farmers']")
WebElement Farmers;

@FindBy(how= How.XPATH, using="(//a[@title='View Bank Details !'])[1]")
WebElement View_Bank_Details;

@FindBy(how= How.XPATH, using="//a[@type='submit']")
WebElement Add_Bank_Details;


@FindBy(how= How.XPATH, using="//input[@id='account_holder_name']")
WebElement Account_Holder_Name;

@FindBy (how= How.XPATH, using="//input[@id='bank_account_number']")
WebElement Account_Number;

@FindBy(how= How.XPATH, using="//input[@id='re_bank_account_number']")
WebElement Reenter_AccountNumber;

@FindBy(how= How.XPATH, using="//input[@id='bank_name']")
WebElement Bank_Name;

@FindBy(how= How.XPATH, using="//input[@id='bank_branch']")
WebElement Bank_Branch;

@FindBy(how= How.XPATH, using="//input[@id='branch_address']")
WebElement Branch_Address;

@FindBy(how= How.XPATH, using="//input[@id='bank_ifsc_code']")
WebElement IFSC_Code;

@FindBy(how= How.XPATH, using="//input[@id='image']")
WebElement Cheque_Image;

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
public void Farmer()
{
	 Farmers.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Farmers Option", "Clicked");
}
public void View_Bank_Details()
{
	 View_Bank_Details.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the View Vendor Bank Details", "Clicked");
}
public void Add_Bank_Details()
{
	 Add_Bank_Details.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Add Bank Details", "Clicked");
}
public void Account_Holder_Name(String args)
{
	Account_Holder_Name.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Account Holder Name as", args);
}
public void Account_Number(String args)
{
	Account_Number.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Account Number as", args);
}
public void Reenter_AccountNumber (String args)
{
	Reenter_AccountNumber.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Re Enter Account Number Id as", args);
}
public void Bank_Name (String args)
{
	Bank_Name.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Bank_Name as", args);
}
public void Bank_Branch (String args)
{
	Bank_Branch.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Enter the Bank_Branch name as", args);
}
public void Branch_Address (String args)
{
	Branch_Address.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Enter the Branch_Address as", args);
}
public void IFSC_Code (String args)
{
	IFSC_Code.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Enter the  Bank IFSC Code as", args);
}
public void Cheque_Image (String args)
{
	Cheque_Image.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Upload the Image as ", args);
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
public void Add_Farmers_BankDetails_with_ValidData(String loginEmail, String loginPassword,String Account_Holder_Name,String Account_Number,String Re_Enter_AccountNUmber,String Bank_Name,String Bank_Branch,String Branch_Address,String IFSC_Code,String Cheque_Image) throws InterruptedException
{
	   
	   EnterEmail(loginEmail);
	   Thread.sleep(2000);
	   EnterPassword(loginPassword);
	   Thread.sleep(2000);
	   ClickLogin();
	   Thread.sleep(2000);
	   Members();
	   Thread.sleep(2000);
	   Farmer();
	   Thread.sleep(2000);
	   View_Bank_Details();
	   Thread.sleep(2000);
	   Add_Bank_Details();
	   Thread.sleep(2000);
	   Account_Holder_Name(Account_Holder_Name);
	   Thread.sleep(2000);
	   Account_Number(Account_Number);
	   Thread.sleep(2000);
	   Reenter_AccountNumber(Re_Enter_AccountNUmber);
	   Thread.sleep(2000);
	   Bank_Name(Bank_Name);
	   Thread.sleep(2000);
	   Bank_Branch(Bank_Branch);
	   Thread.sleep(2000);
	   Branch_Address(Branch_Address);
	   Thread.sleep(2000);
	   IFSC_Code(IFSC_Code);
	   Thread.sleep(2000);
	   Cheque_Image(Cheque_Image);
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

