package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
 
public class Get_httpMethod_BusinessConnection_TestMethod {
	
		Properties pr;

		public Get_httpMethod_BusinessConnection_TestMethod(Properties pr){
			this.pr=pr;

}
		//This Method provides a list of all Business Connections for a Business//
		public Response Get_BusinessConnection_ID(String urikey,String API_Token){
			Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
			Response res =	given()
					.contentType(ContentType.JSON)
					.when()
					.header(objHeader)
					.get(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("BusinessConnectionEndPoint"));
			return res;
}
		//This Method provides a list of all Business Connections for a Business//..InvalidExternalId
		public Response Get_BusinessConnection_InvalidExternalID(String urikey,String API_Token){
			Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
			Response res =	given()
					.contentType(ContentType.JSON)
					.when()
					.header(objHeader)
					.get(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("BusinessConnectionEndPoint"));
			return res;
}
		//This Method provides a list of all Business Connections for a Business//..InvalidAPIKey
		public Response Get_BusinessConnection_InvalidAPIKey(String urikey,String API_Token){
			Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
			Response res =	given()
					.contentType(ContentType.JSON)
					.when()
					.header(objHeader)
					.get(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("BusinessConnectionEndPoint"));
			return res;
}
		
}