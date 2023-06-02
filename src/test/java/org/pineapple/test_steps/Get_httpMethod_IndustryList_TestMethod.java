package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_httpMethod_IndustryList_TestMethod {
	Properties pr;
	public Get_httpMethod_IndustryList_TestMethod(Properties pr){
		this.pr=pr;
	}
	public Response Get_httpMethod_IndustryList_Api_Withoutdata(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("baseURI")+pr.getProperty(urikey)+pr.getProperty("IndustryListEndpoint"));
		return res;
	}
	public Response Get_httpMethod_IndustryList_Api_Withdata(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("baseURI")+pr.getProperty(urikey));
		return res;
	}
	public Response Get_httpMethod_IndustryList_Api_AutoMobiledata(String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("baseURI")+pr.getProperty(urikey));
		return res;
	}
	public Response Get_httpMethod_IndustryList_Api_InvalidToken(String urikey,String API_Token){

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("baseURI")+pr.getProperty(urikey)+pr.getProperty("IndustryListEndpoint"));
		return res;
	}

}
