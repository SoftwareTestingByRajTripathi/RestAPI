package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;
import java.util.Properties;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_OfferChangeLocation_joboffers {
	Properties pr;

	public Post_OfferChangeLocation_joboffers (Properties pr){
		this.pr=pr;
	}

	public Response Post_Details_ChangeofferLocation_validJobOffer(String uriKey,String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				/// /user/external/{externalBusinessID}/jobOffers
				//JobOffer_Details:user/external
				//JobOfferEndpoint:/jobOffers
				.post(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("JobOfferEndpoint"));

		return res;
	}

}
