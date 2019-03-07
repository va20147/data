package com.salesforce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.base.TestBase;

public class LoginPage extends TestBase{
	
	

	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@id='rememberUn']")
	WebElement CheckBox;
			
	
	@FindBy(xpath="//img[@id='logo']")
	WebElement SFLogo;
	
	
	
    public LoginPage() {
    	PageFactory.initElements(driver, this);
    }
    public String validateLoginPageTitle() {
		return driver.getTitle();
    	
    	
    }
    public boolean validateSFLogo() {
		return SFLogo.isDisplayed();
		
    	
    }
    public HomePage Login(String un,String pwd) {
    	username.clear();
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	CheckBox.click();
    	loginBtn.click();
    	return new HomePage();
    }
}
