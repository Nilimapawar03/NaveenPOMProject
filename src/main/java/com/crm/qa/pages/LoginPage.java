package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.TestBase.TestBase;

public class LoginPage extends TestBase {



	//Page Factory=Object Repository

	@FindBy(name="email")
	WebElement Email; 

	@FindBy(name="password")
	WebElement Password;

	@FindBy(xpath="//div[contains (text(),'Login')]")
	WebElement Loginbtn;

	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement Signup;

	@FindBy(xpath="//a[contains(text(),'Classic CRM')]")
	WebElement ClassicCrm;

	//How to Intialize the OR with help of Page factory

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub

		PageFactory.initElements(driver,this);
	}

	//Actions : Features on Login page
	public String validateTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String mail,String pwd) throws IOException {
		Email.sendKeys(mail);
		Password.sendKeys(pwd);
		Loginbtn.click();
		
		return new HomePage();
	}
	
}
