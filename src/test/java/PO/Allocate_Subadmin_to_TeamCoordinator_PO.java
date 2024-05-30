package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.LogStatus;
import ExtentReport.ExtentReport;

public class Allocate_Subadmin_to_TeamCoordinator_PO {

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

@FindBy(how= How.XPATH, using ="//a[text()='Team Coordinator']")
WebElement Team_Coordinator;

@FindBy(how= How.XPATH, using="(//a[@type='submit'] )[2]")
WebElement Allocate_Subadmin;

@FindBy(how= How.XPATH, using="//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")
WebElement Allocate_Subadmin_to_Coordinator;


@FindBy(how= How.XPATH, using="//select[@id='subadmin_id']")
WebElement Select_Subadmin;

@FindBy (how= How.XPATH, using="(//input[@type='checkbox'])[1] ")
WebElement Select_TeamCoordinator;


@FindBy(how= How.XPATH, using="//button[@class=' btn btn-outline-primary float-right']")
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
public void Team_Coordinator()
{
	Team_Coordinator.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Team_Coordinator Option", "Clicked");
}
public void Allocate_Subadmin()
{
	Allocate_Subadmin.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Allocate Subadmin", "Clicked");
}
public void Allocate_Subadmin_to_Coordinator()
{
	Allocate_Subadmin_to_Coordinator.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on Allocate_Subadmin_to_Coordinator", "Clicked");
}
public void Select_Subadmin(String args)
{
	Select_Subadmin.sendKeys(args);
	   Select se = new Select(Select_Subadmin);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select Subadmin as", args);
}
public void Select_TeamCoordinator()
{
	Select_TeamCoordinator.click();
	ExtentReport.test.log(LogStatus.INFO, "Clicked on Select_TeamCoordinator", "Clicked");
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
public void Allocate_Subadmin_with_ValidData(String loginEmail, String loginPassword,String Select_Subadmin) throws InterruptedException
{
	   
	   EnterEmail(loginEmail);
	   Thread.sleep(2000);
	   EnterPassword(loginPassword);
	   Thread.sleep(2000);
	   ClickLogin();
	   Thread.sleep(2000);
	   Members();
	   Thread.sleep(2000);
	   Team_Coordinator();
	   Thread.sleep(2000);
	   Allocate_Subadmin();
	   Thread.sleep(2000);
	   Allocate_Subadmin_to_Coordinator();
	   Thread.sleep(2000);
	   Select_Subadmin(Select_Subadmin);
	   Thread.sleep(2000);
	   Select_TeamCoordinator();
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

