package org.pineapple.testscripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Properties;
import org.pineapple.test_steps.Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod;
import org.pineapple.utility.Constant;

import io.restassured.response.Response;  

public class Post_OutgoingJobOffer_SupportingDoc_TestScript {
	//This API allows a Business (functions a Contractor) to provide supporting document when creating a Job Offer (quote)
	@Test(priority=0)
	public  void Post_OutgoingJobOffer_SupportingDoc() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		org.pineapple.test_steps.Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod http=new org.pineapple.test_steps.Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod(proObject);
		Response res =http.Post_httpMethod_OutgoingJobOffer_UploadSupportingDocument("SupportingDocDetails", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		AssertJUnit.assertEquals(200,res.getStatusCode());
	}
	//This API allows a Business (functions a Contractor) to provide supporting document when creating a Job Offer (quote).....MoreThan80KBSupportingDoc
	@Test(priority=1)
	public  void Post_OutgoingJobOffer_MoreThan80KBSupportingDoc() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod http=new org.pineapple.test_steps.Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod(proObject);
		Response res =http.Post_httpMethod_OutgoingJobOffer_Morethan80MBdocUploadSupportingDocument("SupportingDocDetails", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		AssertJUnit.assertEquals(200,res.getStatusCode());
	}
	//This API allows a Business (functions a Contractor) to provide supporting document when creating a Job Offer (quote).....ChangingQuoteDetailsSupportingDoc
	@Test(priority=2)
	public  void Post_OutgoingJobOffer_ChangingQuoteDetailsSupportingDoc() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod http=new org.pineapple.test_steps.Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod(proObject);
		Response res =http.Post_httpMethod_OutgoingJobOffer_ChangingQuoteSentDetailsdocUploadSupportingDocument("SupportingDocDetails", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		AssertJUnit.assertEquals(200,res.getStatusCode());
	}
	//This API allows a Business (functions a Contractor) to provide supporting document when creating a Job Offer (quote).....100MBDetailsSupportingDoc
	@Test(priority=3)
	public  void Post_OutgoingJobOffer_100MBDetailsSupportingDoc() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	org.pineapple.utility.PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod http=new org.pineapple.test_steps.Post_httpMethod_OutgoingJobOffer_SupportingDoc_TestMethod(proObject);
		Response res =http.Post_httpMethod_OutgoingJobOffer_100MBdocUploadSupportingDocument("SupportingDocDetails", "QA_Token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		AssertJUnit.assertEquals(200,res.getStatusCode());
	}

}
