package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(id="phHeaderLogoImage")
	WebElement SFLogoImage;
	@FindBy(id="tryLexDialogX")
	WebElement ClosePopUp;
	@FindBy(linkText="Chatter")
	WebElement ChatterLink;
	@FindBy(linkText="Profile")
	WebElement ProfilesLink;
	@FindBy(linkText="Groups")
	WebElement GroupsLink;
	@FindBy(linkText="Files")
	WebElement FilesLink;
	@FindBy(linkText="Leads")
	WebElement LeadsLink;
	@FindBy(linkText="Accounts")
	WebElement AccountsLink;
	@FindBy(linkText="Contacts")
	WebElement ContactsLink;
	@FindBy(linkText="Opportunities")
	WebElement OpportunitiesLink;
	@FindBy(linkText="Dashboards")
	WebElement DashboardsLink;
	@FindBy(id="userNavLabel")
	WebElement UserMenu;
	@FindBy(xpath="//a[@title='My Profile']")
	WebElement MyProfileDropdown;
	@FindBy(xpath="//a[@title='My Settings']")
	WebElement MySettingsDropdown;
	@FindBy(linkText="Developer Console")
	WebElement DeveloperConsoleDropdown;
	@FindBy(xpath="//a[@title='Logout']")
	WebElement LogoutDropdown;
	@FindBy(linkText="Setup")
	WebElement SetUpLink;
	
	
	public HomePage() {
    	PageFactory.initElements(driver, this);
    }
    public String validateHomePageTitle() {
		return driver.getTitle();
    	
    	
    }
    public boolean validateSFLogoImage() {
		return SFLogoImage.isDisplayed();
    }	
   public  void ClosePopup() {
	   	
	   ClosePopUp.click();
	     }
    public ChatterPage ClickOnChatterLink() {
    	
    	ChatterLink.click();
    	return new ChatterPage();
    }
    public ProfilesPage ClickOnProfilesLink() {
    	
    	ProfilesLink.click();
    	return new ProfilesPage();
    }
	
   public GroupsPage ClickOnGroupsLink() {
    	
    	GroupsLink.click();
    	return new GroupsPage();
    }
   public LeadsPage ClickOnLeadsLink() {
   	
   	LeadsLink.click();
   	return new LeadsPage();
   }
   public AccountsPage ClickOnAccountsLink() {
	   	
	   	AccountsLink.click();
	   	return new AccountsPage();
	   }
   public ContactsPage ClickOnContactsLink() {
	   	
	   	ContactsLink.click();
	   	return new ContactsPage();
	   }
   public OpportunitiesPage ClickOnOpportunitiesLink() {
	   	
	   	OpportunitiesLink.click();
	    return new OpportunitiesPage();
	   }
   public SetUpPage ClickOnSetUpLink() {
	   	
	   	SetUpLink.click();
	    return new SetUpPage();
	    
	   }
   public  void DropDownMenu() {
	   	
	   	UserMenu.click();
	   	MyProfileDropdown.click();
	   	UserMenu.click();
	   	MySettingsDropdown.click();
	   	UserMenu.click();
	   	LogoutDropdown.click();
	     }
   public void MySettings() {
	   UserMenu.click();
	   	MySettingsDropdown.click();
	   
   }
   public void DeveloperConsoleWindowPopUP() {
	   UserMenu.click();
	   DeveloperConsoleDropdown.click();
   }
   public void LogOut() {
	   UserMenu.click();
	   LogoutDropdown.click();
	   
   }
}
