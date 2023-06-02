package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_HTTPMethod_PostEmailInvitation_TestSteps {
	Properties pr;

	public Post_HTTPMethod_PostEmailInvitation_TestSteps(Properties pr)
	{
		this.pr=pr;
	}
	//1-This API is used to send Email Invitations to one or more Email IDs to register their Business in Pineapple. : //
	public Response PostRequest_EmailInvitationWithRegisteredBusiness(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("BaseURI")+pr.getProperty(URIKey)+"/"+pr.getProperty("externalBusinessID"));
		return res;
	}

	//2-This API is used to send Email Invitations to one or more Email IDs to register their Business in Pineapple. : //
	public Response PostRequest_EmailInvitationWithInvitedBusiness(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("BaseURI")+pr.getProperty(URIKey)+"/"+pr.getProperty("Invited_externalBusinessID"));
		return res;
	}

}
