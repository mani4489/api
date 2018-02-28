package com.api.test;

import static io.restassured.RestAssured.get;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class APITesting {
	
	@Test
	public void getData()
	{
		Response response =	get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=00b1fcc77b39917589ee740d990cf0e0");
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.asString());
		
		System.out.println(response.getTime());
	}

}
