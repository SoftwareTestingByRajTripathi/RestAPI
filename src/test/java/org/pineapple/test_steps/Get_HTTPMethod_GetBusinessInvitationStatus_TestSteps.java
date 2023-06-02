package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps {
	Properties pr;

	public Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps(Properties pr) {
		this.pr=pr;
	}
	//5.1 Get a Business Invitation Status with registered external business ID //

	public Response Get_Single_BusinessInvitation(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID"));
		return res;
	}
	//5.2 Get a Business Invitation list with registered Invited externalbusiness ID //

	public Response Get_Single_BusinessInvitation_Inviated_BusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("Invited_externalBusinessID"));
		return res;
	}
	//5.3 Get a Business Invitation list with registered Invalid externalbusiness ID //

	public Response Get_Single_BusinessInvitation_Invaild_BusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID"));
		return res;
	}

}
