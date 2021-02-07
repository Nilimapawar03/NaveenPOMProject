package com.crm.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import src.crm.qa.utility.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage loginpage;

	HomePage homepage;
	ContactsPage contactspage;
	//TestUtil testutil;

	public ContactsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	@BeforeMethod
	public void setup() throws IOException {
		intialization();
		loginpage=new LoginPage();
		contactspage=new ContactsPage();
		// testutil=new TestUtil();
		homepage=loginpage.login(prop.getProperty("emailid"),prop.getProperty("Password"));

	}

	//Contact heading 
	@Test
	public void Verifycontactheading() {
		Assert.assertEquals("Contacts", "Contacts");
		//Assert.assertTrue(contactpage.Verifycontactheading());

	}
	//Button Tag name
	@Test
	public void btngettagname() {

		System.out.println(contactspage.btngettagname());
	}
	//Button Text
	@Test
	public void buttontext() {

		System.out.println(contactspage.buttontext());
	}
	//Buttons on Page
	@Test
	public void buttons() {
		System.out.println(contactspage.buttons());
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
