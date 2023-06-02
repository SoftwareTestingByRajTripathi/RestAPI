package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Patch_HTTPMethod_UpdateSupportingDocument_joboffer_TestMethod;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Patch_UpdateSupportingDocumnet_InjobOffer_API {
	@Test(priority=1)
	public void UpdateSupportingDoumentsInjobOffer_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath+Constant.URI_FILE_PATH);
		Patch_HTTPMethod_UpdateSupportingDocument_joboffer_TestMethod http = new Patch_HTTPMethod_UpdateSupportingDocument_joboffer_TestMethod(proObject);
		Response res=	http.Patch_httpMethod_OutgoingJobOffer_UpdateSupportingDocument("Add_SupportingDoument","QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	@Test(priority=2)
	public void UpdateSupportingDoumentsInjobOffer_InvalidExternalBusinessID() throws IOException{	
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath+Constant.URI_FILE_PATH);
		Patch_HTTPMethod_UpdateSupportingDocument_joboffer_TestMethod http = new Patch_HTTPMethod_UpdateSupportingDocument_joboffer_TestMethod(proObject);
		Response res=	http.Patch_httpMethod_OutgoingJobOffer_UpdateSupportingDocument("Add_SupportingDoument","QA_token");
		System.out.println(Constant.Response_Status_code);
		System.out.println(res.statusCode());
		System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}


}
