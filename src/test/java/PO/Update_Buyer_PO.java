package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Update_Buyer_PO {
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

@FindBy(how= How.XPATH, using ="//a[text()='Buyers']")
WebElement Buyer;

@FindBy(how= How.XPATH, using="(//a[@class='fa-solid fa-pen-to-square fa-2xl text-blue'])[2]")
WebElement Update_Buyer;

@FindBy(how= How.XPATH, using="//input[@id='name']")
WebElement Name;

@FindBy (how= How.XPATH, using="//input[@id='mobile']")
WebElement Mobile;

@FindBy(how= How.XPATH, using="//input[@id='email']")
WebElement Email;

@FindBy(how= How.XPATH, using="//input[@id='address']")
WebElement Address;

@FindBy(how= How.XPATH, using="//input[@id='gst_number']")
WebElement GST_Number;

@FindBy(how= How.XPATH, using="//button[@onclick='return edit()']")
WebElement Update;

@FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
WebElement Click_YES;

@FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
WebElement Click_OK;


public void EnterEmail (String args)
{
	txt_AdminEmail.sendKeys(args);
}
public void EnterPassword (String args)
{
	txt_AdminPassword.sendKeys(args);
}
public void ClickLogin ()
{
	Btn_Login.click();
}
public void Members()
{
	Members.click();
}
public void Buyer()
{
 Buyer.click();
}
public void Update_Buyer()
{
 Update_Buyer.click();
}
public void Name(String args)
{
	Name.clear();
  Name.sendKeys(args);
}
public void Mobile(String args)
{
	Mobile.clear();
  Mobile.sendKeys(args);
}
public void Email (String args)
{
	Email.clear();
  Email.sendKeys(args);
}
public void Address (String args)
{
	Address.clear();
  Address.sendKeys(args);
}
public void GST_Number (String args)
{
	GST_Number.clear();
GST_Number.sendKeys(args);
}

public void Update()
{
  Update.click(); 
}
public void Yes()
{
  Click_YES.click(); 
}
public void Ok()
{
  Click_OK.click(); 
}
public void Update_Buyer(String loginEmail, String loginPassword,String Name,String Mobile,String Email,String Address,String GST_Number) throws InterruptedException
{
  EnterEmail(loginEmail);
  Thread.sleep(2000);
  EnterPassword(loginPassword);
  Thread.sleep(2000);
  ClickLogin();
  Thread.sleep(2000);
  Members();
  Thread.sleep(2000);
  Buyer();
  Thread.sleep(2000);
  Update_Buyer();
  Thread.sleep(2000);
  Name(Name);
  Thread.sleep(2000);
  Mobile(Mobile);
  Thread.sleep(2000);
  Email(Email);
  Thread.sleep(2000);
  Address(Address);
  Thread.sleep(2000);
  GST_Number(GST_Number);
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
