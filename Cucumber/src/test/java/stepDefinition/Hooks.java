package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Hooks {
	
	@Before
	public void setUp()
	{
		System.out.println("global before");
	}
	
	
	@After
	public void close()
	{
		System.out.println("global after");
	}
	
	@Before("@first")
	public void bsetUp()
	{
		System.out.println("first before");
	}
	
	@Before("@sec")
	public void bcsetUp()
	{
		System.out.println("second before");
	}
	
	
	@After("@first")
	public void bcclose()
	{
		System.out.println("first after");
	}
	@After("@sec")
	public void bvclose()
	{
		System.out.println("second after");
	}
	
	@Given("^scenarios oneone$")
	public void scenarios_oneone() throws Throwable {
	   
		System.out.println("fiststep");
	}

	@Given("^scenario twotwo$")
	public void scenario_twotwo() throws Throwable {
		System.out.println("secstep");
	}
	
	@Given("^scenariod twothree$")
	public void scenariod_twothree() throws Throwable {
		System.out.println("thirdstep");
	}


	
}
