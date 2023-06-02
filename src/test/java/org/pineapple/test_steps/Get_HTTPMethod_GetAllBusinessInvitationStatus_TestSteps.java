package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_GetAllBusinessInvitationStatus_TestSteps {
	Properties pr;

	public Get_HTTPMethod_GetAllBusinessInvitationStatus_TestSteps(Properties pr){
		this.pr=pr;
	}
	//6 Get all Business Invitation status list: This API returns the total number of Businesses in Subeez along with the Business details and it's Invitation status ('Invited' or 'Registered') for each Business. //
	public Response Get_AllBusinessInvitation(String urikey,String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.get(pr.getProperty("BaseURI")+pr.getProperty(urikey));
		return res;
	}

}
