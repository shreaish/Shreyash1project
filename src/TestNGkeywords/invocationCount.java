package TestNGkeywords;

import org.testng.annotations.Test;

public class invocationCount
{
	
		@Test(invocationCount=2)
		public void priority2()
		{
			System.out.println("invocationCount=2");
		}

		@Test 
		public void priority1()
		{
			System.out.println("no priority no count");
		}

		@Test (priority=0,invocationCount=3)
		public void priority3()
		{
			System.out.println("priority 0,invocationCount=3");
		}

		@Test (invocationCount=0)
		public void ppriority2()
		{
			System.out.println("invocationCount=0");
		}

	

}
