package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps {
	Properties pr;
	public Get_HTTPMethod_GetAllIncomingJobsDetails_TestSteps(Properties pr) {
		this.pr=pr;
	}
	//7.1 Get all incoming job details with valid external ID//
	public Response Get_All_Incoming_jobs_details(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID")+pr.getProperty("Incoming_jobEndpoint"));
		return res;
	}
	//7.2 Get all incoming job details with invalid external ID//
	public Response Get_All_Incoming_jobs_details_InvalidID(String urikey,String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("Incoming_jobEndpoint"));
		return res;
	}
	//7.3 Get all incoming job details with invited external ID//
	public Response Get_All_Incoming_jobs_details_Inviated_ExternalBusinessID(String urikey,String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("Invited_externalBusinessID")+pr.getProperty("Incoming_jobEndpoint"));
		return res;
	}

}
