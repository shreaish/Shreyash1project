package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Accertion 

	{@Test
		public void method1()
		{
		String Actualresult="Shreys";
		String Expectedresult="Shrehys";

	Assert.assertEquals(Actualresult,Expectedresult,"test is failed");
		
		String Actualresult1="Deulkar";
		String Expectedresult1="Deulkar";
	Assert.assertEquals(Actualresult1, Expectedresult1);
	
		}		
}
