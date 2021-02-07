package com.crm.qa.test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewTaskPage;
import com.crm.qa.pages.TasksPage;

public class NewTaskTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	TasksPage taskPage;
	NewTaskPage newTask;

public NewTaskTest() {
	super();
}

@BeforeMethod
public void setup() throws IOException {
	intialization();
	//testUtil=new TestUtil();
	loginPage=new LoginPage();
	homePage=new HomePage();		
	taskPage=new TasksPage();
	newTask=new NewTaskPage();
	homePage=loginPage.login(prop.getProperty("emailid"), prop.getProperty("Password"));
}
@Test
public void settitle() {
newTask.settitle();
}
@Test
public void SetAssigned() {
	
}
}
