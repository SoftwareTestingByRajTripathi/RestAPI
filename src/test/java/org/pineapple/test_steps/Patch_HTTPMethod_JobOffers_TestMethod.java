package org.pineapple.test_steps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Patch_HTTPMethod_JobOffers_TestMethod {
	Properties pr;


	public Patch_HTTPMethod_JobOffers_TestMethod(Properties pr){
		this.pr=pr;
	}
	//verify that as an external platform User can update the details of an quotes sent
	/*
Patch_OfferCharge_ValidExternalBusinessID	1674126716406	1244
Patch_OfferCloseDate_ValidExternalBusinessID	1674126717652	1223
Patch_QoutesSent_AllMandatoryfieldJobOffer_ValidExternalBusinessID	1674126718878	1431
Patch_QoutesSent_JobOffer_ValidExternalBusinessID	1674126722741	1042
Patch_QoutesSent_OptionalfieldValuesJobOffer_ValidExternalBusinessID	1674126720316	1323
Patch_QoutesSent_ReadOnlyValuesJobOffer_ValidExternalBusinessID	1674126712565	1296
Patch_QoutesSent_WithoutMandatoryfieldJobOffer_ValidExternalBusinessID	1674126721642	1096
Patch_QuestionCloseDate_ValidExternalBusinessID	1674126713863	1224*/

	//InputParameters-Enter Job address, Title, Customer Name, Customer Contact Details, Job start date, Job Completion Date, Description, etc
	public Response Patch_Details_jobOffer_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///https://api.qa.subeez.com/api/v1//user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingStatusjobofferId"));
		return res;
	}
	////User can update all the mandatory field values details of an quotes sent
	public Response Patch_Details_jobOffer2_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///https://api.qa.subeez.com/api/v1//user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingStatus2jobofferId"));
		return res;
	}
	//User can not update all the field values without entering manadatory field values details of an quotes sent
	public Response Patch_Details_jobOffer3_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///https://api.qa.subeez.com/api/v1//user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingStatus_NullFieldvaluejobofferId"));
		return res;
	}

	public Response Patch_OptionalfieldValue_jobOffer_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///https://api.qa.subeez.com/api/v1//user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingStatus_OptionalFieldvaluejobofferId"));
		return res;
	}
	//User can not edit read only field details of an quotes sent
	//Ready only values (Can't edit) of these fields- Job Offer ID, (Response) Attachments, Response, Response (Estimated completion date), Bid Price Labour, Bid Price Materials, Response (Question), Response (Reply)
	public Response Patch_userReadOnlyValue_jobOffer_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///https://api.qa.subeez.com/api/v1//user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingStatus_OptionalFieldvaluejobofferId"));
		return res;


	}
	public Response Patch_QuestionCloseDate_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///https://api.qa.subeez.com/api/v1//user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingOfferQuestionCloseDate"));
		return res;
	}
	public Response Patch_OfferCloseDate_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///https://api.qa.subeez.com/api/v1//user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingOfferCloseDatejobofferId"));
		return res;
	}
	public Response Patch_chargeOption_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingChargejobofferId"));
		return res;
	}
	public Response Patch_CommitmentTimeout_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("externalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("OutgoingCommitmentTimeoutjobofferId"));
		return res;
	}
	public Response Patch_chargeOption_Draftoffer_AnOutgoing_JobOffer(String uriKey, String API_token, String bodydata){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				.body(bodydata)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}
				.patch(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("JobOfferexternalBusinessID")+pr.getProperty("Outgoing_Endpoint1joboffer")+pr.getProperty("DraftJobOfferID"));
		return res;
	}

}
