package org.pineapple.test_steps;

//Code- Status - OK
import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps {
	Properties pr;

	public Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(Properties pr){
		this.pr=pr;
	}
	//User can view the activity of creating Outgoing job Offer-"JobOfferCreated"
	public Response Get_Details_Activity_AnOutgoing_JobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_jobofferID")+"/activityTimeline");
		return res;
	}
	//User can view the activity of updating Outgoing "Draft" job Offer-"JobOfferUpdated"
	public Response Get_Details_Activity_AnOutgoing_DraftJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_DraftjobofferID")+"/activityTimeline");
		return res;
	}
	//User can view the activity of Offer place on Market from "Draft" job Offer- "PlaceOnMarket"
	public Response Get_Details_Activity_AnOutgoing_DraftToPlaceOnMarketJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_PlaceOnMarketDraftjobofferID")+"/activityTimeline");
		return res;
	}
	//User can view the activity to update Open Offer details-"JobOfferUpdated"
	public Response Get_Details_Activity_AnOutgoing_UpdatedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_UpdatedjobofferID")+"/activityTimeline");
		return res;

	}
	public Response Get_Details_Activity_AnOutgoing_SupportingDocumentAddedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_ADDSupportingDocumentjobofferID")+"/activityTimeline");
		return res;

	}
	public Response Get_Details_Activity_AnOutgoing_SupportingDocumentRemovedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_RemoveSupportingDocumentjobofferID")+"/activityTimeline");
		return res;

	}
	public Response Get_Details_Activity_AnOutgoing_withdrawnJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_WithdrawnjobofferID")+"/activityTimeline");
		return res;

	}
	public Response Get_Details_Activity_AnOutgoing_QuestionStatus_JobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_QuestionStatusjobofferID")+"/activityTimeline");
		return res;

	}

	public Response Get_Details_Activity_AnOutgoing_RepliedParticipantJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_RepliedParticipantstatusjobofferID")+"/activityTimeline");
		return res;


	}
	public Response Get_Details_Activity_AnOutgoing_JobOfferDeclined(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_DeclinedjobofferID")+"/activityTimeline");
		return res;


	}

	public Response Get_Details_Activity_AnOutgoing_JobOfferWithdrawn(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_WithdrawnjobofferID")+"/activityTimeline");
		return res;


	}
	public Response Get_Details_Activity_AnOutgoing_AwardedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_AwardedjobofferID")+"/activityTimeline");
		return res;



	}
	public Response Get_Details_Activity_AnOutgoing_QAClosedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_QAClosedjobofferID")+"/activityTimeline");
		return res;



	}
	public Response Get_Details_Activity_AnOutgoing_OfferClosedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_OfferClosedjobofferID")+"/activityTimeline");
		return res;



	}
	public Response Get_Details_Activity_AnOutgoing_PaticipantCommittedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_PaticipantCommittedjobofferID")+"/activityTimeline");
		return res;



	}
	public Response Get_Details_Activity_AnOutgoing_ExpiredJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_ExpiredjobofferID")+"/activityTimeline");
		return res;



	}
	public Response Get_Details_Activity_AnOutgoing_UpdatedJobJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_UpadtedJobjobofferID")+"/activityTimeline");
		return res;
	}
	public Response Get_Details_Activity_AnOutgoing_JobStartedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_StartedJobjobofferID")+"/activityTimeline");
		        
		
		return res;


	}
	//User can view the activity to Start field work (other field staff)

	public Response Get_Details_Activity_AnOutgoing_StartFieldWorkJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_StartFieldWorkjobofferID")+"/activityTimeline");
		return res;


	}
	//User can view the history of activity of "Offer Delete"- 
	public Response Get_Details_Activity_AnOutgoing_deletedJobOffer(String uriKey,String API_token){
		Header objHeader = new Header("Authorization",pr.getProperty(API_token));
		Response res =	given().contentType(ContentType.JSON)
				.when()
				.header(objHeader)
				///user/external/{externalBusinessID}/jobOffers/outgoing/{jobOfferID}/activityTimeline
				.get(pr.getProperty("baseURI")+pr.getProperty(uriKey)+pr.getProperty("ActivityTimelineexternalBusinessID")+pr.getProperty("EndPointAnOutgoing_Offer")+pr.getProperty("Outgoing_DeletedjobofferID")+"/activityTimeline");
		return res;


	}

}

