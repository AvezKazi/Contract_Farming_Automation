package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Update_Farmer_OtherExpense_PO {

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

@FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[6]")
WebElement View_Details;

@FindBy(how= How.XPATH, using="//a[@class='fa-solid fa-pen-to-square fa-2xl text-blue'] ")
WebElement Update_Expenses;


@FindBy(how= How.XPATH, using="//input[@id='date']")
WebElement Date;

@FindBy (how= How.XPATH, using="//select[@id='category'] ")
WebElement Select_Category;

@FindBy(how= How.XPATH, using="//input[@id='expenses_name']")
WebElement Expense_Name;

@FindBy(how= How.XPATH, using="//input[@id='quantity']")
WebElement Quantity;

@FindBy(how= How.XPATH, using="//input[@id='total_amount']")
WebElement Total_Amount;

@FindBy(how= How.XPATH, using="//textarea[@id='remark']")
WebElement Remark;

@FindBy(how= How.XPATH, using="//input[@id='bill_image']")
WebElement Bill_Image;

@FindBy(how= How.XPATH, using="//select[@id='verification_status']")
WebElement Verification_Status;

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
public void View_Details()
{
	View_Details.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the View Details", "Clicked");
}
public void Update_Expenses()
{
	Update_Expenses.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Update Expense", "Clicked");
}
public void Date(String args)
{
	Date.clear();
	Date.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Date as", args);
}
public void Select_Category(String args)
{
	Select_Category.clear();
	   Select_Category.sendKeys(args);
	   Select se = new Select(Select_Category);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Category as", args);
}
public void Expense_Name (String args)
{
	Expense_Name.clear();
	Expense_Name.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Expense Name as", args);
}
public void Quantity (String args)
{
	Quantity.click();
	Quantity.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Quantity as", args);
}
public void Total_Amount (String args)
{
	Total_Amount.clear();
	Total_Amount.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Enter the Total_Amount as", args);
}
public void Remark (String args)
{
	Remark.clear();
	Remark.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Enter the Remark as", args);
}
public void Bill_Image (String args)
{
	Bill_Image.clear();
	Bill_Image.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Upload the Bill Image as", args);
}
public void Verification_Status (String args)
{
	Verification_Status.clear();
	Verification_Status.sendKeys(args);
	   Select se = new Select(Verification_Status);
	   se.selectByVisibleText(args);
	 ExtentReport.test.log(LogStatus.INFO, "Select the Verification Status ", args);
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
public void Update_Farmers_OtherExpense_with_ValidData(String loginEmail, String loginPassword,String Date,String Select_Category,String Expense_Name,String Quantity,String Total_Amount,String Remark,String Bill_Image,String Verification_Status) throws InterruptedException
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
	   View_Details();
	   Thread.sleep(2000);
	   Update_Expenses();
	   Thread.sleep(2000);
	   Date(Date);
	   Thread.sleep(2000);
	   Select_Category(Select_Category);
	   Thread.sleep(2000);
	   Expense_Name(Expense_Name);
	   Thread.sleep(2000);
	   Quantity(Quantity);
	   Thread.sleep(2000);
	   Total_Amount(Total_Amount);
	   Thread.sleep(2000);
	   Remark(Remark);
	   Thread.sleep(2000);
	   Bill_Image(Bill_Image);
	   Thread.sleep(2000);
	   Verification_Status(Verification_Status);
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
