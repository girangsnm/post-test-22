package com.juaracoding.restassured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostTest21Get {

	String endpoint = "https://mern-backend-8881.herokuapp.com/products";

	@Test
	public void testStatusCode() {
		Response response = RestAssured.get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());

		int actual = response.getStatusCode();
		assertEquals(actual, 200);
	}
	
	@Test
	public void testIdOne() {
		given().get(endpoint).then().statusCode(200).body("data.id[0]", equalTo(1));
	}

}
