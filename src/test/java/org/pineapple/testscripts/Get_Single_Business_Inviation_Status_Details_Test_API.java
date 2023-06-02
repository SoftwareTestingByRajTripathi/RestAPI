package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_Single_Business_Inviation_Status_Details_Test_API {
	@Test(priority=0)
	public void GetSingleBusinessInvitationDetails_RegisteredBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps http = new Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps(proObject);
		Response res=	http.Get_Single_BusinessInvitation("Single_Business_invitation","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200, res.statusCode());
	}
	@Test(priority=1)
	public void GetSingleBusinessInvitationDetails_InvaildBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps http = new Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps(proObject);
		Response res=	http.Get_Single_BusinessInvitation_Invaild_BusinessID("Single_Business_invitation","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400, res.statusCode());
	}
	@Test(priority=2)
	public void GetSingleBusinessInvitationDetails_InvitedBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps http = new Get_HTTPMethod_GetBusinessInvitationStatus_TestSteps(proObject);
		Response res=	http.Get_Single_BusinessInvitation_Inviated_BusinessID("Single_Business_invitation","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200, res.statusCode());
	}

}
