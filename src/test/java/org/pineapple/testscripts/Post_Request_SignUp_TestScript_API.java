package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Post_HTTPMethod_SignUP_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Post_Request_SignUp_TestScript_API {
	@Test(priority=0)
	//1--This test verify signup functionality with all parameter---//
	public void SignUpwithAllParameter() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
	        String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUP_Pass_All_Parameter.json");	
		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
	Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
	System.out.println(Constant.Response_Status_code+res.statusCode());
    System.out.println(Constant.Response_Data);
	System.out.println(res.asString());
	Assert.assertEquals(200,res.statusCode());
	
	}
	@Test(priority=1)
	//2--This test verify signup functionality with same Invitee Email---//
	public void SignUpwithSameInviteeEmail() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_PassSameInviteeEmail.json");	
		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
	Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
	System.out.println(Constant.Response_Status_code+res.statusCode());
    System.out.println(Constant.Response_Data);
	System.out.println(res.asString());
	Assert.assertEquals(200,res.statusCode());
	
	}
	@Test(priority=2)
	//3--This test verify signup functionality with Blank parameter---//
	public void SignUpwithBlankParameter() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUP_Blank_Prameter.json");
		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
		Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());

	}
	@Test(priority=3)
	//4--This test verify signup functionality with all Invalid parameter---//
	public void SignUpwithInvalidParameter() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUP_PassInvalidEmail_ID.json");
		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
		Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());

	}
	@Test(priority=4)
	//5--This test verify signup functionality with Invalid parameter---//
	public void SignUpwithInvalidToken() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUP_PassMandatoryParameter.json");

		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
		Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.statusCode());
	}
	@Test(priority=5)
	//6--This test verify signup functionality with PassMandate Parameter witout Countrycode---//
	public void SignUpPassMandateParameterwitoutCountrycode() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUP_Pass_blank_CountryCode.json");

		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
		Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());

	}
	@Test(priority=6)
	//7--This test verify signup functionality with Pass All Mandate Parameter---//
	public void SignUpwithAllMandateParameter() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUP_PassMandatoryParameter.json");

		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
		Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.statusCode());

	}
	@Test(priority=7)
	//8--This test verify signup functionality with Pass Only BusinessName---//
	public void SignUpPassOnlyBusinessName() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUP_OnlyBusinessName.json");

		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
		Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());

	}
	@Test(priority=8)
	//9--This test verify signup functionality with Pass Only Countrycode---//
	public void SignUpPassOnlyCountrycode() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUP_PassOnlyCountryCode.json");

		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
		Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());

	}
	@Test(priority=9)
	//10--This test verify signup functionality with Pass Only Email---//
	public void SignUpOnlyEmail() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_OnlyEmail.json");
		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
		Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());

	}
	@Test(priority=10)
	//11--This test verify signup functionality with Verified Email address---//
	public void SignUpPassVerifiedEmailaddress() throws IOException {
		String basePath = System.getProperty("user.dir");
		 Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		 String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SignUp_PassVerifiedEmail.json");	
		Post_HTTPMethod_SignUP_TestSteps http = new Post_HTTPMethod_SignUP_TestSteps(proObject);
	Response res =    http.PostRequest_SignUP_API(bodydata,"SignUP_API","QA_token");
	System.out.println(Constant.Response_Status_code+res.statusCode());
    System.out.println(Constant.Response_Data);
	System.out.println(res.asString());
	Assert.assertEquals(200,res.statusCode());
	
	}




}
