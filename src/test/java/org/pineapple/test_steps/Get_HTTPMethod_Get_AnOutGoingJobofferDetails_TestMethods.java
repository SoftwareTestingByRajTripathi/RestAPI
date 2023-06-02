package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_Get_AnOutGoingJobofferDetails_TestMethods {
	Properties pr;

	public Get_HTTPMethod_Get_AnOutGoingJobofferDetails_TestMethods(Properties pr){
		this.pr=pr;
	}
	public Response Get_Details_An_Outgoing_JobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID_OutgoingJobs")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_jobofferID"));
		return res;
	}
	public Response Get_Details_An_Outgoing_JobOffer_InvalidExternalID(String uriKey,String API_token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(uriKey)+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_jobofferID"));
		return res;
	}


}
