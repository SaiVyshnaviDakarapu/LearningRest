package com.cucumber.Methods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class lottoAPImethods {

	String baseURL="";
	public lottoAPImethods() {
		// TODO Auto-generated constructor stub
	}
	
	Response response=null;
	
	
	void GetLootresponse(){
		
		
		RestAssured.baseURI="";
		RestAssured.given().accept("Application/json").when().get();
	}
}
