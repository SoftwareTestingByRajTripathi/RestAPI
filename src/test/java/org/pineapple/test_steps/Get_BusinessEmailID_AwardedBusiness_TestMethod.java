package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;


import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

//Code Status -- OK
public class Get_BusinessEmailID_AwardedBusiness_TestMethod {
	Properties pr;

	public Get_BusinessEmailID_AwardedBusiness_TestMethod(Properties pr){
		this.pr=pr;
	}
	//This API displays the business Email address of the business (functions as sub-contractor) who has been awarded the Job Offer (quote).
	public Response Get_BusinessEmailID_AwardedBusiness(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("getawardedendpoint1")+"/"+pr.getProperty("OfferId")+pr.getProperty("getawardedendpoint2"));
		return res;
	}
}