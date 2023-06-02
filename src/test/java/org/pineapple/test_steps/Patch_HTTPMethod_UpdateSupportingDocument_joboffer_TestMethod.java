package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.Properties;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Patch_HTTPMethod_UpdateSupportingDocument_joboffer_TestMethod {
	Properties pr;
	public  Patch_HTTPMethod_UpdateSupportingDocument_joboffer_TestMethod (Properties pr){
		this.pr=pr;
	}

	//This API allows a Business (functions a Contractor) to update supporting document when creating a Job Offer (quote)
	public Response Patch_httpMethod_OutgoingJobOffer_UpdateSupportingDocument( String urikey, String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);
		Response res =    given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document")
				.multiPart("fileName",new File("C:\\Users\\HimanshuP\\Pictures\\Screenshots\\Screenshot (1).png"),"image/png")
				.when().headers(newHeaders)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/supportingDocument/{docID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID")+pr.getProperty("SupportingDocEndPoint1")+pr.getProperty("SupportingDocOfferId")+pr.getProperty("SupportingDocEndPoint2")+pr.getProperty("docID"));

		return res;
	}

}
