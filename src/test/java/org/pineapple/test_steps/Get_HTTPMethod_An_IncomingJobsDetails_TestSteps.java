package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_An_IncomingJobsDetails_TestSteps {
	Properties pr;
	public Get_HTTPMethod_An_IncomingJobsDetails_TestSteps(Properties pr){
		this.pr=pr;
	}
	//9.1 Get Single incoming job details with Valid external ID//
	public Response Get_SingleIncomingJobs_Details_Valid_ExternalBusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID_incomingjobs")+pr.getProperty("SingleJobDetails_EndPoint")+pr.getProperty("jobID"));
		return res;
	}
	//9.2 Get Single incoming job details with Invalid externalID//
	public Response Get_SingleIncomingJobs_Details_Invalid_ExternalBusinessID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("SingleJobDetails_EndPoint")+pr.getProperty("jobID"));
		return res;
	}
	//9.3 Get Single incoming job details with valid externalID and Invalid JobID//
	public Response Get_SingleIncomingJobs_Details_Valid_ExternalBusinessID_Invalid_JobID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID_incomingjobs")+pr.getProperty("SingleJobDetails_EndPoint")+pr.getProperty("InvailidJobID"));
		return res;
	}
}
