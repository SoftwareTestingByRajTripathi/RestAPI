package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_An_OutgoingJobsDetails_TestSteps {
	Properties pr;

	public Get_HTTPMethod_An_OutgoingJobsDetails_TestSteps(Properties pr){
		this.pr=pr;
	}
	//11.1 Get Single Outgoing job details with Valid external ID//
	public Response Get_SingleOutgoingingJob_Details_Valid_ExternalBusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID_OutgoingJobs")+pr.getProperty("SingleJobDetails_EndPoint")+pr.getProperty("OutgoingjobID"));
		return res;
	}
	//11.2 Get Single Outgoing job details with Invalid externalID//
	public Response Get_SingleOutgoingingJob_Details_Invalid_ExternalBusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("SingleJobDetails_EndPoint")+pr.getProperty("OutgoingjobID"));
		return res;
	}
	//11.3 Get Single Outgoing job details with valid externalID and Invalid JobID//
	public Response Get_SingleOutgoingingJob_Details_Valid_ExternalBusinessID_Invalid_JobID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID_OutgoingJobs")+pr.getProperty("SingleJobDetails_EndPoint")+pr.getProperty("OutgoingInvalidJobID"));
		return res;
	}

}


