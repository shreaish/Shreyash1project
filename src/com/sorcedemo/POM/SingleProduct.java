package com.sorcedemo.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SingleProduct 
{
public WebDriver driver;
Select s;

//handle dropDown
@FindBy(xpath="//select[@class='product_sort_container']")
WebElement drop;
public SingleProduct(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void drop()
{
	s=new Select(drop);
	s.selectByVisibleText("Price (low to high)");
	
}
	//select single product
@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
WebElement singlepro;
public void singleselect()
{
singlepro.click();
	
}
//add to cart
@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement addcart;
public String singleadd()
{
String total= addcart.getText();
return total;
	
}
@FindBy(xpath="//button[text()='Add to cart']")
List<WebElement> multi;
public void multipleadd()
{
for(int i=0;i<multi.size();i++)
	
{
	multi.get(i).click();
}
}

}