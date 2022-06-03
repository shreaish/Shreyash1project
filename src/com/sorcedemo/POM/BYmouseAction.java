package com.sorcedemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BYmouseAction 
{
private WebDriver driver;
private Actions act;
private Select s;
	//username
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	public void username()
	{
		username.sendKeys("standard_user");
	}
	
	//password
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void password()
	{
		password.sendKeys("secret_sauce");
	}
	//clickbutton
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement clickbutton;
	public void loginbutton()
	{
		act.click( clickbutton).perform();
	}
	//select
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement fitterbutton;
	public void fitterbutton()
	{
		fitterbutton.click();
	s.selectByVisibleText("Price (low to high)");
	}
	public  BYmouseAction (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
		s=new Select (fitterbutton);
	}


	
}
