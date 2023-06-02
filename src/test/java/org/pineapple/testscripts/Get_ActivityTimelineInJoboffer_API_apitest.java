package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.pineapple.test_steps.Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps;

import io.restassured.response.Response;

//Code-- OK---
public class Get_ActivityTimelineInJoboffer_API_apitest {
	//User can view the activity of creating Outgoing job Offer-"JobOfferCreated"
	@Test(priority=0)
	public void GetActivityTimelineInJoboffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_JobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of updating Outgoing "Draft" job Offer-"JobOfferUpdated"
	@Test(priority=1)
	public void GetActivityTimelineInDraftJoboffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_DraftJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of Offer place on Market from "Draft" job Offer- "PlaceOnMarket"
	@Test(priority=2)
	public void GetActivityTimelineInDraftJoboffertopPlaceOnMarket_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_DraftToPlaceOnMarketJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}  
	//User can view the activity to update Open Offer details-"JobOfferUpdated"
	@Test(priority=3)
	public void GetActivityTimelineInUpdatedJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_UpdatedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of adding Scope of Work documents-"SupportingDocumentAdded"
	@Test(priority=4)
	public void GetActivityTimeSupportingDocumentAddedJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_SupportingDocumentAddedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of removing Scope of Work documents-"SupportingDocumentRemoved"
	@Test(priority=5)
	public void GetActivityTimeSupportingDocumentRemovedJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_SupportingDocumentRemovedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of Offer withdrawn from Market-"Withdrawn"
	@Test(priority=6)
	public void GetActivityTimelineWithdrawnJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_withdrawnJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of "Ask Question" by Participants"-"JobOfferQuestionAsked"
	//User can view the activity of Answer removed by recepient business- "JobOfferQuestionDeleted"
	//User can view the activity of "Answer edited by recepient business-"JobOfferQuestionUpdated"
	@Test(priority=7)
	public void GetActivityTimelineQuestion_JobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_QuestionStatus_JobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}


	//User can view the activity of "Offer declined by Participants"-"ParticipantDeclined"
	@Test(priority=8)
	public void GetActivityTimelineDeclineJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_JobOfferDeclined("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}

	//User can view the activity of "Response withdrawn by Participants"-"ParticipantWithdrawn"
	@Test(priority=9)
	public void GetActivityTimelineParticipatWithdrawnJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http. Get_Details_Activity_AnOutgoing_JobOfferWithdrawn("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of awarded job offer.-"Awarded",
	//User can view the activity of awarded job offer, by changing the awardee among the assigned participants-"Awarded",
	@Test(priority=10)
	public void GetActivityTimelineParticipatAwardedJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_AwardedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of Offer Q&A Close-"Q&A Closed"
	@Test(priority=11)
	public void GetActivityTimelineParticipatQAClosedJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +"\\src\\main\\java\\Resources\\URI.properties");
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_QAClosedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of "Offer Close"- "Offer Closed"
	@Test(priority=12)
	public void GetActivityTimelineOfferClosedJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_OfferClosedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the history of activity of "Offer Committed"-  "ParticipantCommitted"
	//User can view the history of activity of "Offer Not Committed"  "ParticipantUnableToCommit"
	@Test(priority=13)
	public void GetActivityTimelineParticipantCommittedJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_PaticipantCommittedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the history of activity of "Offer Expired"-"Offer Expired"
	@Test(priority=14)
	public void GetActivityTimelineexpiredJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_ExpiredJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the activity of updating Outgoing  "Field Ready" job-"JobUpdated"
	//User can view the activity of updating Outgoing  "Field Started" job-"JobUpdated"
	//User can view the activity of updating Outgoing  "Field Complete" job-"JobUpdated"
	//Verify that as an External Platform User can view the activity of updating Outgoing  "Job Complete"
	//Verify that as an External Platform User can view the activity of creating Awarded job from quote-"NewJobCreated".Actual Result-"ParticipantCommitted"
	@Test(priority=15)
	public void GetActivityTimelineUpdatedJobsJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_UpdatedJobJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	
//User can view the activity of updating Outgoing "Draft" job -"JobOfferUpdated"
	@Test(priority=16)
	public void GetActivityTimelineJobUpdatedJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_JobStartedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
//User can view the activity to Start field work (First field staff)-"FieldStarted"//
	@Test(priority=17)
	public void GetActivityTimelineStartFieldWorkJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_StartFieldWorkJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	//User can view the history of activity of "Offer Delete"- "JobOfferDeleted"//
	@Test(priority=18)
	public void GetActivityTimelineDeleetdJobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps http = new Get_HTTPMethod_GetActivityTimelineofJoboffer_TestSteps(proObject);
		Response res=	http.Get_Details_Activity_AnOutgoing_deletedJobOffer("AnOutgoingcomingJobOffer","QA_Token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
			System.out.println(res.asString());
			Assert.assertEquals(200,res.getStatusCode());
	}
	}

