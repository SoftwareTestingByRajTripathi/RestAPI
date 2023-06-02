package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_BusinessRating_Deatails_TestStep_API {
	Properties pr;
	public  Get_BusinessRating_Deatails_TestStep_API(Properties pr)
	{
		this.pr=pr;
	}
	public Response Get_BusinessRating_Details(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/rating
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("BusinessRating_externalBusinessID")+pr.getProperty("BusinessRating_Endpoint"));
		return res;
	}
	public Response Get_BusinessRating_Details_UnVerifiedExternalID(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/rating
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("Unverified_externalBusinessID")+pr.getProperty("BusinessRating_Endpoint"));
		return res;
	}
	public Response Get_BusinessRating_Details_InValidExternalID(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/rating
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("BusinessRating_InValidexternalBusinessID")+pr.getProperty("BusinessRating_Endpoint"));
		return res;
	}
	public Response Get_BusinessRating_Details_Null_ExternalBusinessID(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/rating
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("BusinessRating_Null_externalBusinessID")+pr.getProperty("BusinessRating_Endpoint"));
		return res;
	}



}
