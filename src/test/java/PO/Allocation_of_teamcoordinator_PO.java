package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import ExtentReport.ExtentReport;

public class Allocation_of_teamcoordinator_PO {

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

@FindBy(how= How.XPATH, using="(//a[@type='submit'] )[2]")
WebElement Allocate_TeamCoordinator;

@FindBy(how= How.XPATH, using="//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")
WebElement Allocate_coordinator_to_farmer;


@FindBy(how= How.XPATH, using="//select[@id='team_coordinator_id']")
WebElement Select_Coordinator;

@FindBy (how= How.XPATH, using="(//input[@type='checkbox'])[1] ")
WebElement Select_Farmer;


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
public void Farmer()
{
	 Farmers.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Farmers Option", "Clicked");
}
public void Allocate_TeamCoordinator()
{
	Allocate_TeamCoordinator.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Allocate_TeamCoordinator", "Clicked");
}
public void Allocate_coordinator_to_farmer()
{
	Allocate_coordinator_to_farmer.click();
	 ExtentReport.test.log(LogStatus.INFO, "Clicked on the Allocate_coordinator_to_farmer", "Clicked");
}
public void Select_Coordinator(String args)
{
	Select_Coordinator.sendKeys(args);
	   Select se = new Select(Select_Coordinator);
	   se.selectByVisibleText(args);
	  ExtentReport.test.log(LogStatus.INFO, "Select Coordinator as", args);
}
public void Select_Farmer()
{
	Select_Farmer.click();
	ExtentReport.test.log(LogStatus.INFO, "Clicked on farmer", "Clicked");
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
public void Allocate_TeamCoordinator_with_ValidData(String loginEmail, String loginPassword,String Select_Coordinator) throws InterruptedException
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
	   Allocate_TeamCoordinator();
	   Thread.sleep(2000);
	   Allocate_coordinator_to_farmer();
	   Thread.sleep(2000);
	   Select_Coordinator(Select_Coordinator);
	   Thread.sleep(2000);
	   Select_Farmer();
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

