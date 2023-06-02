package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Patch_HTTPMethod_UpdateJobDetails_TestSteps {
	Properties pr;

	public Patch_HTTPMethod_UpdateJobDetails_TestSteps(Properties pr)
	{
		this.pr=pr;
	}

	public Response UpdateJobsDetails_ValidExternalBusinessID(String urikey,String API_Token,String body_data){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res = given()
				.contentType(ContentType.JSON)
				.body(body_data)
				.when()
				.header(objHeader)
				.patch(pr.getProperty("BaseURI")+pr.getProperty(urikey)+pr.getProperty("externalBusinessID_OutgoingJobs")+pr.getProperty("Update_outgoingjob")+pr.getProperty("OutgoingjobID"));
		return res;
	}
	public Response UpdateJobsDetails_InvalidExternalBusinessID(String urikey,String API_Token,String body_data)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res = given()
				.contentType(ContentType.JSON)
				.body(body_data)
				.when()
				.header(objHeader)
				.patch(pr.getProperty("BaseURI")+pr.getProperty(urikey)+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("Update_outgoingjob")+pr.getProperty("OutgoingjobID"));
		return res;
	}
}
