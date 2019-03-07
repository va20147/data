package com.salesforce.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.salesforce.base.TestBase;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	 public void SetUp() {
		initialization() ;
		testUtil=new TestUtil();
		loginPage =new LoginPage();
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.ClosePopup();
		
	}
	@Test(priority=1,enabled=true)
	public void validateHomePageTitleTest() {
		String HomePageTitle=homePage.validateHomePageTitle();
		Assert.assertEquals(HomePageTitle,"Salesforce - Essentials Edition","HomePage Title is not correct");
	}
	@Test(priority=2,enabled=true)
	public void validateSFLogoImageTest() {
		boolean flag=homePage.validateSFLogoImage();
		Assert.assertTrue(flag);
		
	}
	@Test(priority=3,enabled=true)
	public void ClickOnChatterLinkTest() {
		homePage.ClickOnChatterLink();
		
	}
	@Test(priority=4,enabled=true)
	public void ClickOnProfilesLinkTest() {
		homePage.ClickOnProfilesLink();
		
	}
	@Test(priority=5,enabled=true)
	public void ClickOnGroupsLinkTest() {
		homePage.ClickOnGroupsLink();
		}
	@Test(priority=6,enabled=true) 
	public void ClickOnAccountsLinkTest() {
		homePage.ClickOnAccountsLink();
		}
	@Test(priority=7,enabled=true) 
	public void ClickOnContactsLinkTest() {
		homePage.ClickOnContactsLink();
		}
	@Test (priority=8,enabled=true)
	public void ClickOnLeadsLinkTest() {
		homePage.ClickOnLeadsLink();
		}
	@Test (priority=9,enabled=true)
	public void ClickOnOpportunitiesLinkTest() {
		homePage.ClickOnOpportunitiesLink();
		}

     @Test (priority=10,enabled=true)
      public void DropDownMenuTest() {
	  homePage.DropDownMenu();
	   }
	 @Test (priority=11,enabled=true)
	 public void DeveloperConsoleWindowPopUPTest() {
		 homePage.DeveloperConsoleWindowPopUP();
		 testUtil.WindowPopUpHandler();
	 }
	 @Test
	 public void LogOut() {
		 homePage.LogOut();
		
	 }
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
