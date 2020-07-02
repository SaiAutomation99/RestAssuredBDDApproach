package SerializationUsingGettersSetters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class SerializationMain {
	
	@Test
	public void jsonSerialization() {
		
		
		SerializationGetterSetter j=new SerializationGetterSetter();
		
		j.setFirstName("shb");
		j.setLastName("ioikm");
		j.setUserName("user");
		j.setPassword("uesrss");
		j.setEmail("mail12@gmail.com");
		
		given()
		.contentType(ContentType.JSON)
		.body(j)
		.when()
		.post("http://restapi.demoqa.com/customer/register")
		.then()
		.statusCode(201);
		
		
		
		
		
		
	}

}
