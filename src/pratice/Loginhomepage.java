package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginhomepage 
{
	private WebDriver driver;
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
	click.click();;
	}
	//constructor
	public Loginhomepage (WebDriver driver)
	{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//button[text()='Open Menu']")
	private WebElement menubutton;
	public void clickmenubutton()
	{
		menubutton.click();
	}
	//logoutbutton
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout1;
	public void logout()
	{
		logout1.click();
	}

}
