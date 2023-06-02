package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_HTTPMethod_RegisterWebhook_TestSteps {
	Properties pr;

	public Post_HTTPMethod_RegisterWebhook_TestSteps(Properties pr){
		this.pr=pr;
	}
	public Response RegisterWebhookDetails_InJobOfferwithValidExternalID(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("BaseURI")+pr.getProperty(URIKey)+"/"+pr.getProperty("externalBusinessID")+"/"+pr.getProperty("registerWebhookEndPoint"));
		return res;

	}
	public Response RegisterWebhookDetails_InJobOfferwithInvalidExternalID(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("BaseURI")+pr.getProperty(URIKey)+"/"+pr.getProperty("invalid_externalBusinessID")+"/"+pr.getProperty("registerWebhookEndPoint"));
		return res;


	}
}