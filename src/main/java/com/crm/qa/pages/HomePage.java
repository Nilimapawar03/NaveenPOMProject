package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.TestBase.TestBase;

public class HomePage extends TestBase {
	
	//Page object =OR
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement Homelink;
	
	//Con@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealslink;
	
	@FindBy(xpath="//span[contains(text(),'Task')]")
	WebElement tasklink;
	
	@FindBy(xpath="//span[@class='user-display']")
	WebElement Username;
	
//	@FindBy(xpath="//button[@class='ui basic icon button']")
//	WebElement pinned;
	

//To intialize the webelement through initelement
public HomePage() throws IOException {
	PageFactory.initElements(driver,this);
}


//Actions
//1. To verify the Homepage title
public String verifyhomepagetitle() {
	return driver.getTitle();
}

//2. To verify user name on Hoempage
public boolean verifyCorrectUserName() {
	return Username.isDisplayed();
	//return driver.Username.(Username);
}


public DealsPage clickOnDealsLink() throws IOException
{
	dealslink.click();
	return new DealsPage();
}

public TasksPage clickOnTasksLink() throws IOException  //it returns next landing page
{
	tasklink.click();
	return new TasksPage();

}

}
//VerifyPagetitle 
//2.Verifyuser name - You need to add switchto frame in common utility and then use as testUtil.awitchtoFrame();
 //3.Verify contacts link -
