package com.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetMethod_Header {
	
	@Test
	public void printHeader()
	{
		RestAssured.baseURI="https://reqres.in/api/users/";
		
		
		RequestSpecification httpRespose = RestAssured.given();
		
		Response request = httpRespose.request(Method.GET, "/3");
		
		
		String body = request.getBody().asString();
		
		Assert.assertEquals(body.contains("emma.wong@reqres.in"), false,"Assert pass");
		
		
		System.out.println(body);
		
		System.out.println();
		
		Headers headers = request.headers();
		
		for(Header header:headers)
		{
			System.out.println(header.getName()+"                             "+header.getValue());
		}
		
	}

}
