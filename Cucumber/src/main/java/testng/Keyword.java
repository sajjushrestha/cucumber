package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Keyword {

	@Test
	@Parameters({"stri"})
	public void key1(@Optional("browser") String stri)
	{
		System.out.println(stri);
		 SoftAssert softAssert = new SoftAssert();
		 
		 //Creating softAssert object
		   
		   
		   //Assertion failing
		   softAssert.fail("Failing first assertion");
		   System.out.println("Failing 1");
		   
		   //Assertion failing
		   softAssert.fail("Failing second assertion");
		   System.out.println("Failing 2");

		   //Assertion passing
		   softAssert.assertEquals(1, 1, "Passing third assertion");
		   System.out.println("Passing 3");

		   //Collates the assertion results and marks test as pass or fail
		 //  softAssert.assertAll();
	}
	
	public void key2()
	{
		
	}
}
