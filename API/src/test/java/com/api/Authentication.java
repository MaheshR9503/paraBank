package com.api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authentication {
	
	
	@Test
	public void getAutherization()
	{
		
		RestAssured.baseURI="https://reqres.in/api/";
		
		RequestSpecification given = RestAssured.given();
		
		JSONObject reqPara=new JSONObject();
		reqPara.put("email", "eve.holt@reqres.in");
		reqPara.put("passord", "pistol");
		given.body(reqPara.toJSONString());

		Response request = given.request(Method.POST,"/register");
		
		
		String asString = request.getBody().asString();
		
		System.out.println(asString);
		
		
		System.out.println(request.getStatusCode());
		
	}

}
