package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.Properties;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;


public class Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod {
	Properties pr;


	public Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod(Properties pr) {

		this.pr=pr;
	}
	//public void UploadFile() {
	//	File file = new File("C:\\Users\\Rakhi Bansal\\Pictures\\Screenshots\\Screenshot (18).png");
	//}
	//This API allows a Business (functions a Contractor) to provide supporting document when creating a Job Offer (quote)
	public Response Post_httpMethod_OutgoingJobOffer_UploadSupportingDocument( String urikey, String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);


		Response res =	given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document")
				.multiPart("fileName",new File("C:\\Users\\Rakhi Bansal\\Pictures\\Screenshots\\Screenshot (18).png"),"image/png")
				.when().headers(newHeaders)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("supportingdocExternalID")+pr.getProperty("SupportingDocEndPoint1")+"/"+pr.getProperty("SupportingDocOfferId")+pr.getProperty("SupportingDocEndPoint2"));

		return res;
	}

	public Response Post_httpMethod_OutgoingJobOffer_Morethan80MBdocUploadSupportingDocument( String urikey, String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);


		Response res =	given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document1")
				.multiPart("fileName",new File("C:\\Users\\Rakhi Bansal\\Pictures\\Screenshots\\Screenshot (19).png"),"image/png")
				.when().headers(newHeaders)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("supportingdocExternalID")+pr.getProperty("SupportingDocEndPoint1")+"/"+pr.getProperty("SupportingDocOfferId")+pr.getProperty("SupportingDocEndPoint2"));

		return res;
	}
	public Response Post_httpMethod_OutgoingJobOffer_ChangingQuoteSentDetailsdocUploadSupportingDocument( String urikey, String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);


		Response res =	given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document1")
				.multiPart("fileName",new File("C:\\Users\\Rakhi Bansal\\Pictures\\Screenshots\\index1.jpg"), "image/jpeg")
				.when().headers(newHeaders)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("supportingdocExternalID")+pr.getProperty("SupportingDocEndPoint1")+"/"+pr.getProperty("docOfferId")+pr.getProperty("SupportingDocEndPoint2"));

		return res;
	}

	public Response Post_httpMethod_OutgoingJobOffer_100MBdocUploadSupportingDocument( String urikey, String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);


		Response res =	given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document2")
				.multiPart("fileName",new File("C:\\Users\\Rakhi Bansal\\Pictures\\Screenshots\\(R17A0528 ) Big Data Analytics Digital notes.pdf"),"application/pdf")
				.when().headers(newHeaders)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("supportingdocExternalID")+pr.getProperty("SupportingDocEndPoint1")+"/"+pr.getProperty("docOfferId")+pr.getProperty("SupportingDocEndPoint2"));

		return res;
	}
}