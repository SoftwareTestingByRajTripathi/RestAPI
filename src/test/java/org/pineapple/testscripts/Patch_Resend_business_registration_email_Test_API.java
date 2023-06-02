package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Patch_HTTPMethod_ResendBusinessRegistration_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Patch_Resend_business_registration_email_Test_API {
	@Test(priority=0)
	//1--This method use for resend registration email to invited business---//
	public void resendBusinessRegistrationwithInvitedBusiness() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath+Constant.URI_FILE_PATH);
		Patch_HTTPMethod_ResendBusinessRegistration_TestSteps http = new Patch_HTTPMethod_ResendBusinessRegistration_TestSteps(proObject);
		Response res=	http.ResendBusiness_registrationEmail("ResendBusinessRegistration_API", "QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.statusCode());
	}
	@Test(priority=1)
	//2--This method use for resend registration email to Registered business---//
	public void resendBusinessRegistrationwithRegistratedBusiness() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath+Constant.URI_FILE_PATH);
		Patch_HTTPMethod_ResendBusinessRegistration_TestSteps http = new Patch_HTTPMethod_ResendBusinessRegistration_TestSteps(proObject);
		Response res=	http.ResendBusiness_registrationEmail1("ResendBusinessRegistration_API", "QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());
	}
	@Test(priority=2)
	//3--This method use for resend registration email to Invalid external businessID---//
	public void resendBusinessRegistrationwithInvalidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath+Constant.URI_FILE_PATH);
		Patch_HTTPMethod_ResendBusinessRegistration_TestSteps http = new Patch_HTTPMethod_ResendBusinessRegistration_TestSteps(proObject);
		Response res=	http.ResendBusiness_registrationEmail2("ResendBusinessRegistration_API", "QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.statusCode());
	}
	@Test(priority=3)
	//4--This method use for resend registration email to Invalid Token---//
	public void resendBusinessRegistrationwithInvalidToken() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath+Constant.URI_FILE_PATH);
		Patch_HTTPMethod_ResendBusinessRegistration_TestSteps http = new Patch_HTTPMethod_ResendBusinessRegistration_TestSteps(proObject);
		Response res=	http.ResendBusiness_registrationEmail2("ResendBusinessRegistration_API", "Inavalid-QAToken");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(401,res.statusCode());
	}

}
