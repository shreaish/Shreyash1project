package pratice;

import org.testng.annotations.Test;

public class TestNGkeyword 
{
@Test
public void method1()
{
	System.out.println("no priority method1");
}
@Test (priority=1)
public void method3()
{
System.out.println("priority 1");	
}

@Test (priority=2)
public void method7()
{
System.out.println("priority 1");	
}

@Test (priority=-1)
public void method4()
{
System.out.println("priority 4");	
}
@Test (priority=0)
public void method5()
{
System.out.println("priority 0");	
}
@Test (priority=-2)
public void method6()
{
System.out.println("priority -2");	
}
}
