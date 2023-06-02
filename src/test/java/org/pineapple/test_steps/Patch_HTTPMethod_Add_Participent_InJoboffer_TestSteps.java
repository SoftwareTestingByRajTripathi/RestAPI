package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Patch_HTTPMethod_Add_Participent_InJoboffer_TestSteps {
	Properties pr;

	public Patch_HTTPMethod_Add_Participent_InJoboffer_TestSteps(Properties pr){
		this.pr=pr;
	}
	public Response Patch_AddParticipent_AnOutgoing_JobOffer_ValidExternalBusinessID(String uriKey,String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.patch(pr.getProperty("BaseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("EndPoint_Add_Participent")+pr.getProperty("jobofferID")+"/assignRemoveParticipants");
		return res;
	}
	public Response Patch_AddParticipent_AnOutgoing_JobOffer_InvalidExternalBusinessID(String uriKey,String API_token,String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.patch(pr.getProperty("BaseURI")+pr.getProperty(uriKey)+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("EndPoint_Add_Participent")+pr.getProperty("jobofferID")+"/assignRemoveParticipants");
		return res;
	}
}
