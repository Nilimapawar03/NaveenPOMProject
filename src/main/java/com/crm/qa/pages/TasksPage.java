package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.TestBase.TestBase;

public class TasksPage extends TestBase {

	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement Tasklink;
@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement Newbutton;
	
	

	public TasksPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	//Actions : 

	//Tc_1 : Verify TaskLinks navigation
	public void MenuTaskLink() {
		Tasklink.click();
}
	
	//Tc_3 : Verify button display 
	public boolean newbuttondisplay() {
		return Newbutton.isDisplayed();
	}
	public void clicknew() {
			 Newbutton.click();
		}

}
