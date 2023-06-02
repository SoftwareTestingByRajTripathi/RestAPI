package org.pineapple.testscripts;

import java.io.IOException;
import java.util.Properties;

import org.pineapple.test_steps.Get_HTTPMethod_An_IncomingJobofferDetails_TestSteps;
import org.pineapple.utility.Constant;
import org.pineapple.utility.PropertiesRead;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Get_An_Incoming_jobofferDetails_API {
	@Test(priority=1)
	public void Get_An_IncomingJobofferDetails_ValidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_An_IncomingJobofferDetails_TestSteps http = new Get_HTTPMethod_An_IncomingJobofferDetails_TestSteps(proObject);
	Response res=	http.Get_Details_An_Incoming_JobOffer("AnIncomingJobOffer","QA_token");
	System.out.println(Constant.Response_Status_code);
    System.out.println(res.statusCode());
    System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(200,res.getStatusCode());
	}
	@Test(priority=2)
	public void Get_An_IncomingJobofferDetails_InvalidExternalBusinessID() throws IOException{
		String basePath = System.getProperty("user.dir");
		Properties proObject = 	PropertiesRead.readPropertyFile(basePath +Constant.URI_FILE_PATH);
		Get_HTTPMethod_An_IncomingJobofferDetails_TestSteps http = new Get_HTTPMethod_An_IncomingJobofferDetails_TestSteps(proObject);
	Response res= http.Get_Details_An_Incoming_JobOffer_InvalidExternalID("AnIncomingJobOffer","QA_token");
	System.out.println(Constant.Response_Status_code);
    System.out.println(res.statusCode());
    System.out.println(Constant.Response_Data);
		System.out.println(res.asString());
		Assert.assertEquals(400,res.getStatusCode());
	}
	

}
