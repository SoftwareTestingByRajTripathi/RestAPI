package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_HTTPMethod_SignUP_TestSteps {
	Properties pr;

	public Post_HTTPMethod_SignUP_TestSteps(Properties pr)
	{
		this.pr=pr;
	}
	//1-This API used to SignUP, it generates external business ID--//
	public Response PostRequest_SignUP_API(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("BaseURI")+pr.getProperty(URIKey));
		return res;
	}


}
