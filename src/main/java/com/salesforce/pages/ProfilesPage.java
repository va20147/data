package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.base.TestBase;
import com.salesforce.util.TestUtil;

public class ProfilesPage extends TestBase{
	TestUtil testUtil=new TestUtil();
	@FindBy(linkText="Overview")
	WebElement OverViewLink;
	@FindBy(xpath="//a[@class='aboutMeLaunch editLink']//img[@title='Edit Profile']")
	WebElement EditProfileLink;
	@FindBy (xpath="//a[contains(text(),'About')]")
	WebElement AboutTab;
	@FindBy (xpath="//input[@id='lastName']")
	WebElement LastNameField;
	@FindBy (xpath="//a[contains(text(),'Contact')]")
	WebElement ContactTab;
	@FindBy (xpath="//input[@id='phone']")
	WebElement PhoneField;
	@FindBy (xpath="//input[contains(@value,'Save All')]")
	WebElement SaveButton;
	@FindBy (xpath="//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]")
	WebElement PostLink;
	@FindBy(xpath="//input[@id='publishersharebutton']")
	WebElement ShareLink;
	@FindBy(xpath="//a[@id='uploadLink']")
	WebElement UploadLink;
	@FindBy(xpath="//input[@name='j_id0:uploadFileForm:uploadInputFile:inputFile:file']")
	WebElement UploadPicture;
	@FindBy(id="j_id0:j_id7:save")
	WebElement SavePic;
	public ProfilesPage() {
    	PageFactory.initElements(driver, this);
    }
    public String validateProfilesPageTitle() {
		return driver.getTitle();
    	
    }
    public void UpdateProfile() {
    	OverViewLink.click();
    	EditProfileLink.click();
    	testUtil.switchtoProfileUpdateFrame();
    	AboutTab.click();
    	LastNameField.clear();
    	LastNameField.sendKeys("Banana");
    	ContactTab.click();
    	PhoneField.clear();
    	PhoneField.sendKeys("7031234567");
    	SaveButton.click();
    	testUtil.Switchtodefault();
    }
    public void SharePost() {
    	PostLink.click();
    	testUtil.switchtoPostFrame();
    	testUtil.switchtoPostinFrame();
    	testUtil.Switchtodefault();
    	ShareLink.click();
    	
    }
    public void UploadPicture() {
    	WebElement Picture = driver.findElement(By.xpath("//div[@id='photoSection']//img[@title='Anubha Banana']"));
 	    Actions action = new Actions(driver);
 	    action.moveToElement(Picture).build().perform();
 	    UploadLink.click();
    	WebElement Picframe= driver.findElement(By.id("uploadPhotoContentId"));
    	driver.switchTo().frame(Picframe);
    	UploadPicture.sendKeys("/Users/anubhasaxena/Downloads//Ganesh.jpg");
    	SavePic.click();
    	testUtil.Switchtodefault();
    }
}
