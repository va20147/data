package com.salesforce.util;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.salesforce.base.TestBase;

public class TestUtil extends TestBase {
	public static long Page_Load_TimeOut =180;
    public static long Implicit_Wait = 200;
    public void switchtoProfileUpdateFrame() {
    	WebElement iframe =driver.findElement(By.xpath("//iframe[@id='aboutMeContentId']"));
    	   driver.switchTo().frame(iframe);
        
    }
    public void switchtoPostFrame() {
    	WebElement Postframe =driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, publisherRichTextEditor']"));
    	   driver.switchTo().frame(Postframe);
    }
    public void switchtoPostinFrame() {
    	WebElement Post= driver.findElement(By.xpath("//html[1]/body[1]"));
    	   Post.click();
    	   Post.sendKeys("I have to get a job");
    	   
        
    }
    public void acceptalert() {
    	Alert alert = driver.switchTo().alert();
    	alert.accept();
    	
    }
    public void dismissalert() {
    	Alert alert = driver.switchTo().alert();
    	alert.dismiss();
    	
    }
    public void Switchtodefault() {
    	driver.switchTo().defaultContent();
    }
    public void WindowPopUpHandler() {
    	Set<String>handler =driver.getWindowHandles();
 	   Iterator<String>It = handler.iterator();
 	   String parentwindowID =It.next();
 	   System.out.println("parent window id :" + parentwindowID);
        String ChildwindowId= It.next();
        System.out.println("child window id :" +  ChildwindowId);
        driver.switchTo().window(ChildwindowId);
 	   System.out.println("child window popup title"+ driver.getTitle());
 	   driver.close();
        driver.switchTo().window(parentwindowID);
    }
}
