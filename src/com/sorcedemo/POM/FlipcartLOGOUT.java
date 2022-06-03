package com.sorcedemo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlipcartLOGOUT 
{
	WebDriver driver;
	
@FindBy(xpath="//div[text()='Flipkart']")
WebElement button;
public void dropdown()
{button.click();
	
}


@FindBy(xpath="//div[text()='My Profile']")
WebElement my;
public void my()
{my.click();
	
}

@FindBy(xpath="//span[text()='Logout']")
WebElement logout;
public void logout()
{logout.click();
	
}


public FlipcartLOGOUT (WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

}
