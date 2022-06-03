package TestNGkeywords;

import org.testng.annotations.Test;

public class Depanedsonmethod
{
	@Test(invocationCount=2,timeOut=2000)
	public void priority2() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("invocationCount=2");
	}

	@Test (dependsOnMethods= {"priority2"})
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
