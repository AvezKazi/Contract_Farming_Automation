package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PO_Location {
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
	 	
	        @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[1]")
	        WebElement Btn_Location;
	        
	        @FindBy(how= How.XPATH, using ="//a[text()='State']")
	        WebElement State;
	        
	        @FindBy(how= How.XPATH, using="//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")
	        WebElement Click_on_State;
	        
	        @FindBy(how= How.XPATH, using="//input[@id='name']")
	        WebElement state_Name;
	        
	        @FindBy (how= How.XPATH, using="//input[@id='code']")
	        WebElement state_Code;
	        
	        @FindBy(how= How.XPATH, using="//button[@onclick='return add()']")
	        WebElement Add_State;
	        
	        @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
	        WebElement Click_YES;
	        
	        @FindBy(how= How.XPATH, using="//button[@class='swal-button swal-button--confirm']")
	        WebElement Click_OK;
	        
	        @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[1]")
	        WebElement Btn_LocationBack;
	        
	        @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[1]")
	        WebElement Btn_Location1;
	        
	        @FindBy(how= How.XPATH, using ="//a[text()='District']")
	        WebElement District;
	        
	        @FindBy(how= How.XPATH, using="//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")
	        WebElement Click_on_District;
	        
	        @FindBy(how= How.XPATH, using ="//select[@id='states']")
	        WebElement Select_State;
	        
	        @FindBy(how= How.XPATH, using ="//input[@placeholder='Enter District Name']")
	        WebElement District_Name;
	        
	        @FindBy(how= How.XPATH, using ="//input[@id='code']")
	        WebElement District_Code;
	        
	        @FindBy(how= How.XPATH, using="//button[@onclick='return add()']")
	        WebElement Add_District;
	        
	        @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
	        WebElement Click_YES1;
	        
	        @FindBy(how= How.XPATH, using="//button[@class='swal-button swal-button--confirm']")
	        WebElement Click_OK1;
	        
	        @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[1]")
	        WebElement Btn_LocationBack1;
	        
	        @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[1]")
	        WebElement Btn_Location2;
	        
	        @FindBy(how= How.XPATH, using ="//a[text()='Taluka']")
	        WebElement Taluka;
	        
	        @FindBy(how= How.XPATH, using="//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")
	        WebElement Click_on_Taluka;
	        
	        @FindBy(how= How.XPATH, using ="//select[@id='district']")
	        WebElement Select_district;
	        
	        @FindBy(how= How.XPATH, using ="//input[@placeholder='Enter Taluka Name']")
	        WebElement Taluka_Name;
	        
	        @FindBy(how= How.XPATH, using ="//input[@id='code']")
	        WebElement Taluka_Code;
	        
	        @FindBy(how= How.XPATH, using="//button[@onclick='return add()']")
	        WebElement Add_Taluka;
	        
	        @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
	        WebElement Click_YES2;
	        
	        @FindBy(how= How.XPATH, using="//button[@class='swal-button swal-button--confirm']")
	        WebElement Click_OK2;
	        
	        
	        @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[1]")
	        WebElement Btn_LocationBack2;
	        
	        @FindBy(how= How.XPATH, using ="(//span[@class='sidebar-collapse-icon fa-solid fa-chevron-down'])[1]")
	        WebElement Btn_Location3;
	        
	        @FindBy(how= How.XPATH, using ="//a[text()='Village']")
	        WebElement Village;
	        
	        @FindBy(how= How.XPATH, using="//a[@class='btn btn-outline-danger btn-flat btn-sm float-right']")
	        WebElement Click_on_Village;
	        
	        @FindBy(how= How.XPATH, using ="//select[@id='block']")
	        WebElement Select_Block;
	        
	        @FindBy(how= How.XPATH, using ="//input[@placeholder='Enter Village Name']")
	        WebElement Village_Name;
	        
	        @FindBy(how= How.XPATH, using ="//input[@id='code']")
	        WebElement Village_Code;
	        
	        @FindBy(how= How.XPATH, using="//button[@onclick='return add()']")
	        WebElement Add_Village;
	        
	        @FindBy(how= How.XPATH, using="(//button[@type='button'])[2]")
	        WebElement Click_YES3;
	        
	        @FindBy(how= How.XPATH, using="//button[@class='swal-button swal-button--confirm']")
	        WebElement Click_OK3;
	       
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
	        public void Location()
	        {
	        	Btn_Location.click();
	        }
	        public void state()
	        {
	        	State.click();
	        }
	       public void Add_State()
	       {
	    	   Click_on_State.click();
	       }
	       public void State_Name(String args)
	       {
	    	   state_Name.sendKeys(args);
	       }
	       public void State_Code (String args)
	       {
	    	   state_Code.sendKeys(args);
	       }
	       public void Add()
	       {
	    	   Add_State.click(); 
	       }
	       public void Yes()
	       {
	    	   Click_YES.click(); 
	       }
	       public void Ok()
	       {
	    	   Click_OK.click(); 
	       }
	       public void Btn_LocationBack()
	        {
	    	   Btn_LocationBack.click();
	        }
	       
	       public void Btn_Location1()
	        {
	    	   Btn_Location1.click();
	        }
	        public void District()
	        {
	        	District.click();
	        }
	       public void Click_on_District()
	       {
	    	   Click_on_District.click();
	       }
	       public void Select_State(String args)
	       {
	    	   Select_State.sendKeys(args);
	    	   Select se = new Select(Select_State);
	    	   se.selectByVisibleText(args);
	       }
	       public void District_Name (String args)
	       {
	    	   District_Name.sendKeys(args);
	       }
	       public void District_Code (String args)
	       {
	    	   District_Code.sendKeys(args);
	       }
	       public void Add_District()
	       {
	    	   Add_District.click(); 
	       }
	       public void Yes1()
	       {
	    	   Click_YES1.click(); 
	       }
	       public void Ok1()
	       {
	    	   Click_OK1.click(); 
	       }
	       
	       public void Btn_LocationBack1()
	        {
	    	   Btn_LocationBack.click();
	        }
	       
	       public void Btn_Location2()
	        {
	    	   Btn_Location1.click();
	        }
	        public void Taluka()
	        {
	        	Taluka.click();
	        }
	       public void Click_on_Taluka()
	       {
	    	   Click_on_Taluka.click();
	       }
	       public void Select_district(String args)
	       {
	    	   Select_district.sendKeys(args);
	    	   Select se = new Select(Select_district);
	    	   se.selectByVisibleText(args);
	       }
	       public void Taluka_Name (String args)
	       {
	    	   Taluka_Name.sendKeys(args);
	       }
	       public void Taluka_Code (String args)
	       {
	    	   Taluka_Code.sendKeys(args);
	       }
	       public void Add_Taluka()
	       {
	    	   Add_Taluka.click(); 
	       }
	       public void Yes2()
	       {
	    	   Click_YES2.click(); 
	       }
	       public void Ok2()
	       {
	    	   Click_OK2.click(); 
	       }
	       
	       public void Btn_LocationBack2()
	        {
	    	   Btn_LocationBack2.click();
	        }
	       
	       public void Btn_Location3()
	        {
	    	   Btn_Location3.click();
	        }
	        public void Village()
	        {
	        	Village.click();
	        }
	       public void Click_on_Village()
	       {
	    	   Click_on_Village.click();
	       }
	       public void Select_Block(String args)
	       {
	    	   Select_Block.sendKeys(args);
	    	   Select se = new Select(Select_Block);
	    	   se.selectByVisibleText(args);
	       }
	       public void Village_Name (String args)
	       {
	    	   Village_Name.sendKeys(args);
	       }
	       public void Village_Code (String args)
	       {
	    	   Village_Code.sendKeys(args);
	       }
	       public void Add_Village()
	       {
	    	   Add_Village.click(); 
	       }
	       public void Yes3()
	       {
	    	   Click_YES1.click(); 
	       }
	       public void Ok3()
	       {
	    	   Click_OK1.click(); 
	       }
	       
	       
	       
	       public void Add_State (String Email, String Password, String State_Name, String State_Code,String Select_State, String District_Name,String District_Code, String Select_district,String Taluka_Name,String Taluka_Code, String Select_Block,String Village_Name,String Village_Code ) throws InterruptedException
	       {
	    	EnterEmail(Email);
	    	Thread.sleep(2000);
	   		EnterPassword(Password);
	   		Thread.sleep(2000);
	   		ClickLogin();
	   		Thread.sleep(2000);
	    	Location();
	    	Thread.sleep(2000);
	    	state();
	    	Thread.sleep(2000);
	    	Add_State();
	    	Thread.sleep(2000);
	    	State_Name(State_Name); 
	    	Thread.sleep(2000);
	    	State_Code(State_Code);
	    	Thread.sleep(2000);
	    	Add();
	    	Thread.sleep(2000);
	    	Yes();
	    	Thread.sleep(2000);
	    	Ok();
	    	Thread.sleep(10000);
	    	Btn_LocationBack();
	    	Thread.sleep(2000);
	    	Btn_Location1();
	    	Thread.sleep(2000);
	    	District();
	    	Thread.sleep(2000);
	    	Click_on_District();
	    	Thread.sleep(2000);
	    	Select_State(Select_State);
	    	Thread.sleep(2000);
	    	District_Name(District_Name);
	    	Thread.sleep(2000);
	    	District_Code(District_Code);
	    	Thread.sleep(2000);
	    	Add_District();
	    	Thread.sleep(2000);
	    	Yes1();
	    	Thread.sleep(2000);
	    	Ok1();
	    	Thread.sleep(2000);
	       Btn_LocationBack1();
	    	Thread.sleep(2000);
	    	Btn_Location2();
	    	Thread.sleep(2000);
	    	Taluka();
	    	Thread.sleep(2000);
	    	Click_on_Taluka();
	    	Thread.sleep(2000);
	    	Select_district(Select_district);
	    	Thread.sleep(2000);
	    	Taluka_Name(Taluka_Name);
	    	Thread.sleep(2000);
	    	Taluka_Code(Taluka_Code);
	    	Thread.sleep(2000);
	    	Add_Taluka();
	    	Thread.sleep(2000);
	    	Yes2();
	    	Thread.sleep(2000);
	    	Ok2();
	    	Thread.sleep(2000);
	    	Btn_LocationBack2();
	    	Thread.sleep(2000);
	    	Btn_Location3();
	    	Thread.sleep(2000);
	    	Village();
	    	Thread.sleep(2000);
	    	Click_on_Village();
	    	Thread.sleep(2000);
	    	Select_Block(Select_Block);
	    	Thread.sleep(2000);
	    	Village_Name(Village_Name);
	    	Thread.sleep(2000);
	    	Village_Code(Village_Code);
	    	Thread.sleep(2000);
	    	Add_Village();
	    	Thread.sleep(2000);
	    	Yes3();
	    	Thread.sleep(2000);
	    	Ok3();
	    	Thread.sleep(2000);
	    	driver.close();
	       }	
}

