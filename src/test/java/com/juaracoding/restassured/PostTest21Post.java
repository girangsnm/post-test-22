package com.juaracoding.restassured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class PostTest21Post {
	
	@Test
	public void testPost() {
		JSONObject request = new JSONObject();
		request.put("Name", "John");
		request.put("Job", "QA Engineer");
		System.out.println(request.toJSONString());
		
		given()
		.header("Content-Type", "application/json")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(request.toJSONString())
		.when()
		.post("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(400)
		.log().all();
	}

}
