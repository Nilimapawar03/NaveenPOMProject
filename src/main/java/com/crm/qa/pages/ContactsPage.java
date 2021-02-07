package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.TestBase.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath="//div[contains(text(),'Contacts')]")
	WebElement contatcheading;

	@FindBy(xpath="//button[contains(text(),'Show Filters')]")
	WebElement Showfilterbtn;

	@FindBy(xpath="//button[contains(text(),'Export')]")
	WebElement ShowExportbtn;

	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement showNew;

	//@FindBy Select select1 =new Select(driver.findElement(By.xpath("//div[@name='view']")));
	//WebElement dropdown;

	//To intialise OR using Page factory
	public ContactsPage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	//Actions
	//1.To verify buttons on Page 
	public boolean buttons() {
		return showNew.isDisplayed();
	}


	//2.To verify button Text
	public String buttontext() {
		return ShowExportbtn.getText();

	}
	public String btngettagname() {
		return ShowExportbtn.getTagName();

	}
	//4.To verify Verifycontactheading(){
	public String Verifycontactheading() {
		return contatcheading.getText();
	}
	//5.Select checkbox 

		
	
	}
