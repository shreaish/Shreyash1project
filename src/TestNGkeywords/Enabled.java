package TestNGkeywords;

import org.testng.annotations.Test;

public class Enabled {

	@Test(invocationCount=2,enabled=false)
	public void priority2()
	{
		System.out.println("invocationCount=2");
	}

	@Test (timeOut=1000)
	public void priority1() throws InterruptedException
	{
		
		System.out.println("no priority no count");
	}

	@Test (priority=0,invocationCount=3)
	public void priority3()
	{
		System.out.println("priority 0,invocationCount=3");
	}
}
