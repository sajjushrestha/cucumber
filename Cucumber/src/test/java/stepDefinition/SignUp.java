package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUp {

	WebDriver driver;

	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

	}

	
	@When("^I write firname and lasname$")
	public void i_write_firname_and_lasname(DataTable values) throws Throwable {
		  List<List<String>> data=values.raw();
	  driver.findElement(By.name("firstname")).sendKeys(data.get(0).get(0));
	  driver.findElement(By.name("lastname")).sendKeys(data.get(0).get(1)); }
	 
	
	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	  
	  driver.findElement(By.xpath(".//input[@value='Log In']")).click(); 
	  
	  
	  }
	  
	 

}
