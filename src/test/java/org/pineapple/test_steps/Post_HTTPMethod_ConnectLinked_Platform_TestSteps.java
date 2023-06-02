package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_HTTPMethod_ConnectLinked_Platform_TestSteps {
	Properties pr;

	public Post_HTTPMethod_ConnectLinked_Platform_TestSteps(Properties pr){
		this.pr=pr;
	}
	//This method used to Linked business //
	public Response Post_LinkedPlatform_ValidExternalBusinessID(String bodydata,String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=	given().contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty(uriKey));
		return res;

	}


}
