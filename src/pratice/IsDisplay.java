package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplay 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
driver.get("https://vctcpune.com/selenium/practice.html");
//textbox
WebElement textbox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
//hide button
WebElement hide=driver.findElement(By.xpath("//input[@id='hide-textbox'] "));
hide.click();
boolean r1=textbox.isDisplayed();
System.out.println(r1);     //false

//showw button
WebElement show=driver.findElement(By.xpath("//input[@id='show-textbox']"));
show.click();

boolean r2=textbox.isDisplayed();
System.out.println(r2);   //true

if(r1==true)
{
textbox.sendKeys("i am india");	
}
else
{
	textbox.sendKeys("always india");
}

//hide button

//show buttton
//text button

//1.hidebutton
//WebElement hide=driver.findElement(")

}
	

}
////input[@id='hide-textbox']   hide

////input[@id='show-textbox']   show

// text box
//"