package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p1 
{
@AfterMethod (enabled=false)
public void method1()
{
	System.out.println("AfterTst");
}
@BeforeMethod
public void method2()
{
	System.out.println("before");
}
@Test(invocationCount=0)
public void method3()
{
System.out.println("test");	
}
}
