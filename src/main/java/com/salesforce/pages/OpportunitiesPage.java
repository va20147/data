package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.base.TestBase;

public class OpportunitiesPage extends TestBase{
	@FindBy(id="tryLexDialogX")
	WebElement ClosePopUp;
	@FindBy(linkText="Chatter")
	WebElement ChatterLink;
	@FindBy(linkText="Profile")
	WebElement ProfilesLink;
	@FindBy(linkText="Groups")
	WebElement GroupsLink;
	
	public OpportunitiesPage() {
    	PageFactory.initElements(driver, this);
    }
    public String validateOpportunitiesPageTitle() {
		return driver.getTitle();
    	
    	
    }
}
