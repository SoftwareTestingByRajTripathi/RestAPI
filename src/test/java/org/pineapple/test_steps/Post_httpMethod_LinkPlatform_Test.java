package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_httpMethod_LinkPlatform_Test {
	Properties pr;

	public Post_httpMethod_LinkPlatform_Test(Properties pr){
		this.pr=pr;
	}

	public Response Post_LinkPlatform_TestScript(String bodydata, String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+pr.getProperty("LinkPlatformEndPoint"));
		return res;
	}
	public Response Post_LinkPlatform_TestScript_InvalidCode(String bodydata, String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+pr.getProperty("LinkPlatformEndPoint"));
		return res;
	}
	public Response Post_LinkPlatform_TestScript_UnverifiedEmail(String bodydata, String urikey,String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+pr.getProperty("LinkPlatformEndPoint"));
		return res;
	}
}
