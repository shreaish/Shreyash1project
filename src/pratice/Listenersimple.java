package pratice;

import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Listeners;
@Listeners(com.utility.souce.Listeners.class)
public class Listenersimple

{

@Test
public void varifiacation()
{
	Assert.assertTrue(true);
}
	
@Test
public void varifiacation1()
{
	Assert.assertTrue(false);
}
	
	
}
