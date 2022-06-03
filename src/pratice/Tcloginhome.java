package pratice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tcloginhome
{

public static void main(String[] args)
{
System.setProperty("webdriver.gecko.driver"
		,"G:\\Automation\\mozela\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
Loginhomepage hp=new Loginhomepage (driver);
hp.username();
System.out.println("username");
hp.password();
System.out.println("password");
hp.clickbutton();
System.out.println("click login button");
hp.clickmenubutton();
System.out.println("menu button");

hp.logout();
System.out.println("click");
driver.quit();
System.out.println("end of program");

}
}