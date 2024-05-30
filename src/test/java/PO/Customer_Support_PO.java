package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import ExtentReport.ExtentReport;

public class Customer_Support_PO {

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

@FindBy(how= How.XPATH, using ="//a[text()='Customer Support ']")
WebElement Customer_Support;

@FindBy(how= How.XPATH, using="(//a[@title='View!'])[1] ")
WebElement View;

@FindBy(how= How.XPATH, using="//a[@type='submit']")
WebElement Update_Ticket_Status;

@FindBy(how= How.XPATH, using="//input[@id='staff_remarks']")
WebElement Staff_Remark;

@FindBy(how= How.XPATH, using="//select[@id='status']")
WebElement Status;

@FindBy(how= How.XPATH, using="//button[@onclick='update()']")
WebElement Update;

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
	public void Customer_Support()
{
		Customer_Support.click();
		 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Customer_Support Option", "Clicked");
}
public void View()
{
	View.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the View Option", "Clicked");
}
public void Update_Ticket_Status()
{
	Update_Ticket_Status.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Update_Ticket_Status", "Clicked");
}
public void Staff_Remark(String args)
{
	Staff_Remark.sendKeys(args);
	 ExtentReport.test.log(LogStatus.INFO, "Enter Staff Remark as ", "Clicked");
}

public void Status (String args)
{
	Status.sendKeys(args);
	   Select se = new Select(Status);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select the Status as", args);
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
public void update_Customer_Support_with_ValidData(String loginEmail, String loginPassword,String Staff_Remark,String Status) throws InterruptedException
{
	   
	   EnterEmail(loginEmail);
	   Thread.sleep(2000);
	   EnterPassword(loginPassword);
	   Thread.sleep(2000);
	   ClickLogin();
	   Thread.sleep(2000);
	   Customer_Support();
	   Thread.sleep(2000);
	   View();
	   Thread.sleep(2000);
	   Update_Ticket_Status();
	   Thread.sleep(2000);
	   Staff_Remark(Staff_Remark);
	   Thread.sleep(2000);
	   Status(Status);
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
