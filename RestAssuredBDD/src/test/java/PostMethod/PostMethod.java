package PostMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.LinkedHashMap;

public class PostMethod {
	
	public LinkedHashMap<String, String> link;

	
	@BeforeTest
	public void beforeTest() {
		
		link=new LinkedHashMap<String, String>();
		link.put("FirstName", "shbaxnsajkxnsa");
		link.put("LastName", "sxnknxk");
		link.put("UserName", "wtshhxbhh");
		link.put("Password", "wlwo789t");
		link.put("Email", "siaooxwa@gmail.com");


		
		
	}
	
	
	@Test
	public void postMethod() {
		
		
		given()
		.contentType("application/json")
		.body(link)
		.when().post("http://restapi.demoqa.com/customer/register")
		.then()
		.statusCode(201)
		.and()
		.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
		.and()
		.body("Message",equalTo("Operation completed successfully"));	
	}
}
