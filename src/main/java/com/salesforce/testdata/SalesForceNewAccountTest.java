package com.salesforce.testdata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

import com.salesforce.util.Xls_ReaderUtil;

public class SalesForceNewAccountTest {
	WebDriver driver;
	Logger log = Logger.getLogger(SalesForceNewAccountTest.class);
	@BeforeMethod()
	public void SetUp() {
		System.setProperty("webdriver.chrome.driver","/Users/anubhasaxena/Downloads/chromedriver");
		  driver=new ChromeDriver();	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.get("https://login.salesforce.com/");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("anubha99@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass1234");
	     driver.findElement(By.xpath("//input[@id='Login']")).click();  
		 driver.findElement(By.id("tryLexDialogX")).click();
		 driver.findElement(By.id("Account_Tab")).click();
		log.info("entering Salesforce Website" );
	}
	@DataProvider
	public Object[][] getTestData() {
	Object data[][]=Xls_ReaderUtil.getTestData("NewAccount");	
	return data;
	}
	@Test(dataProvider="getTestData")
	
	public void NewAccount(String AccountName,String ParentName,String Phone,String City,String State,
			String Zip,String Country) {
		log.info("****** starting TestCase**********");
		driver.findElement(By.xpath("//input[@title='New']")).click();
		 driver.findElement(By.id("acc2")).sendKeys(AccountName);
		 driver.findElement(By.id("acc3")).sendKeys(ParentName);
		 driver.findElement(By.id("acc10")).sendKeys(Phone);
		 driver.findElement(By.id("acc17city")).sendKeys(City);
		 driver.findElement(By.id("acc17state")).sendKeys(State);
		 driver.findElement(By.id("acc17zip")).sendKeys(Zip);
		 driver.findElement(By.id("acc17country")).sendKeys(Country);
		 driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
		 log.info("New Account created");
	}
	
   @AfterMethod()
    public void TearDown() {
	 driver.quit();  
   }
}
