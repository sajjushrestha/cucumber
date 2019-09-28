package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginFunct {

	WebDriver driver;

	@Given("^Open chrome browser and start application$")
	public void open_chrome_browser_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://facebook.com");

	}

	
	  @When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$") 
	  public void i_enter_with_valid_credentials(String usr, String pwd) throws Throwable {
	  driver.findElement(By.id("email")).sendKeys(usr);
	  driver.findElement(By.id("pass")).sendKeys(pwd); }
	 
	
	  @Then("^user should be able to login to application$") 
	  public void  user_should_be_able_to_login_to_application() throws Throwable {
	  
	  driver.findElement(By.xpath(".//input[@value='Log In']")).click(); 
	  
	  
	  }
	  
	 

}
