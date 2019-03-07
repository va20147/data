package com.salesforce.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.salesforce.base.TestBase;
import com.salesforce.pages.AccountsPage;
import com.salesforce.pages.HomePage;
import com.salesforce.pages.LoginPage;
import com.salesforce.util.TestUtil;

public class AccountsPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	AccountsPage accountsPage;
	TestUtil testUtil;
	
	public AccountsPageTest() {
		super();
	}
	@BeforeMethod
	 public void SetUp() {
		initialization() ;
		testUtil=new TestUtil();
		loginPage =new LoginPage();
		accountsPage = new AccountsPage();
		
		homePage=loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		homePage.ClosePopup();
		homePage.ClickOnAccountsLink();
		
	}
	@Test(priority=1,enabled=false)
	public void validateAccountsPageTitleTest() {
		String AccountsPageTitle=accountsPage.validateAccountsPageTitle();
		Assert.assertEquals(AccountsPageTitle,"Accounts: Home ~ Salesforce - Essentials Edition","AccountsPage Title is not correct");
	}
	
	@Test
	public void NewAccountTest() {
		accountsPage.NewAccount() ;
	}
	@Test(enabled=false)
	public void NewViewTest() {
		
		accountsPage.NewView();
	}
	@Test(enabled=false)
	public void MergeAccounts() {
		accountsPage.MergeAccounts();
	}
	@Test(enabled=false)
	public void AccountLastActivityTest() {
		accountsPage.AccountLastActivity();
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	
}
