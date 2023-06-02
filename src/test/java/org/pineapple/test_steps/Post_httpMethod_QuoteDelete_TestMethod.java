package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Post_httpMethod_QuoteDelete_TestMethod {
	Properties pr;
	public Post_httpMethod_QuoteDelete_TestMethod(Properties pr) {

		this.pr=pr;
	}
	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....Draft state
	public Response Post_httpMethod_QuoteDelete_JobOffer(String urikey, String API_Token)
	{
		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("DraftQuoteOfferId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}
	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....Withdrawn state
	public Response Post_httpMethod_QuoteDelete_JobOffer_WithDrawn(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("WithdrawnQuoteOfferId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}
	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....Withdrawn state
	public Response Post_httpMethod_QuoteDelete_JobOffer_InvalidExternalId(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("invalid_externalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("OfferId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}

	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....InvalidJobQuoteId
	public Response Post_httpMethod_QuoteDelete_JobOffer_InvalidJobQuoteId(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("InvalidOfferId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}
	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....OpenQuoteStatus
	public Response Post_httpMethod_QuoteDelete_JobOffer_OpenQuoteStatus(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("OpenQuoteId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....Q&A Closed
	public Response Post_httpMethod_QuoteDelete_JobOffer_QAStatus(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("Q&AClosedId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;


	}
	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....Reviewing Status
	public Response Post_httpMethod_QuoteDelete_JobOffer_ReviewingStatus(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("ReviewingStatus")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;


	}

	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....AwardedQuoteState
	public Response Post_httpMethod_QuoteDelete_JobOffer_AwardedQuoteStatus(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("AwardedStatusId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}

	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....ExpiredQuoteStatus
	public Response Post_httpMethod_QuoteDelete_JobOffer_ExpiredQuoteStatus(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("ExpiredExternalID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("ExpiredStatusJobID")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}

	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....NotCommittedState
	public Response Post_httpMethod_QuoteDelete_JobOffer_NotCommittedQuoteStatus(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("NotCommittedStatusId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}

	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....CommittedQuoteStatus
	public Response Post_httpMethod_QuoteDelete_JobOffer_CommittedQuoteStatus(String urikey, String API_Token)
	{

		Header objHeader = new Header("Authorization",pr.getProperty(API_Token));
		Response res =	given()
				.contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.post(pr.getProperty("baseURI")+pr.getProperty(urikey)+"/"+pr.getProperty("AwardedExtrenalBusinessID")+pr.getProperty("QuoteDelete_EndPoint1")+"/"+pr.getProperty("CommittedStatusId")+pr.getProperty("QuoteDelete_EndPoint2"));
		return res;
	}
}