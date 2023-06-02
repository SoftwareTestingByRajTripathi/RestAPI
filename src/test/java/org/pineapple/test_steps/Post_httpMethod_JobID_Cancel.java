package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_httpMethod_JobID_Cancel {
	Properties pr;

	public Post_httpMethod_JobID_Cancel(Properties pr){
		this.pr=pr;
	}
	//This API allows the Business having contracting function to cancel a posted job 
	public Response Post_OutgoingJobId_Cancel(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("CancelJob_Details_EndPoint1")+"/"+pr.getProperty("CancelJobID")+"/cancel");
		return res;
	}
	//This API allows the Business having contracting function to cancel a posted job....InvalidExternalId
	public Response Post_OutgoingJobId_CancelInvalidExternal(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("CancelJob_Details_EndPoint1")+"/"+pr.getProperty("Cancel_ValidJobID")+"/cancel");
		return res;

	}
	//This API allows the Business having contracting function to cancel a posted job ....InvalidJobId
	public Response Post_OutgoingJobId_Cancel_InvalidJobID(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("CancelJob_Details_EndPoint1")+"/"+pr.getProperty("Cancel_InvalidJobID")+"/cancel");
		return res;
	}
	//This API allows the Business having contracting function to cancel a posted job.....InvalidAccessToken
	public Response Post_OutgoingJobId_Cancel_InvalidAccessToken(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("CancelJob_Details_EndPoint1")+"/"+pr.getProperty("Cancel_ValidJobID")+"/cancel");
		return res;
	}
	//This API allows the Business having contracting function to cancel a posted job ....InvalidServerUrl
	public Response Post_OutgoingJobId_Cancel_InvalidServerUrl(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("InvalidBaseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("CancelJob_Details_EndPoint1")+"/"+pr.getProperty("Cancel_ValidJobID")+"/cancel");
		return res;
	}
}



