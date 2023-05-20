package com.api;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_methods {
	
	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://reqres.in/api/users/";
		
		RequestSpecification httpreq=RestAssured.given();
		
		Response request = httpreq.request(Method.GET,"/2");
		
		String body = request.getBody().asString();
		
		System.out.println("Request body= "+body);
		
		int statusCode = request.getStatusCode();
		
		System.out.println("status code= "+statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		String header = request.getHeader("Content-type");
		System.out.println(header);
		
		
		
		
		
	}

}
