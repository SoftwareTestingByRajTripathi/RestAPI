package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_HTTPMethod_PostJoboffer_TestSteps {

	Properties pr;

	public Post_HTTPMethod_PostJoboffer_TestSteps(Properties pr){
		this.pr=pr;
	}
	//10.1 Post job offer with pass all Parameter with valid External BusinessID//
	public Response Post_JobOffer(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("BaseURI")+pr.getProperty(URIKey)+"/"+pr.getProperty("JobOfferexternalBusinessID")+"/"+pr.getProperty("endpoint_joboffer"));
		return res;
	}
	//10.2 Post job offer with pass all Parameter with invalid External BusinessID//
	public Response Post_JobOffer_Invalid_ExternalBusinessID(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("BaseURI")+pr.getProperty(URIKey)+"/"+pr.getProperty("invalid_externalBusinessID")+"/"+pr.getProperty("endpoint_joboffer"));
		return res;

	}
	public Response Post_JobOffer_500Char_JObTitle_valid_ExternalBusinessID(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("BaseURI")+pr.getProperty(URIKey)+"/"+pr.getProperty("externalBusinessID")+"/"+pr.getProperty("endpoint_joboffer"));
		return res;

	}

}
