package PO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.LogStatus;
import ExtentReport.ExtentReport;

public class Add_YeildDeliveryDetails_PO {

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

@FindBy(how= How.XPATH, using="(//a[@class='btn btn-success'])[4]")
WebElement Show_Yeild_delivery_Details;

@FindBy(how= How.XPATH, using="//a[@type='submit']")
WebElement Add_Yeild_Delivery_Details;

@FindBy(how= How.XPATH, using="//select[@id='crop_type']")
WebElement Select_Crop;

@FindBy (how= How.XPATH, using="//input[@id='gross_weight'] ")
WebElement Gross_Weight;

@FindBy(how= How.XPATH, using="//input[@id='tare_weight']")
WebElement Tare_Weight;

@FindBy(how= How.XPATH, using="//input[@id='profile_image']")
WebElement Image;

@FindBy(how= How.XPATH, using="//input[@id='name']")
WebElement Driver_Name;

@FindBy(how= How.XPATH, using="//input[@id='mobile']")
WebElement Driver_Number;

@FindBy(how= How.XPATH, using="//input[@id='vehicle_no']")
WebElement Vehicle_Number;

@FindBy(how= How.XPATH, using="//input[@id='pickup_date']")
WebElement Date_Pickup;

@FindBy(how= How.XPATH, using="//input[@id='charges1']")
WebElement Charge1;

@FindBy(how= How.XPATH, using="//input[@id=charges21']")
WebElement Charge2;

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
public void Show_Yeild_delivery_Details()
{
	Show_Yeild_delivery_Details.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Show Yeild Delivery Details", "Clicked");
}
public void Add_Yeild_Delivery_Details()
{
	Add_Yeild_Delivery_Details.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Add_Yeild_Delivery_Details", "Clicked");
}
public void Select_Crop(String args)
{
	Select_Crop.sendKeys(args);
	   Select se = new Select(Select_Crop);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Crop as", args);
}
public void Gross_Weight(String args)
{
	Gross_Weight.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Gross_Weight as ",args);
}
public void Tare_Weight (String args)
{
	Tare_Weight.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Enter the Tare_Weight as", args);
}
public void Image (String args)
{
	Image.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Upload the Weight Image as", args);
}
public void Driver_Name (String args)
{
	Driver_Name.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Entered the Driver Name", args);
}
public void Vehicle_Number (String args)
{
	Vehicle_Number.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Entered the Vehicle Number as", args);
}
public void Date_Pickup ( String args)
{
	Date_Pickup.click();
	 ExtentReport.test.log(LogStatus.INFO, "Entered the Pickup Date", args);
}
public void Charge1(String args)
{
	Charge1.click();
	 ExtentReport.test.log(LogStatus.INFO, "Entered the Charges One ", args);
}
public void Charge2 (String args)
{
	   Charge2.sendKeys(args);
	  ExtentReport.test.log(LogStatus.INFO, "Entered the Charges Two", args);
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
public void Add_YeildDeliveryDetails_with_ValidData(String loginEmail, String loginPassword,String Select_Crop,String Gross_Weight,String Tare_Weight,String Image,String Driver_Name,String Vehicle_Number,String Date_Pickup,String Charge1,String Charge2) throws InterruptedException
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
	   Show_Yeild_delivery_Details();
	   Thread.sleep(2000);
	   Add_Yeild_Delivery_Details();
	   Thread.sleep(2000);
	   Select_Crop(Select_Crop);
	   Thread.sleep(2000);
	   Gross_Weight(Gross_Weight);
	   Thread.sleep(2000);
	   Tare_Weight(Tare_Weight);
	   Thread.sleep(2000);
	   Image(Image);
	   Thread.sleep(2000);
	   Driver_Name(Driver_Name);
	   Thread.sleep(2000);
	   Vehicle_Number(Vehicle_Number);
	   Thread.sleep(2000);
	   Date_Pickup(Date_Pickup);
	   Thread.sleep(2000);
	   Charge1(Charge1);
	   Thread.sleep(2000);
	   Charge2(Charge2);
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
