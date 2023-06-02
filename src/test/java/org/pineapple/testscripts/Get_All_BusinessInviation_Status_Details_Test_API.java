package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.pineapple.test_steps.Get_HTTPMethod_GetAllBusinessInvitationStatus_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_All_BusinessInviation_Status_Details_Test_API {
	@Test(priority=0)
	public void Get_All_BusinessInviation_Status_validExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetAllBusinessInvitationStatus_TestSteps http = new Get_HTTPMethod_GetAllBusinessInvitationStatus_TestSteps(proObject);
		Response res=	http.Get_AllBusinessInvitation("AllBusiness_Invitaion","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.statusCode());
	}
	@Test(priority=1)
	public void Get_All_BusinessInviation_Status_InvalidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_GetAllBusinessInvitationStatus_TestSteps http = new Get_HTTPMethod_GetAllBusinessInvitationStatus_TestSteps(proObject);
		Response res=	http.Get_AllBusinessInvitation("AllBusiness_Invitaion","QA_token");
		System.out.println(Constant.Response_Status_code);
        System.out.println(res.statusCode());
        System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.statusCode());
	}


}
