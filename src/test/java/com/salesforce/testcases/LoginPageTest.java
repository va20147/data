package com.salesforce.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.salesforce.base.TestBase;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage ;
	HomePage homePage;
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		
		initialization() ;
		loginPage =new LoginPage();
	}
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Login | Salesforce");
		
	}
	@Test (priority=2)
	public void SFLogoTest() {
		boolean flag = loginPage.validateSFLogo();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3)
	public void LoginTest() {
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
