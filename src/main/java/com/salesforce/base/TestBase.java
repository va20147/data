package com.salesforce.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.salesforce.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()  {
		try {
		prop = new Properties();
		FileInputStream ip;
		
			ip = new FileInputStream(
			"/Users/anubhasaxena/eclipse-workspace/SalesForce/src/main/java/com/salesforce"+"/config/config.properties"	);
			prop.load(ip);
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
	}
	public static void initialization() {
		String BrowserName= prop.getProperty("browser");
		if(BrowserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/Users/anubhasaxena/Downloads/chromedriver");
			  driver=new ChromeDriver();	
			
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/Users/anubhasaxena/Downloads/geckodriver");
			  driver=new ChromeDriver();	
			 
	}
        else if(BrowserName.equalsIgnoreCase("safari")) {
			
			
			  driver=new SafariDriver();	
			 
	}
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
}
	

}
