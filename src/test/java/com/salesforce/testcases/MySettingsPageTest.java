package com.salesforce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.TestBase;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.MySettingsPage;
import com.salesforce.pages.ProfilesPage;
import com.salesforce.util.TestUtil;

public class MySettingsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ProfilesPage profilesPage;
	MySettingsPage mysettingsPage;
	public MySettingsPageTest() {
		super();
	}
	@BeforeMethod
	 public void SetUp() {
		initialization() ;
		testUtil=new TestUtil();
		loginPage =new LoginPage();
		profilesPage=new ProfilesPage();
		mysettingsPage =new MySettingsPage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.ClosePopup();
		homePage.MySettings();
		
	}
	@Test(enabled=true)
	public void validateMySettingsPageTitleTest() {
		
		String mysettingsPageTitle=mysettingsPage.validateMySettingsPageTitle();
		Assert.assertEquals(mysettingsPageTitle,"Hello, Anubha Banana! ~ Salesforce - Essentials Edition","MySettingsPage Title is not correct");
	}
    @Test(enabled =true)
    public void DownloadHistoryTest() {
    	mysettingsPage.DownloadHistory();
    }
    @Test(enabled =true)
    public void CustomizeTabsTest() {
    	mysettingsPage.CustomizeTabs();
    }
    @Test(enabled =true)
    public void EmailUpdateTest(){
    	mysettingsPage.EmailUpdate();
    }
    @Test
    public void CalendarAndRemindersTest() {
    	mysettingsPage.CalendarAndReminders();
    }
    @AfterTest
    public void TearDown() {
    	driver.quit();
    }
    
}   
