package apitesting;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class RestAPI {

	@Test
	public void getMethod()
	{
		Response response = RestAssured.get("http://ergast.com/api/f1/2008.json");
		System.out.println(response.asString());
		int status=response.getStatusCode();
		System.out.println(response.getTimeIn(TimeUnit.SECONDS));
	}
	
	  @Test public void getMethodBDD() {
	  given().get("http://ergast.com/api/f1/2008.json").then().statusCode(200).log(
	  ).all(); }
	 
	
}
