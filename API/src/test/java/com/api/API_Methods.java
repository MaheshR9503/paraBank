package com.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class API_Methods {
	
	
	@Test
	public void getMehtod(){

	String url=RestAssured.baseURI="https://reqres.in/api/users?page=2";
	Response rs=RestAssured.request(Method.GET,url);
	int statusCode = rs.getStatusCode();
	
	Assert.assertEquals(statusCode, 200);
	
	String asString = rs.getBody().asString();
	System.out.println("method body= "+asString);
	
	String contentType = rs.getContentType();
	System.out.println("content type= "+contentType);
	}
	
	
	
}
