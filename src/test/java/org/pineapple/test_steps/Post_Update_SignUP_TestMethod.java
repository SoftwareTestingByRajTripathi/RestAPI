package org.pineapple.test_steps;

import java.util.Properties;
import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
public class Post_Update_SignUP_TestMethod {
	Properties pr;
	public Post_Update_SignUP_TestMethod(Properties pr) {
		this.pr=pr;
	}
	public Response PostRequest_SignUP_API(String bodydata,String URIKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodydata)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(URIKey));
		return res;

	}
}