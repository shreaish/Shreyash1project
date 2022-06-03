package pratice;

import org.testng.annotations.Test;

public class Timeout 
{
@Test(timeOut=2000)
public void m1()
{
	System.out.println("test pass");
}
@Test(timeOut=2000)
public void m2() throws InterruptedException
{
	

	System.out.println("tase falied");
}

}
