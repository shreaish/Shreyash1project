package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardassertion
{@Test
	public void method1()
	{
	String Actualresult="Shreyas";
	String Expectedresult="Shreyas";
SoftAssert soft=new SoftAssert();
soft.assertEquals(Actualresult,Expectedresult);
	
	String Actualresult1="Deulkar";
	String Expectedresult1="Deulkar";
	soft.assertEquals(Actualresult1, Expectedresult1);
soft.assertAll();
	
	}
@Test
public void method2()
{
	Assert.assertTrue(true);
}

}
