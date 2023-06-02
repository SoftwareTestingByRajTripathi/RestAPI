package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Patch_HTTPMethod_ResendBusinessRegistration_TestSteps {
	Properties pr;

	public Patch_HTTPMethod_ResendBusinessRegistration_TestSteps(Properties pr){
		this.pr=pr;
	}
	//3.1-- This API used to Re send Business registration: Invited Business//
	public Response ResendBusiness_registrationEmail(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.patch(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("Invited_externalBusinessID"));
		return res;
	}
	//3.2-- This API used to Re send Business registration: Registered Business//
	public Response ResendBusiness_registrationEmail1(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.patch(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID"));
		return res;
	}

	//3.3-- This API used to Re send Business registration: Registered Business//
	public Response ResendBusiness_registrationEmail2(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.patch(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID"));
		return res;
	}

}
