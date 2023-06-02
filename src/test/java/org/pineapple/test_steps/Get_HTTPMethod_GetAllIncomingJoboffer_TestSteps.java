package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_GetAllIncomingJoboffer_TestSteps {
	Properties pr;
	public Get_HTTPMethod_GetAllIncomingJoboffer_TestSteps(Properties pr){
		this.pr=pr;
	}
	//11.1 This method help to get all Incoming job offer details in business - Valid External BusinessID//
	public Response Get_AllIncoming_JobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(uriKey)+"/"+pr.getProperty("externalBusinessID")+"/"+pr.getProperty("EndPoint_IncomingJoboffer"));
		return res;
	}
	//11.2 This method help to get all Incoming job offer details in business - Valid External BusinessID//
	public Response Get_AllIncoming_JobOffer_InvalidExternalBusinessID(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(uriKey)+"/"+pr.getProperty("invalid_externalBusinessID")+"/"+pr.getProperty("EndPoint_IncomingJoboffer"));
		return res;
	}

}
