package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Post_HTTPMethod_PostJoboffer_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Post_JobOffer_Test_API {
	@Test()
	public void Post_JobOffer_WithAllParameter() throws IOException {

		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"QuoteSent_AllParameter.json");
		Post_HTTPMethod_PostJoboffer_TestSteps http = new Post_HTTPMethod_PostJoboffer_TestSteps(proObject);
		Response res =    http.Post_JobOffer(bodydata,"CreateJobOffer_API","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}	@Test(priority=2)
	public void Post_JobOffer_WithAllParameter_InvalidToken() throws IOException {
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"QuoteSent_AllParameter.json");
		Post_HTTPMethod_PostJoboffer_TestSteps http = new Post_HTTPMethod_PostJoboffer_TestSteps(proObject);
		Response res =    http.Post_JobOffer(bodydata,"CreateJobOffer_API","Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.getStatusCode());
	}
	@Test(priority=3)
	public void Post_JobOffer_MandateParameter() throws IOException {
		
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Joboffer_Mandate.json");
		Post_HTTPMethod_PostJoboffer_TestSteps http = new Post_HTTPMethod_PostJoboffer_TestSteps(proObject);
		Response res =    http.Post_JobOffer(bodydata,"CreateJobOffer_API","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
		}
	@Test(priority=4)
	public void Post_JobOffer_PassInvalid_ExternalBusinessID() throws IOException {
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Joboffer_Mandate.json");
		Post_HTTPMethod_PostJoboffer_TestSteps http = new Post_HTTPMethod_PostJoboffer_TestSteps(proObject);
		Response res =    http.Post_JobOffer_Invalid_ExternalBusinessID(bodydata,"CreateJobOffer_API","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
		
		}
	@Test(priority=5)

	public void Post_JobOffer_PassBlankData_ValidExternalBusinessID() throws IOException {

		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"PassBlankData_QuoteSent.json");
		Post_HTTPMethod_PostJoboffer_TestSteps http = new Post_HTTPMethod_PostJoboffer_TestSteps(proObject);
		Response res =    http.Post_JobOffer(bodydata,"CreateJobOffer_API","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());

	}
	@Test(priority=6)
	public void Post_JobOffer_500Char_JobTitle_ValidExternalBusinessID() throws IOException {

		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"500Char_Jobtitle.json");
		Post_HTTPMethod_PostJoboffer_TestSteps http = new Post_HTTPMethod_PostJoboffer_TestSteps(proObject);
		Response res =    http.Post_JobOffer_500Char_JObTitle_valid_ExternalBusinessID(bodydata,"CreateJobOffer_API","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());

	}

}
