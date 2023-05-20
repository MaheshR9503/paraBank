package com.api;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Post_Method {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/api/";
		
		RequestSpecification httpreq=RestAssured.given();
		
		JSONObject reqPara=new JSONObject();
		reqPara.put("name", "Mahesh");
		reqPara.put("job", "QA");
		
		httpreq.body(reqPara.toJSONString());
		
		Response request = httpreq.request(Method.POST, "/users");
		
		String string = request.getBody().toString();
		
		System.out.println("method body= "+string);
		
		
		int statusCode = request.getStatusCode();
		
		System.out.println(statusCode);
		
	}

}
