package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_GetPineappleBusinessID_TestSteps {
	Properties pr;
	public Get_HTTPMethod_GetPineappleBusinessID_TestSteps(Properties pr){
		this.pr=pr;
	}
	//2.1-- This API used to get Pineapple BusinessID-- Using Registered External BusinessID//
	public Response get_PineappleBusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID"));

		return res;
	}
	//2.2-- This API used to get Pineapple BusinessID-- Using Invalid External BusinessID//
	public Response get_PineappleBusinessID1(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID"));
		return res;
	}
	//2.3-- This API used to get Pineapple ID-- Using Invited External BusinessID//
	public Response get_PineappleBusinessID2(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("Invited_externalBusinessID"));
		return res;
	}

}
