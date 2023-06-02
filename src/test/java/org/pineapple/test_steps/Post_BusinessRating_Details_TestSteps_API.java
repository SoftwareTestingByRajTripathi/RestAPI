package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_BusinessRating_Details_TestSteps_API {
	Properties pr;
	public Post_BusinessRating_Details_TestSteps_API(Properties pr) {
		this.pr=pr;
	}
	public Response Post_BusinessRating_Details(String uriKey,String API_token,String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///user/external/{externalBusinessID}/rating
				//user/external/{externalBusinessID}/job/outgoing/{jobID}/rating
				.post(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("Post_BusinessRatingexternalBusinessID")+"/"+pr.getProperty("BusinessRatingAnOutgoing_Offer")+pr.getProperty("BusinessRating_jobofferID")+"/rating");
		return res;
	}
	public Response Post_BusinessRatingDraftState_Details(String uriKey,String API_token,String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///user/external/{externalBusinessID}/rating
				//user/external/{externalBusinessID}/job/outgoing/{jobID}/rating
				.post(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("Post_BusinessRatingexternalBusinessID")+"/"+pr.getProperty("BusinessRatingAnOutgoing_Offer")+pr.getProperty("BusinessRating_Draft_jobofferID")+"/rating");
		return res;
	}
	public Response Post_BusinessRating_FieldReady_Details(String uriKey,String API_token,String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///user/external/{externalBusinessID}/rating
				//user/external/{externalBusinessID}/job/outgoing/{jobID}/rating
				.post(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("Post_BusinessRatingexternalBusinessID")+"/"+pr.getProperty("BusinessRatingAnOutgoing_Offer")+pr.getProperty("BusinessRating_jobofferID")+"/rating");
		return res;
	}
	public Response Post_BusinessRating_FieldStarted_Details(String uriKey,String API_token,String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///user/external/{externalBusinessID}/rating
				//user/external/{externalBusinessID}/job/outgoing/{jobID}/rating
				.post(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("Post_BusinessRatingexternalBusinessID")+"/"+pr.getProperty("BusinessRatingAnOutgoing_Offer")+pr.getProperty("BusinessRating_jobofferID")+"/rating");
		return res;
	}
}

