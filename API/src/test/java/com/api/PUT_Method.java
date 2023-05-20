package com.api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT_Method {
	
	@Test
	public void putmethod()
	{
		RestAssured.baseURI="https://reqres.in/api/users/";
		
		RequestSpecification given = RestAssured.given();
		
		JSONObject obj=new JSONObject();
		
		obj.put("name", "Ram");
		obj.put("job", "BA");
		
		given.header("Content-Type", "application/json");
		
		given.body(obj.toJSONString());
		
		
		Response request = given.request(Method.PUT, "/2");
		
		
		String asString = request.getBody().asString();
		
		System.out.println(asString);
		
		System.out.println(request.getStatusCode());
	}

}
