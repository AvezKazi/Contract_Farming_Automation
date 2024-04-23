package ExtentReport;

import java.util.Date;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	public static ExtentReports extent;
	public static ExtentTest test;
	public static void startreport() {
		Date dt= new Date();
	String path=System.getProperty("user.dir")+"\\test-output\\"+dt.getTime()+"testreport.html";
	extent=new ExtentReports(path);
	}
	

	




/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport 
{
	/*1:Static means:Without creating obj of the class we r suppose to 
	use the content in some other class that time we use static word.
	  
	  2:ExtentReports:It is use to make a report to maintain the log of the project.
	  3:ExtentTest:It will make the log of each and every test case we write
	*/
	//Access _Specifier      classname   object_name
/*	  public   static ExtentReports extent;  //outer 
	  public static ExtentTest test;       //inner 

	//A Method to start the report on each class to save it. 
	public static void startreport() // Method static   obj.methodname 
	{
		/*user.dir:It will make the report store in the same project 
		  in the test-output folder and with xyz.html file 
		
		*/
	//	String path=System.getProperty("user.dir")+"\\test-output\\TestReport.html";
// Datatype  variable name location to store the        folder         report file .
	
//		extent=new ExtentReports(path); //Assign the part of the current dir 
	}
 //















