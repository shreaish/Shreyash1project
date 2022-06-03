package com.sorcedemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
private WebDriver driver;
private Actions act;
//username
@FindBy(xpath="//input[@id='user-name']")
private WebElement user;
public void username()
{
	user.sendKeys("standard_user");
	
}
//password	
@FindBy(xpath="//input[@id='password']")
private WebElement pass;
public void password()
{
	pass.sendKeys("secret_sauce");
}

//clickbutton

@FindBy(xpath="//input[@id='login-button']")
private WebElement click;

public void clickbutton()
{
act.click(click).perform();
}
//constructor
public Loginpage (WebDriver driver)
{
this.driver=driver;
act=new Actions(driver);
PageFactory.initElements(driver, this);
	}


}
