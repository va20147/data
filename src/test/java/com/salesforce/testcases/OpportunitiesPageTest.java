package com.salesforce.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.TestBase;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.OpportunitiesPage;
import com.salesforce.util.TestUtil;

public class OpportunitiesPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	OpportunitiesPage opportunitiesPage;
	public OpportunitiesPageTest() {
		super();
	}
	@BeforeMethod
	 public void SetUp() {
		initialization() ;
		testUtil=new TestUtil();
		loginPage =new LoginPage();
		opportunitiesPage =new OpportunitiesPage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.ClosePopup();
		
	}
	@Test(priority=1,enabled=false)
	public void validateHomePageTitleTest() {
		String opportunitiesPageTitle=opportunitiesPage.validateOpportunitiesPageTitle();
		Assert.assertEquals(opportunitiesPageTitle,"Opportunities: Home ~ Salesforce - Essentials Edition","HomePage Title is not correct");
	}
}
