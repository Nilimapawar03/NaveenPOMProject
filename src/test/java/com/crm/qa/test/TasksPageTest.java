package com.crm.qa.test;

import java.io.IOException;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;

public class TasksPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TasksPage taskPage;

public TasksPageTest() {
	super();
}

@BeforeMethod
public void setup() throws IOException {
	intialization();
	//testUtil=new TestUtil();
	loginPage=new LoginPage();
	homePage=new HomePage();		
	taskPage=new TasksPage();
	homePage=loginPage.login(prop.getProperty("emailid"), prop.getProperty("Password"));
}
@Test
public void verifyMenuTaskLink() {
	taskPage.MenuTaskLink();
}

@Test
public void verifynewbtn() {
	taskPage.newbuttondisplay();
	System.out.println(taskPage.newbuttondisplay());
}
@Test 
public void newbtnclick() {
	taskPage.clicknew();
}
@AfterMethod
public void teardown() {
	driver.close();
}

}
