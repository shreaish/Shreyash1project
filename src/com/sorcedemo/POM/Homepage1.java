package com.sorcedemo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage1
{
//globle webdriver
	//constructor

	private WebDriver driver;

	
	public Homepage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
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
	public void clickbutton()
	{
		clickbutton.click();
	}
	
	//single product select
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement singleproduct;
	public void singleproduct()
	{
		singleproduct.click();
	}
	
	

	//multi product
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> multiproduct;
	public void  multiproduct()
	{
	for(int i=0;i<multiproduct.size();i++)
	{
		multiproduct.get(i).click();
	}
	}
	//getTextfromcartbutton
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement getTest;
	public String  getTest()
	{
String actual=getTest.getText();
return actual;
	}


//menubutton
@FindBy(xpath="//button[@id='react-burger-menu-btn']")
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




}
//username  //input[@id='user-name']
//password  //input[@id='password']
//click    //input[@id='login-button']
//multi    //button[text()='Add to cart']
