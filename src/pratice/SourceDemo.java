package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SourceDemo
{
public static void main(String arhs[])
{
	System.setProperty("webdriver.gecko.driver","G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.saucedemo.com");
	//get attribute
WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
String id=user.getAttribute("id");
System.out.println(id);
//get text
String text=user.getText();
System.out.println(text);
//get tagname
String tag=user.getTagName();
System.out.println(tag);
}
}
