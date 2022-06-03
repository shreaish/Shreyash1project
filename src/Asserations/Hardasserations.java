package Asserations;

import org.apache.xml.security.binding.xmlenc11.PBKDF2ParameterType.Salt;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardasserations 
{
  @Test 
  public void method()
  {
	String act="shreyash";
	String Exp="shreyafdfgsh";
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(act,Exp,"actual and expected title not match");

	
	
	soft.assertTrue(5>3,"test case is falied 5 is grater than 3");

	soft.assertAll();
	  
  }
}
