package ValidateXML;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ValidateXML {
	
	
	//validating xml
	
	@Test(priority = 0)
	public void validateXML() {
		
		
		given()
		.when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.log().all()
		.body("CUSTOMER.ID",equalTo("15"));
		
		
	}
	
	//using text() 
	
	@Test(priority =1)
	public void text() {
		
		
		given()
		.when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.log().all()
		.body("CUSTOMER.text()",equalTo("15BillClancy319 Upland Pl.Seattle"));

	}
	
	//xpath using xml
	
	@Test
	public void xmlXpath() {
		
		
		given()
		.when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
		.body(hasXPath("/CUSTOMER/ID[text()='15']"));
		
		
		
	}
	
	
	
	
	
	
	
	

}
