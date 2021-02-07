 package com.crm.qa.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import src.crm.qa.utility.TestUtil;


public class HomePageTest extends TestBase {  //shortcut to import: ctrl+shift+O
	LoginPage loginPage;
	HomePage homePage;
    //TestUtil testUtil;
	ContactsPage contactsPage;
	
	public HomePageTest() throws IOException
	{
		super();
	}
	//test cases should be -- independent with each other i.e. separated
	//before each test case -- launch the  browser and login
	//@test -- execute the test case
	//after each test case -- close the browser	
	@BeforeMethod
	public void setUp() throws IOException
	{
		intialization();
		//testUtil=new TestUtil();
		loginPage=new LoginPage();
		contactsPage=new ContactsPage();				
		homePage=loginPage.login(prop.getProperty("emailid"), prop.getProperty("Password"));
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest()  //whenever writing the test cases write test at the end of method
	{

		
		String homePageTitle=homePage.verifyhomepagetitle();
		
		Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home page title not matched");
	}
	
	
	@Test(priority=2)
	public void verifyUserNameTest()
	{
		//testUtil.switchToFrame();
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		//driver.quit();
	}	
}