package com.sorcedemo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SinglemutiSelectPOM 
{
private WebDriver driver;
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
WebElement singleselect;

public SinglemutiSelectPOM(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void singleselect()
{
	
}

@FindBy(xpath="//button[text()='Add to cart']")
List<WebElement> multiselect;

public void multiselect()
{for(int i=0;i<multiselect.size();i++)
{ multiselect.get(i).click();
	
}
}
@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement addtocard;

public String addtocard()
{
	String a=addtocard.getText();
return a;
}
}
