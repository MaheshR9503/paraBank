package com.api;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_GetResponseBodyValues {
	
	@Test
	public void getResposeValues()
	{
		RestAssured.baseURI="https://reqres.in/api/users/";
		RequestSpecification given = RestAssured.given();
		
		Response res = given.request(Method.GET, "/1");
		
		String asString = res.getBody().asString();
		System.out.println(asString);
		
		JsonPath jpath=res.jsonPath();
		
		System.out.println(jpath.get("data"));
		  
		System.out.println(jpath.get("data.id"));
		
//		System.out.println(jpath.get("email"));
//		System.out.println(jpath.get("first_name"));
//		System.out.println(jpath.get("last_name"));
//		System.out.println(jpath.get("avatar"));



		
	}

}
