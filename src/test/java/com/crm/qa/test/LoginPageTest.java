package com.crm.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginpage;

	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws IOException {
		intialization();
		 loginpage=new LoginPage();
	}
@Test
public void Loginpagetitle() {
	String Title =loginpage.validateTitle();
	Assert.assertEquals("Cogmento CRM", "Cogmento CRM");
	
}
	
@AfterMethod
public void teardown() {
	driver.quit();
}
}