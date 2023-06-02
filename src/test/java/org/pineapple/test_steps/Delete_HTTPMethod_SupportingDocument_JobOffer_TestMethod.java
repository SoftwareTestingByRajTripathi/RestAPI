package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.Properties;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod {
	Properties pr;
	public Delete_HTTPMethod_SupportingDocument_JobOffer_TestMethod(Properties pr) {
		this.pr=pr;
	}
	//Code Status ---- OK----
	//This API allows a Business (functions a Contractor) to update supporting document when creating a Job Offer (quote)
	public Response Delete_httpMethod_OutgoingJobOffer_SupportingDocument( String urikey, String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);
		Response res =    given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document")
				.multiPart("fileName",new File("C:\\Users\\HimanshuP\\Pictures\\Screenshots\\Screenshot (1).png"),"image/png")
				.when().headers(newHeaders)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/supportingDocument/{docID}
				.delete(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID")+pr.getProperty("DeleteSupportingDocEndPoint1")+pr.getProperty("Delete_SupportingDocOfferId")+pr.getProperty("DeleteSupportingDocEndPoint2")+pr.getProperty("DeletedocID"));
		return res;
	}
	public Response Delete_httpMethod_InvalidExternalBusinessId_SupportingDocument( String urikey, String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);
		Response res =    given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document")
				.multiPart("fileName",new File("C:\\Users\\HimanshuP\\Pictures\\Screenshots\\Screenshot (1).png"),"image/png")
				.when().headers(newHeaders)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/supportingDocument/{docID}
				.delete(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("InvalidexternalBusinessID")+pr.getProperty("DeleteSupportingDocEndPoint1")+pr.getProperty("Delete_SupportingDocOfferId")+pr.getProperty("DeleteSupportingDocEndPoint2")+pr.getProperty("DeletedocID"));
		return res;
	}
	public Response Delete_httpMethod_InvalidJobofferId_SupportingDocument( String urikey, String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);
		Response res =    given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document")
				.multiPart("fileName",new File("C:\\Users\\HimanshuP\\Pictures\\Screenshots\\Screenshot (1).png"),"image/png")
				.when().headers(newHeaders)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/supportingDocument/{docID}
				.delete(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID")+pr.getProperty("DeleteSupportingDocEndPoint1")+pr.getProperty("Delete_invalidSupportingDocOfferId")+pr.getProperty("DeleteSupportingDocEndPoint2")+pr.getProperty("DeletedocID"));

		return res;
	}
	public Response Delete_httpMethod_InvalidexternalBusiness_InvalidJobofferId_SupportingDocument( String urikey, String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);
		Response res =    given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document")
				.multiPart("fileName",new File("C:\\Users\\HimanshuP\\Pictures\\Screenshots\\Screenshot (1).png"),"image/png")
				.when().headers(newHeaders)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/supportingDocument/{docID}
				.delete(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("InvalidexternalBusinessID")+pr.getProperty("DeleteSupportingDocEndPoint1")+pr.getProperty("Delete_invalidSupportingDocOfferId")+pr.getProperty("DeleteSupportingDocEndPoint2")+pr.getProperty("DeletedocID"));
		return res;
	}
	//Verify that user should not be able to remove a scope document if  user don't enter the docID/attach document
	public Response Delete_httpMethod_RemoveDocId_SupportingDocument( String urikey, String API_Token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Header objHeader2 = new Header("Content-Type","multipart/form-data");
		Headers newHeaders = new Headers(objHeader,objHeader2);
		Response res =    given()
				.contentType("multipart/form-data")
				.formParam("docTitle", "document")
				.multiPart("fileName",new File(""),"image/png")
				.when().headers(newHeaders)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/supportingDocument/{docID}
				.delete(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("externalBusinessID")+pr.getProperty("DeleteSupportingDocEndPoint1")+pr.getProperty("Delete_SupportingDocOfferId")+pr.getProperty("DeleteSupportingDocEndPoint2")+pr.getProperty("DocId"));

		return res;
	}
}
