package pratice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PratieceMethod 
{
@BeforeMethod
public void SetupMethod()
{
	System.out.println("Browser is open");
}
@Test
public void validation1()
{
	System.out.println("validatig funtonlity");
}
@Test
public void validation2()
{
	System.out.println("validatig funtonlity-2");
}
@AfterMethod
public void tearDown()
{
	System.out.println("browser is closed");
}
	
}