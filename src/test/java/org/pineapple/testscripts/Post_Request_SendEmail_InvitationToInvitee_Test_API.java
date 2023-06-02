package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Post_HTTPMethod_PostEmailInvitation_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.JsonRead;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Post_Request_SendEmail_InvitationToInvitee_Test_API {
	@Test(priority=0)
	//1-This method used for send email invitation to Registered business-//
	public void EmailInvitationWithRegisteredBusiness() throws IOException {
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Send_Email_Invitation.json");
		Post_HTTPMethod_PostEmailInvitation_TestSteps http = new Post_HTTPMethod_PostEmailInvitation_TestSteps(proObject);
		Response res =    http.PostRequest_EmailInvitationWithRegisteredBusiness(bodydata,"EmailInvitation_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
	    System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.statusCode());

	}
	@Test(priority=1)
	//2-This method used for send email invitation to Invited business-//
	public void EmailInvitationwithInvitedBusiness() throws IOException {
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"Send_Email_Invitation.json");

		Post_HTTPMethod_PostEmailInvitation_TestSteps http = new Post_HTTPMethod_PostEmailInvitation_TestSteps(proObject);
		Response res =    http.PostRequest_EmailInvitationWithInvitedBusiness(bodydata,"EmailInvitation_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
	    System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());

	}
	@Test(priority=2)
	//3-This method used for send email invitation with blank invitee in invitee list-//
	public void EmailInvitationwithBlankInvitee() throws IOException {
		String basePath = System.getProperty("user.dir");
		Properties proObject = PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		String bodydata= JsonRead.ReadJsonData(basePath +Constant.JSON_FILE_PATH+"SendEmailInvitation_Blank_Invite.json");
		Post_HTTPMethod_PostEmailInvitation_TestSteps http = new Post_HTTPMethod_PostEmailInvitation_TestSteps(proObject);
		Response res =    http.PostRequest_EmailInvitationWithRegisteredBusiness(bodydata,"EmailInvitation_API","QA_token");
		System.out.println(Constant.Response_Status_code+res.statusCode());
	    System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());

	}



}
