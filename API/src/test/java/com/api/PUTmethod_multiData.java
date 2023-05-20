package com.api;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTmethod_multiData {
	
	@Test(dataProvider = "getData")
	public void putmultiData(String name, String job)
	{
		RestAssured.baseURI="https://reqres.in/api/users/";
		RequestSpecification given = RestAssured.given();
		
		JSONObject obj=new JSONObject();
		obj.put("name", name);
		obj.put("job", job);
		
		given.header("Content-Type", "application/json");

		given.body(obj.toJSONString());
		
		Response response = given.request(Method.PUT,"/2");
		
		String asString = response.getBody().asString();
		System.out.println(asString);
		
		System.out.println(response.getStatusCode());
		
		
		
	}
	
	@DataProvider
	public String[][] getData()
	{
		String data[][]= {{"Mahesh", "Test engineer"},{"Ayesha","Test Engineer"},{"Vrushali","Team lead"},{"Raksha","Test engineer"}};
	
		return data;
		
	}
	
	

}
