package com.sorcedemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductselectPOM
{
WebDriver driver;
@FindBy(xpath="//input[@class='_3704LK']")
WebElement textbox;
public void box()
{
	textbox.sendKeys("sumsung phone");
}

}
