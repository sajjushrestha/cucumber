package stepDefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpMap {

	WebDriver driver;

	@Given("^Open chrome$")
	public void open_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

	}

	
	@When("^we write firname and lasname$")
	public void we_write_firname_and_lasname(DataTable values) throws Throwable {
		for(Map<String,String> data : values.asMaps(String.class, String.class))
		
		{
	  driver.findElement(By.name("firstname")).sendKeys(data.get("firstname"));
	  driver.findElement(By.name("lastname")).sendKeys(data.get("lastname")); 
	  
	  driver.findElement(By.name("websubmit")).click(); 
		}
	  
	}
	 
	
	@Then("^I should be able to signup$")
	public void I_should_be_able_to_signup() throws Throwable {
	  
	  driver.findElement(By.name("websubmit")).click(); 
	  
	  
	  }
	  
	 

}
