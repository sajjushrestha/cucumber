package testng;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExceptionTest {
	

    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("Before test-class. Thread id is: " + id);
    }
 

	@Test(expectedExceptions = { IOException.class },expectedExceptionsMessageRegExp=".*Pas.*",dependsOnMethods= {"exceptionTestTwo" ,"exceptionTestThree"})
    public void exceptionTestOne() throws Exception {
		  long id = Thread.currentThread().getId();
		  System.out.println("dependentMehtod");
        throw new IOException("Pass*");
    }
 
    @Test(expectedExceptions = { IOException.class, NullPointerException.class },dataProvider="sajju")
    public void exceptionTestTwo(String name) throws Exception {
    	  long id = Thread.currentThread().getId();
    	  System.out.println(name);
        throw new IOException();
    }
    
    @Test(expectedExceptions = { IOException.class, NullPointerException.class })
    public void exceptionTestThree() throws Exception {
    	  long id = Thread.currentThread().getId();
    	  System.out.println(id);
        throw new IOException();
        
    }
    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("After test-class. Thread id is: " + id);
    }
    
    @DataProvider(name="sajju")
    public Object[][] data()
    {
    	Object[][] d=new Object[][] {{"data"},{"data1"}};
    	
    	
		return d;
    	
    }
}
