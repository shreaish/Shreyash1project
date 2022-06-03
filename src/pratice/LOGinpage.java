package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LOGinpage 
{   //ANNOTATION 
	//loginpage
	//1.username
	//2.password
	//3.clickbuttton
	WebDriver driver;
	//1.
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	
	public void username()
	{
		username.sendKeys("standard_user");
	}
	//2.
	@FindBy(xpath="//input[@id='password']")
			WebElement password;
	public void password()
	{
		password.sendKeys("secret_sauce");
	}
	//3.
	@FindBy(xpath="//input[@id='login-button']")
	WebElement clickbutton;
	public void clickbutton()
	{
		clickbutton.click();
	}
	
	
	
}
