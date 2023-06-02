package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;

import org.pineapple.test_steps.Post_httpMethod_QuoteDelete_TestMethod;
import io.restassured.response.Response;

//draftJobOffer
public class Post_QuoteDelete_TestScript {
	//This API is used to delete the Outgoing Job Offer (quote) for the contracting business....DraftState
	@Test()
	public  void Post_QuoteDelete() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http =new Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....WithdrawnJobOffer
	@Test(priority=1)
	public  void Post_QuoteDelete_Withdrawn() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http=new org.pineapple.test_steps.Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_WithDrawn("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....InvalidApiToken
	@Test(priority=2)
	public  void Post_QuoteDelete_InvalidApiToken() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		org.pineapple.test_steps.Post_httpMethod_QuoteDelete_TestMethod http=new org.pineapple.test_steps.Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer("QuoteDelete_Details", "Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.getStatusCode());
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....InvalidExternalId
	@Test(priority=3)
	public  void Post_QuoteDelete_InvalidExternalId() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		org.pineapple.test_steps.Post_httpMethod_QuoteDelete_TestMethod http=new org.pineapple.test_steps.Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_InvalidExternalId("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....InvalidQuoteId
	@Test(priority=4)
	public  void Post_QuoteDelete_InvalidJobQuoteId() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		org.pineapple.test_steps.Post_httpMethod_QuoteDelete_TestMethod http=new org.pineapple.test_steps.Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_InvalidJobQuoteId("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	//OpenJobOfferStatus
	@Test(priority=5)
	public  void Post_QuoteDelete_OpenStatus() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http=new Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_OpenQuoteStatus("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....Q&A Closed
	@Test(priority=6)
	public  void Post_QuoteDelete_QAClosedStatus() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http=new Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_QAStatus("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....Reviewing Status
	@Test(priority=7)
	public  void Post_QuoteDelete_ReviewingStatus() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http=new Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_OpenQuoteStatus("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	//AwardedJobOfferStatus
	@Test(priority=8)
	public  void Post_QuoteDelete_AwardedStatus() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http=new Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_AwardedQuoteStatus("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....ExpiredJobOfferStatus
	@Test(priority=9)
	public  void Post_QuoteDelete_ExpiredStatus() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http=new Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_ExpiredQuoteStatus("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}

	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....NotCommittedJobOfferStatus
	@Test(priority=10)
	public  void Post_QuoteDelete_NotCommittedStatus() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http=new Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_NotCommittedQuoteStatus("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	////This API is used to delete the Outgoing Job Offer (quote) for the contracting business....CommittedJobOfferStatus
	@Test(priority=12)
	public  void Post_QuoteDelete_CommittedStatus() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject =PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_QuoteDelete_TestMethod http=new Post_httpMethod_QuoteDelete_TestMethod(proObject);
		Response res=http.Post_httpMethod_QuoteDelete_JobOffer_CommittedQuoteStatus("QuoteDelete_Details", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
}
