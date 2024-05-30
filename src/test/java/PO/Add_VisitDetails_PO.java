package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Add_VisitDetails_PO {

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

@FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[5]")
WebElement View_Visit_Details;

@FindBy(how= How.XPATH, using="//a[@type='submit']")
WebElement Add_Visit;

@FindBy(how= How.XPATH, using="//input[@id='visit_date']")
WebElement Visit_Date;

@FindBy (how= How.XPATH, using="//select[@id='comment'] ")
WebElement Harvest_Status;

@FindBy(how= How.XPATH, using="//input[@id='crop_condition']")
WebElement Remarks;

@FindBy(how= How.XPATH, using="//input[@id='expected_yield']")
WebElement Expected_Yield;

@FindBy(how= How.XPATH, using="//input[@id='image1']")
WebElement Image;

@FindBy(how= How.XPATH, using="//input[@id='image2']")
WebElement Image_2;

@FindBy(how= How.XPATH, using="//input[@type='checkbox']")
WebElement Mortality;

@FindBy(how= How.XPATH, using="//i[@id='addDiv']")
WebElement Add_resource;

@FindBy(how= How.XPATH, using="//select[@id='r1']")
WebElement Select_Resource;

@FindBy(how= How.XPATH, using="//select[@id='1']")
WebElement Resource_Name;

@FindBy(how= How.XPATH, using="//input[@id='quantity_1']")
WebElement Quantity;

@FindBy(how= How.XPATH, using="//input[@id='total_1']")
WebElement Sub_Total;

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
public void View_Visit_Details()
{
	View_Visit_Details.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the View Visit Details", "Clicked");
}
public void Add_Visit()
{
	Add_Visit.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Add Visit", "Clicked");
}
public void Visit_Date(String args)
{
	Visit_Date.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Visit Date as", args);
}
public void Harvest_Status(String args)
{
	Harvest_Status.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Harvest Status as ",args);
}
public void Remarks (String args)
{
	Remarks.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Remark as", args);
}
public void Expected_Yield (String args)
{
	Expected_Yield.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Expected Yeild as", args);
}
public void Image (String args)
{
	Image.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Upload the First Image as", args);
}
public void Image_2 (String args)
{
	Image_2.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Upload the Secound Image as", args);
}
public void Mortality ( )
{
	Mortality.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on Mortality", "Clicked");
}
public void Add_resource()
{
	Add_resource.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on Add Resources Button ", "Clicked");
}
public void Select_Resource (String args)
{
	Select_Resource.sendKeys(args);
	   Select se = new Select(Select_Resource);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Resources as", args);
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
public void Sub_Total ()
{
	Sub_Total.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on Sub_Total Button ", "Clicked");
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
public void Add_visitDetails_with_ValidData(String loginEmail, String loginPassword,String Visit_Date,String Harvest_Status,String Remarks,String Expected_Yield,String Image,String Image_2,String Select_Resource,String Resource_Name,String Quantity) throws InterruptedException
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
	   View_Visit_Details();
	   Thread.sleep(2000);
	   Add_Visit();
	   Thread.sleep(2000);
	   Visit_Date(Visit_Date);
	   Thread.sleep(2000);
	   Harvest_Status(Harvest_Status);
	   Thread.sleep(2000);
	   Remarks(Remarks);
	   Thread.sleep(2000);
	   Expected_Yield(Expected_Yield);
	   Thread.sleep(2000);
	   Image(Image);
	   Thread.sleep(2000);
	   Image_2(Image_2);
	   Thread.sleep(2000);
	   Mortality();
	   Thread.sleep(2000);
	   Add_resource();
	   Thread.sleep(2000);
	   Select_Resource(Select_Resource);
	   Thread.sleep(2000);
	   Resource_Name(Resource_Name);
	   Thread.sleep(2000);
	   Quantity(Quantity);
	   Thread.sleep(2000);
	   Sub_Total();
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

