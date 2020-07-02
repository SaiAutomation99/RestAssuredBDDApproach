package GetMethodUsingBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetMethod {
	
	
	@Test
	public void getMethod() {
		
		
		given()
		.when().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200);
		
		
		
		
		
		
	}

}
