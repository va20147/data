package com.salesforce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.TestBase;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.ProfilesPage;
import com.salesforce.util.TestUtil;

public class ProfilesPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ProfilesPage profilesPage;
	
	public ProfilesPageTest() {
		super();
	}
	@BeforeMethod
	 public void SetUp() {
		initialization() ;
		testUtil=new TestUtil();
		loginPage =new LoginPage();
		profilesPage=new ProfilesPage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.ClosePopup();
		homePage.ClickOnProfilesLink();
		
	}
	@Test(enabled=true)
	public void validateProfilesPageTitleTest() {
		
		String ProfilesPageTitle=profilesPage.validateProfilesPageTitle();
		Assert.assertEquals(ProfilesPageTitle,"User: Anubha Banana ~ Salesforce - Essentials Edition","HomePage Title is not correct");
	}
	@Test(enabled=true)
	public void UpdateProfileTest() {
		profilesPage.UpdateProfile();
	}
	@Test(enabled=true)
	public void SharePostTest() {
		profilesPage.SharePost();
	}
	@Test
	public void UpLoadPictureTest() {
		profilesPage.UploadPicture();
		
		
	
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
