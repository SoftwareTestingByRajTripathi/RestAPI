package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_httpMethod_ChangeJobOfferState_Test {
	Properties pr;
	public Post_httpMethod_ChangeJobOfferState_Test(Properties pr) {

		this.pr=pr;
	}
	//This API is used to place the Job Offer (quote) of the business (functions a contractor) on Market and/or to Award the Job Offer (quote) to a participant. 
	public Response Post_ChangeJobofferState_ValidBusinessId(String bodydata, String urikey, String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("changeOfferStateexternalID")+pr.getProperty("ChangeJobOfferState_Endpoint1")+"/"+pr.getProperty("DraftofferID")+"/changeJobOfferState");
		return res;
	}
	public Response Post_ChangeJobofferState_InValidBusinessId(String bodydata, String urikey, String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("OfferStateexternalID")+pr.getProperty("ChangeJobOfferState_Endpoint1")+"/"+pr.getProperty("DraftofferID")+"/changeJobOfferState");
		return res;
	}
	public Response Post_ChangeJobofferState_OpenToAwardState(String bodydata, String urikey, String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("OfferStateexternalID")+pr.getProperty("ChangeJobOfferState_Endpoint1")+"/"+pr.getProperty("OpenOfferId")+"/changeJobOfferState");
		return res;
	}

}
