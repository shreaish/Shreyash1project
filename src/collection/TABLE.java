package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TABLE
{
public static void main(String[] args) 
{
	
	System.setProperty("webdriver.gecko.driver"
		,"G:\\Automation\\mozela\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();
driver.get("https://vctcpune.com/selenium/practice.html");
//single element find
WebElement column=driver.findElement(By.xpath("//th[text()='Instructor']"));
System.out.println(column);

List<WebElement> alldata=driver.findElements(By.xpath("//table//tbody//tr//td"));
System.out.println(alldata.size());
for(int j=0;j<=alldata.size();j++)
{
	System.out.println(alldata.get(j).getText());
}

}}