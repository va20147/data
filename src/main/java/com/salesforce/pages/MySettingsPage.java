package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.salesforce.base.TestBase;
import com.salesforce.util.TestUtil;

public class MySettingsPage extends TestBase{
	
	TestUtil testUtil= new TestUtil();
	@FindBy(xpath="//span[@class='folderText'][contains(text(),'Personal')]")
	WebElement PersonalLink;
	@FindBy(id="LoginHistory_font")
	WebElement LoginHistoryTab;
	@FindBy (xpath="//a[contains(text(),'Download login history for last six months, includ')]")
	WebElement DownloadTab;
	@FindBy (id="DisplayAndLayout_font")
	WebElement DisplayAndLayoutTab;
	@FindBy (id="CustomizeTabs_font")
	WebElement CustomizeTab;
	@FindBy (id="duel_select_0")
	WebElement AvailableTabs;
	@FindBy (xpath="//img[contains(@title,'Add')]")
	WebElement AddToTabs;
	@FindBy (xpath="//input[contains(@title,'Save')]")
	WebElement SaveTabs;
	@FindBy(xpath="//span[@id='EmailSetup_font']")
	WebElement EmailTab;
	@FindBy(xpath="//span[@id='EmailSettings_font']")
	WebElement EmailSettings;
	@FindBy(id="sender_name")
	WebElement SenderName;
	@FindBy(id="sender_email")
	WebElement EmailAddress;
	@FindBy(xpath="//input[@title='Save']")
	WebElement EmailSaveButton;
	@FindBy(xpath="//span[@id='CalendarAndReminders_font']")
	WebElement CalendarAndRemindersTab;
	@FindBy(id="Reminders_font")
	WebElement Reminders;
	@FindBy(id="testbtn")
	WebElement TestButton;
	@FindBy(xpath="//input[@title='Save']")
	WebElement SaveCalendar;
	
	public MySettingsPage() {
    	PageFactory.initElements(driver, this);
    }
    public String validateMySettingsPageTitle() {
		return driver.getTitle();
    	
    }
    public void DownloadHistory() {
    	PersonalLink.click();
    	LoginHistoryTab.click();
    	DownloadTab.click();
    }
    public void CustomizeTabs(){
    	DisplayAndLayoutTab.click();
    	CustomizeTab.click();
    	WebElement SelectMenu =AvailableTabs;
    	Select select=new Select(SelectMenu);
    	select.selectByIndex(2);
    	AddToTabs.click();
    	SaveTabs.click();
    	
    }
    public void EmailUpdate() {
    	
    	EmailTab.click();
    	EmailSettings.click();
    	SenderName.clear();
    	SenderName.sendKeys("Anubha Saxena");
    	EmailAddress.clear();
    	EmailAddress.sendKeys("abc@xyz.com");
    	EmailSaveButton.click();
    	testUtil.acceptalert();
    	EmailSaveButton.click();
    }
    public void CalendarAndReminders() {
    	CalendarAndRemindersTab.click();
    	Reminders.click();
        TestButton.click();
        testUtil.dismissalert();
        SaveCalendar.click();
    }
}
