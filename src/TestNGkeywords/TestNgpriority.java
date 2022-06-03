package TestNGkeywords;

import org.testng.annotations.Test;

public class TestNgpriority
{
@Test (priority=2)
public void priority2()
{
	System.out.println("priority2");
}

@Test (priority=1)
public void priority1()
{
	System.out.println("priority1");
}

@Test (priority=0)
public void priority3()
{
	System.out.println("priority 0");
}

@Test (priority=-2)
public void ppriority2()
{
	System.out.println("priority-2");
}

@Test (priority=-1)
public void ppriority1()
{
	System.out.println("priority-1");
}
}
