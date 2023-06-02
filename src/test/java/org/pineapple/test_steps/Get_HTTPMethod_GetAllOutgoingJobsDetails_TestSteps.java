package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps {
	Properties pr;
	public Get_HTTPMethod_GetAllOutgoingJobsDetails_TestSteps(Properties pr){
		this.pr=pr;
	}
	//8.1 Get all Outgoing job details with valid external ID//
	public Response Get_All_Outgoing_jobs_detailsValilExternalBusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID_OutgoingJobs")+pr.getProperty("OutgoingJobs_Endpoint"));
		return res;
	}

	//8.2 Get all Outgoing job details with invalid external ID//
	public Response Get_All_Outgoing_jobs_details_InvalidID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("OutgoingJobs_Endpoint"));
		return res;
	}
	//8.3 Get all Outgoing job details with invited external ID//
	public Response Get_All_Outgoing_jobs_details_Inviated_ExternalBusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("Invited_externalBusinessID")+pr.getProperty("OutgoingJobs_Endpoint"));
		return res;
	}

}
