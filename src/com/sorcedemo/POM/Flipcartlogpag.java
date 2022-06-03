package com.sorcedemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipcartlogpag
{
	WebDriver driver;
	
@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
WebElement username;
public void username()
{
	username.sendKeys("7038184381");
}

@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
WebElement password;
public void password()
{
	password.sendKeys("shreyash");
}
@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
WebElement click;
public void clickbutton()
{
	click.click();
}
public Flipcartlogpag(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
}