package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserManager {
	
	public static WebDriver getDriver (String type) {
		
		WebDriver driver=null;            //Created an Object of WebDriver
		if (type.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();    //Object = New Class
		}
		return driver;
		
	}

}
