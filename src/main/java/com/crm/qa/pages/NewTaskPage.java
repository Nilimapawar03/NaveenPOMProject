package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.TestBase.TestBase;

public class NewTaskPage extends TestBase{
	//@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement Newbtn;

	@FindBy(xpath="//input[@name='title']")
	WebElement title;


	Select select =new Select(driver.findElement(By.xpath("//div[@class='ui fluid selection dropdown']")));
	WebElement assigneddropdown; 

	
	Select select1=new Select(driver.findElement(By.xpath("//div[@name='type']")));
	WebElement Typedropdown;                                                         //Drop down - 2    

	@FindBy(xpath="//textarea[@name='description']")
	WebElement desc;

	
	Select select2=new Select(driver.findElement(By.xpath("//div[@name='status']")));
	WebElement statusdropdown;   
	                                           //Drop down - 3
	
	Select select3=new Select(driver.findElement(By.xpath("//div[@name='priority']")));
	WebElement Prioritydropdown;; 
                                      //Drop Down - 4

	@FindBy (xpath="//button[@class='ui linkedin button']")
	WebElement Savebtn;

public NewTaskPage() {
	super();
	PageFactory.initElements(driver,this);
}

//Actions : 
public void settitle() {
	title.sendKeys("Sale task report verification");
	
}
public void setDesc() {
	desc.sendKeys("This task is mainly for Sales team to check validate all previous reports");	
}

public void SetAssigned() {
	select.selectByVisibleText("Nilima Pawar");
}
public void SetType() {
	select1.selectByVisibleText("Technical Support");
}
public void Setstatus() {
	select2.selectByVisibleText("Enquiring");
}
public void SetPriority() {
	select3.selectByVisibleText("High");
}
public void clicksave() {
	Savebtn.click();
}
}

