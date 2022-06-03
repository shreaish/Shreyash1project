package com.sorcedemo.TESTcase;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
private WebDriver driver;

//menubutton
@FindBy(xpath="//button[text()='Open Menu']")
private WebElement menubutton;
public void clickmenubutton()
{
	menubutton.click();
}
//logoutbutton
@FindBy(xpath="//a[text()='Logout']")
private WebElement logout1;
public void logout()
{
	logout1.click();
}
public Homepage(WebDriver driver)
{
	this.driver=driver;


PageFactory.initElements(driver, this);	
}
}
