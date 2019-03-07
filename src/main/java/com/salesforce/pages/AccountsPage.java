package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.salesforce.base.TestBase;
import com.salesforce.util.TestUtil;

public class AccountsPage extends TestBase{
	TestUtil testUtil =new TestUtil();
	@FindBy(xpath="//input[@title='New']")
	WebElement NewButton;
	@FindBy(id="acc2")
	WebElement AccName;
	@FindBy(id="acc3")
	WebElement ParentAccName;
	@FindBy(id="acc10")
	WebElement PhoneNo;
	@FindBy(id="acc17city")
	WebElement BillingCity;
	@FindBy(id="acc17state")
	WebElement BillingState;
	@FindBy(id="acc17zip")
	WebElement BillingZip;
	@FindBy(id="acc17country")
	WebElement BillingCountry;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']")
	WebElement SaveButtton;
	@FindBy(linkText="Create New View")
	WebElement CreateNewView;
	@FindBy(id="fname")
	WebElement FirstName;
	@FindBy(id="devname")
	WebElement UniqueName;
	@FindBy(xpath="//div[@class='pbHeader']//input[@title='Save']")
	WebElement SaveButton;
	@FindBy (linkText="Merge Accounts")
	WebElement MergeAccounts;
	@FindBy (id="srch")
	WebElement Search;
	@FindBy(xpath="//div[@class='pbWizardBody']//input[2]")
	WebElement FindAccounts;
	@FindBy(id="cid0")
	WebElement Account1;
	@FindBy(id="cid1")
	WebElement Account2;
	@FindBy(xpath="//div[@class='pbTopButtons']//input[@title='Next']")
	WebElement Next;
	@FindBy(xpath="//div[@class='pbBottomButtons']//input[@title='Merge']")
	WebElement Merge;
	@FindBy(linkText="Accounts with last activity > 30 days")
	WebElement AccountLastActivity;
	@FindBy(id="ext-gen152")
	WebElement FromButton;
	@FindBy(xpath="//td[contains(@class,'x-date-prevday')]//span[contains(text(),'24')]")
	WebElement FromDay;
	@FindBy(id="ext-gen154")
	WebElement ToButton;
	@FindBy(id="ext-gen281")
	WebElement ToDay;
	@FindBy(id="ext-gen63")
	WebElement RunButton;
	@FindBy(xpath="//input[@title='Save As']")
	WebElement SaveAsButton;
	@FindBy(id="report_name")
	WebElement ReportName;
	@FindBy(id="devName")
	WebElement UniqueReportName;
	@FindBy(id="owner")
	WebElement ReportFolder;
	@FindBy(xpath="//input[@title='Save']")
	WebElement SaveReport;
	
	
	public AccountsPage() {
    	PageFactory.initElements(driver, this);
    }
    public String validateAccountsPageTitle() {
		return driver.getTitle();
    	
    }
    public void NewAccount() {
    	NewButton.click();
    	AccName.clear();
    	AccName.sendKeys("Abc");
    	ParentAccName.clear();
    	ParentAccName.sendKeys("abc");
    	PhoneNo.clear();
    	PhoneNo.sendKeys("1234567");
    	BillingCity.sendKeys("Ashburn");
    	BillingState.sendKeys("Va");
    	BillingZip.sendKeys("20147");
    	BillingCountry.sendKeys("USA");
    	SaveButton.click();
    }
    public void NewView() {
    	CreateNewView.click();
    	FirstName.clear();
    	FirstName.sendKeys("SpongeBob");
    	UniqueName.clear();
    	UniqueName.sendKeys("SquarePants");
    	
    }
    public void MergeAccounts() {
    	MergeAccounts.click();
    	Search.sendKeys("abc");
    	FindAccounts.click();
    	Account1.click();
    	Account2.click();
    	Next.click();
    	Merge.click();
    	testUtil.acceptalert();
    	
    }
    public void AccountLastActivity() {
    	AccountLastActivity.click();	
    	FromButton.click();
    	FromDay.click();
    	ToButton.click();
    	ToDay.click();
    	RunButton.click();
    	SaveAsButton.click();
    	ReportName.sendKeys("Report");
    	UniqueReportName.sendKeys("Unique Report");
    	Select select =new Select(ReportFolder);
    	select.selectByIndex(1);
    	SaveReport.click();
    }
}
