package com.sorcedemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogOutPOM
{private WebDriver driver;
	//username
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	public void  username()
	{
		username.sendKeys("standard_user");
	}
	//password
	@FindBy(xpath="//button[@id='password']")
	private WebElement password;
	private Select s;
	public void  password()
	{
		password.sendKeys("secret_sauce");
	}
	//loginbutton
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginbutton;
	public void loginbutton()
	{
		loginbutton.click();
	}

	public LogOutPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		s=new Select(filterbutton);
	
}
	//menubutton
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menubutton;
	public void  menubutton()
	{
		 menubutton.click();
	}

	//logout
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	public void logout()
	{
		logout.click();
	}
	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement filterbutton;
	public void  filterbutton()
	{filterbutton.click();
		s.deselectByVisibleText("Price (high to low)");
	}


	
	
}