package com.juaracoding.restassured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostTest22 {
	
	@Test
	public void testPut() {
		JSONObject request = new JSONObject();
		request.put("Name", "John English");
		request.put("Job", "SQA Engineer");
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
	
	@Test
	public void testPatch() {
		JSONObject request = new JSONObject();
		request.put("Name", "John English");
		request.put("Job", "SQA Engineer");
		
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
	
	@Test
	public void testDelete() {
		when()
		.delete("https://mern-backend-8881.herokuapp.com/products")
		.then()
		.statusCode(404)
		.log().all();
	}

}
